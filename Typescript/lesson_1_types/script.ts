/**
* ПримитивыЖ string, number, boolean
*
* string представляет из себя строки вроде "Hello, world!"
* number цифры и числа
* boolean - true/false
*/

const str1: string = "Hello, world!";
const str2: string = '';
const str3: string = '123';

const intNumber: number = 23;
const floatNumber: number = 3.14;


const isTrue: boolean = true;
const isFalse: boolean = false;
const boolean1: boolean = 3 < 2;
const boolean2: boolean = 3 < 2 || !!0;

/**
 * Массивы могут записываться как number[] или Array<number>
*/

const numbersArray: number[] = [1, 2, 3, 4, 5];
const numbersArray2: Array<number> = [1, 2, 3, 4, 5];

/**
 * Так же могут быть строки и любые другие примитивы
 */

const strArray: string[] = ['Hello', 'world'];
const strArray2: Array<string> = ['Hello', 'world'];

const mixedArray1: (string | number)[] = ['Hello', 1, 2, 3];
const mixedArray2: (string | number | boolean)[] = ['Hello', 1, true, 2.3];

const booleanArray1: Array<boolean> = [true, false, 1 ===1];
const booleanArray2: Array<boolean> = [true, false, true || false];

/**
 * типы Any vs unknown- специальные служебные тип означает "любой тип" - детипизация.
 * unknown - более строгий тип чем any
 */

let anyVar: any = 10;
anyVar = 'Hello, world!';
anyVar = true;
anyVar = numbersArray;

let anyObj: any = 'afdsfsag';
let unknownObj: unknown;

unknownObj = '12345';

const someObj: string = anyObj; // можно сочитать
// const someUnknoun: string = unknownObj; // нельзя сочитать

/**
 * Неявный any
 * noImplicitAny: true в tsconfig.json запрещает нам неявные any
 */
function f3(a) {
    console.log(a)
}
/**
 * с явным any проблем нет
 */
function f4(a: any) {
    console.log(a)
}

/**
 * void - 
 */

function f5(): void {
    console.log('Функция f5 с выходным типом void - не возвращает ничего')
}
function f6(a: string): void {
    console.log('Функция f6 с входным типом string и с выходным типом void - не возвращает ничего')
}
function f7(a: string): void {
    console.log('Функция f7 с входным типом string и с выходным типом void - не возвращает ничего')
    return;
}
// function f8(a: string): string {
//     console.log('Функция f8 с входным типом string и с выходным типом string - ДОЛЖНА возвращать строку (return), но не возвращает ничего')
// }
function f9(a: string): string {
    console.log('Функция f9 с входным типом string и с выходным типом string - возвращает строку')
    return a;
}
function f10(a: number): string {
    console.log('Функция f10 с входным типом number и с выходным типом string - принимает number, конвертирует в string и возвращает строку')
    return a.toString();
}

/**
 * undefined, null
 */

let undefVar: undefined;
let nullVar: null;

// undefVar = 'test'; // undefined не сочетается с другими типами

let someUndefined1: undefined = undefined;
// let someUndefined2: undefined = null; // undefined не сочетается с другими типами
// let someUndefined3: undefined = 0; // undefined не сочетается с другими типами

let someNull1: null;
someNull1 = null;
// someNull1 = undefined; // null не сочетается с другими типами
// someNull1 = 0; // null не сочетается с другими типами
// someNull1 = false; // null не сочетается с другими типами


/**
 * объекты
 */
let myObject1: object = {} // object (с маленькой буквы) - используется для задания объекта
myObject1 = []

let myObject2: Object = {} // Object (с большой буквы) - служебный класс Typescript
myObject2 = []

/**
 * типы-объекты
 */

function printCoord (pt: {x: number; y: number}) {
    console.log(`Координаты: (${pt.x}, ${pt.y})`);
}
printCoord({x: 3, y: 7});

/**
 * опциональные типы
 * ? - необзязательный аргумент функции
 * (parameter) arg: string | undefined
 */

function printName(name: string, surname?: string) {
    console.log(`Имя: ${name}, Фамилия: ${surname || 'Не указана'}`);
}
printName('John');
printName('John', 'Doe');

