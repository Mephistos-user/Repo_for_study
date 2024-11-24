type IUser = {
    id: number;
    name: string;
}

class User {
    user: IUser[]
    constructor() {
        this.user = [{
            id: 1,
            name: 'Test'
        }]
    }

    /** Асинхронный метод, который возвращает результат через 500 мс (эмуляция долгого асинхронного HTTP-запроса) */
    @log()
    @enumerable(false)
    async getUser(key: keyof IUser, val: string | number): Promise<IUser | undefined> {
        const response: IUser | undefined = await new Promise((resolve, reject) => {
            setTimeout(() => {
                resolve(this.user.find((elem: IUser) => elem[key] === val))
            }, 500)
        })
        return response;
    }

    /** Синхронный метод, который возвращает результат сразу */
    @log()
    @enumerable(false)
    getUserSync(key: keyof IUser, val: string | number): IUser | undefined {
        return this.user.find((elem: IUser) => elem[key] === val);
    }
}

function log() {
    return (
        target: Object,
        propertyName: string,
        descriptor: TypedPropertyDescriptor<(...args: any[]) => any>
    ) => {
        console.log('target ', target); // [LOG]: "target", User: {}
        console.log('propertyKey ', propertyName); // [LOG]: "propertykey", "getUser"
        console.log('descriptor ', descriptor); // [LOG]: "descriptor", {writable: true, enumerable: false, configurable: true}

        console.log('descriptor.value', descriptor.value); // Вернет исходный (задекорированный) метод     async getUser(key, val) {}

        const method = descriptor.value;
        if(!method) return descriptor;

        const isAsync = method.constructor.name === "AsyncFunction"; // Определяем, что декорируемый метод асинхронный или синхронный

        if(isAsync) {
            descriptor.value = async function(...args) { // подменяем исходный (задекорированный) метод своим
                // console.log('args2 ', args); // [LOG]: "args", ["id", 1]
                const startTime = new Date().getTime(); // вычисляем исходное время до вызова функции

                const result = await method.apply(this, args); // вызываем исходный (задекорированный) метод

                const endTime = new Date().getTime(); // вычисляем текущее время после вызова функции

                const a = args.map((arg: any) => JSON.stringify(arg)).join(); // собираем строку с аргументами, переданными функции
                const r = JSON.stringify(result); // собираем строку с результатом функции
                console.log(`Call executed in ${endTime - startTime}ms: ${propertyName}(${a}) => ${r}`);
                // [LOG]: "Call executed in 500ms: getUser("id", 1) = > {"id": 1, "name": "Test"}"

                return result;
            };
        } else {
            descriptor.value = function(...args) { // подменяем исходный (задекорированный) метод своим
                // console.log('args1 ', args); // [LOG]: "args", ["id", 1]
                const startTime = new Date().getTime(); // вычисляем исходное время до вызова функции

                const result = method.apply(this, args); // вызываем исходный (задекорированный) метод

                const endTime = new Date().getTime(); // вычисляем текущее время после вызова функции

                const a = args.map((arg: any) => JSON.stringify(arg)).join(); // собираем строку с аргументами, переданными функции
                const r = JSON.stringify(result); // собираем строку с результатом
                console.log(`Call executed in ${endTime - startTime}ms: ${propertyName}(${a}) => ${r}`);
                // [LOG]: "Call executed in 0ms: getUserSync("id", 1) => {"id": 1, "name": "Test"}
                
                return result;
            };
        
        }

        return descriptor;
    };
}

function enumerable(value: boolean) {
    return function (target: any, propertyKey: string, descriptor: PropertyDescriptor) {
        descriptor.enumerable = value;
    };
}

const user = new User();


// Тестирование
const test1 = user.getUser('id', 1)
const test2 = user.getUserSync('id', 1)
/**
 * [LOG]: "Call executed in 0ms: getUserSync("id", 1) => {"id": 1, "name": "Test"}
 * [LOG]: "Call executed in 510ms: getUser("id", 1) = > {"id": 1, "name": "Test"}"
 */

test1.then(res => console.log('test1', res))

console.log('test2', test2)

/**
 * [LOG]: "test2", {
 *      "id": 1,
 *      "name": "Test"
 * }
 * [LOG]: "test1", {
 *      "id": 1,
 *      "name": "Test"
 * }
 */