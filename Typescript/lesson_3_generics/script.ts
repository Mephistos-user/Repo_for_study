/**
 * Обобщенные типы (дженерики, generics) - это своего рода переменные для типов
 */

/** */

function genericsExplanation(arg: any): any {
    return arg
}

function genericsExplanation2(arg: string | number | boolean): string | number | boolean {
    return arg.toString()
}

genericsExplanation2(1)

/** Создадим обобщенный тип, назовем его стандартным именем для дженериков Т - что значит тип */


function genericsExplanation3 <T> (arg: T): T {
    return arg
}

genericsExplanation3('')

/** 
 * Дженерики могут быть не только абстрактными, но и более строго типитизированными
 */
interface User2 {
    id: number;
    name: string;
}

function genericsExplanation5 <Type extends User2> (arg: Type[]): Type {
    // return arg.find(e => e.id === 3) // может вернуть undefined
    return arg.find(e => e.id === 3) || arg[0]
}

const userList = [{
    id: 1,
    name: 'John',
}, {
    id: 2,
    name: 'Alice',
}, {
    id: 3,
    name: 'Bob',
}] as User2[]
genericsExplanation5(userList)

/**
 * Служебные слова, необходимые для создания новых типов из существующих типов и структур
 */

/** оператор keyof - берет объект и делает строковый литерал ключей */

type UserParams = {
    name: string
    age: number;
    document: {
        type: string;
        id: string
    }
}
type UserField = keyof UserParams // => "name" | "age" | "document"

const userField1: UserField = 'name';
const userField2: UserField = 'age';
const userField3: UserField = 'document';
// const userField4: UserField = 'password'; // поле с названием password отсутствует в изначальном типе, поэтому ошибка

const userField5: keyof UserParams["document"] = 'type' // здесь UserParams["document"] - это доступ по индексу
const userField6: keyof UserParams["document"] = 'id'
// const userField7: keyof UserParams["document"] = 'wrong field name' // поле отсутствует во вложенном объекте

/**
 * оператор typeof уже есть в JS и используется для получения типа переменной,
 * в TS он используется в контексте типизации для получения TS-типа
 */

let someObj = {x: 'Hello world'}
console.log('typeof someObj', typeof someObj); // JS-оператор вернет "object"

type SomeObjTSType = typeof someObj; // TS-оператор, т.к. в контексте типов - вернет тип {x: string}

/**
 * typeof и keyof можно комбинировать
 */

const myUser: UserParams = {
    name: 'John',
    age: 30,
    document: {
        type: 'passport',
        id: '1234567890',
    }
}

type UserParams2 = typeof myUser;

type U = keyof typeof myUser;
const u1: U = 'name';
const u2: U = 'age';
const u3: U = 'document';
// const u4: U = 'wrong_root_field';
const u5: keyof typeof myUser.document = 'type';
const u6: keyof typeof myUser.document = 'id';
// const u7: keyof typeof myUser.document = 'wrong_nested_field';
// const u8: keyof typeof myUser.document = 'name';

/**
 * Пример из практики - функция, которая получает значение поля из объекта по ключу
 */

function getValueByKey<T, K extends keyof T>(obj: T, key: K): T[K] {
    return obj[key]
}

const prop1 = getValueByKey(myUser, 'name')
console.log('prop1 ', prop1)