const returnArgument = (arg?: string): void => {
    if (arg) {
        console.log(`Argument: ${arg}`)
    } else {
        throw new Error("No argument")
    }
}
returnArgument(); // или ничего не передаем в функцию или передаем строку, другие типы в этом случае нельзя передавать
returnArgument('test'); // или ничего не передаем в функцию или передаем строку, другие типы в этом случае нельзя передавать
// returnArgument(123); // или ничего не передаем в функцию или передаем строку, другие типы в этом случае нельзя передавать

/**
 * объединение типов
 */

let stringOrNumber: string | number = 'test';
stringOrNumber = 123;
// stringOrNumber = false;
// stringOrNumber = {x: 123};

const returnArgument2 = (arg?: string | number): string |number | void => {
    if (arg && typeof arg === 'string') {
        console.log(`String: ${arg}`);
    } else if (arg && typeof arg === 'number') {
        console.log(`Number: ${arg}`);
    } else {
        console.log(typeof arg)
        throw new Error("No argument");
    }
}

/**
 * Пересекающиеся типы (Intersection types)
 */

type typeA = {a: string};
type typeB = {b: number, c: boolean};

type typeAB = typeA & typeB;

const obj: typeAB = {
    a: 'test',
    b: 123,
    c: true
};

/**
 * литералы (Literal types)
 */

type literalType = 'red' | 'green' | 'blue';

let color: literalType = 'red';
color = 'green';
color = 'blue';

let x: "hello" = "hello";
// OK
x = "hello";
// ...
// x = "world"; // Error, 'world' is not assignable to 'hello'

/**
 * Объединение литералов
 */

function printText(s: string, alignment: "left" | "right" | "center") {
    // ...
}

printText("Hello, world!", "left");
printText("Hello, world!", "right");
printText("Hello, world!", "center");

// printText("Hello, world!", "top"); // Error, 'top' is not assignable to 'left' | 'right' | 'center'

/**
 * Переиспользуемые типы (алиасы)
 */

type User = {
    fullName: string;
    age: number;
}
type Transaction = {
    id: number;
    type: 'debit' | 'credit';
    owner: User;
}
const transactionList: Transaction[] = [
    {
        id: 1,
        type: 'debit',
        owner: {
            fullName: 'John Doe',
            age: 30
        }
    },
    {
        id: 2,
        type: 'credit',
        owner: {
            fullName: 'Jane Doe',
            age: 28
        }
    }
]
const getTransactionById = (id: number): Transaction | undefined => {
    // return transactionList.find(t => t.id === id);
    // return transactionList.find((t: Transaction) => t.id === id) as Transaction | undefined;
    return transactionList.find((t: Transaction) => t.id === id);
}
console.log(`getTransactionById 1: ${getTransactionById(1)}`)
console.log(`getTransactionById 2: ${getTransactionById(2)}`)
// console.log(`getTransactionById "": ${getTransactionById('')}`)
// console.log(`getTransactionById null: ${getTransactionById(null)}`)

/**
 * Утверждение типа (Type Assertions)
 * Иногда TS не знает действительного типа и может предположить ошибочный,
 * например ниже TS предположит тип HTMLElement, а мы знаем, что тип будет HTMLCanvasElement
 * мы сможем сообщить компилятору правильный тип, т.е. "сконвертировать" переменную myCanvas
 */

let myCanvas = document.getElementById('main_canvas');
// let myCanvas = document.getElementById('main_canvas') as HTMLCanvasElement;
// let myCanvas2 = document.getElementById('main_canvas') as string;

// const userId = 1 as string; // Преобразование типа "number" в тип "string" может привести к ошибке, так как ни один из типов не перекрывается с другим в достаточной степени. Если это сделано намеренно, сначала преобразуйте выражение в "unknown"
const userId2 = 1 as unknown as string; // теперь TS будет принудительно считать данную переменную строковой

let someArray = ['foo', 'bar', 'baz'];
// someArray = ['foo', 'bar', 'baz', 21, true];
const someArray2 = ['foo', 'bar', 'baz', 21, true] as Array<any>;

/**
 * Non-null Assertion Operator (Postfix "!")
 */

function liveDangerously (x?: number | null) {
    // console.log(x.toFixed()); // Возможно, "x" имеет значение null или undefined

    // Не рекомендуется использовать Non-null Assertion Operator, поскольку он может привести к ошибке во время выполнения
    console.log(x!.toFixed());
}

/**
 * Temlate Literal Types - можно собрать тип из нескольких типов
 */

type World = "world";

type Greeting = `hello ${World}`;
type Greetin1 = "hello world";
