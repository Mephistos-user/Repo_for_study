/**
 * опциональные параметры
 */

function fn1(x: string, y?: number): void { // y - опциональный параметр - можем передавать или не передавать
    // ...
}

fn1('foo');
fn1('foo', 2);
// fn1('foo', true);
// fn1('foo', 2, true);

/**
 * Типизация коллбеков. Первые асинхронные функции строились на основе коллбеков
 */

interface Options {
    opt1: string;
    opt2: number;
    opt3?: boolean;
}

type Callback = (str3: string, options: Options) => void;

function fn2(
    str: string,
    str2: string, // опциональный параметр
    // callback: (str3: string, options: Options) => void,
    callback: Callback // вынесем длинный тип в короткий Alias для читаемости
)
: void {
    // ...
    callback(
        `Another string with ${str} and ${str2}`,
        {
            opt1: 'value1',
            opt2: 123,
            opt3: true
        }
    )
}

fn2('test', 'test2', (x) => {
    console.log(x);
})

/**
 * Перегрузка функций. Допустим мы хотим, чтобы наша функция makeDate принимала
 * либо timestamp как единственный аргумент типа number, либо 3 числа (день, месяц и год)
 */

function d(
    timestamp?: number,
    day?: number,
    month?: number,
    year?: number
) {
    // ...
}

d(); // функция не должна принимать такой набор аргументов
d(1625682600000); // timestamp - OK
d(29, 12); // день, месяц - функция не должна принимать такой набор аргументов (даты и месяца недостаточно)
d(29, 12, 2024); // день, месяц, год - OK
d(1625682600000, 29, 12, 2024) // функция не должна принимать такой набор аргументов (нужен или 1 или 3)
// d(1625682600000, 29, 12, 2024, 'Mon') // функция не должна принимать такой набор аргументов (лишний аргумент)

/**
 * Функция выше не отвечает требованиям ТЗ.
 * Для создания единой функции, которая может принимать разные наборы аргументов используются перегрузки (Function Overloads)
 */

function makeDate(timestamp: number): Date; // 1й набор аргументов (1я перегрузка)
function makeDate(day: number, month: number, year: number): Date; // 2й набор аргументов (2я перегрузка)

// Функция-имплементация, которая не может быть вызвана напрямую, но делает "магию"
function makeDate(mOrTimestamp: number, d?: number, y?: number): Date {
    if (d !== undefined && y !== undefined) {
        return new Date(y, mOrTimestamp, d);
    } else {
        return new Date(mOrTimestamp);
    }
}

const d1 = makeDate(12345678);
const d2 = makeDate(29, 12, 2024);
// const d3 = makeDate(29, 12); // Ни одна перегрузка не ожидает аргументы 2, но существуют перегрузки, которые ожидают аргументы 1 или 3.

/**
 * Перегрузки могут быть и у методов классов и даже конструктора
 */

class DatePicker {
    static makeDate(timestamp: number): Date;
    static makeDate(day: number, month: number, year: number): Date;

    static makeDate(mOrTimestamp: number, d?: number, y?: number): Date {
        if (d !== undefined && y !== undefined) {
            return new Date(y, mOrTimestamp, d);
        } else {
            return new Date(mOrTimestamp);
        }
    }
}

const dd1 = DatePicker.makeDate(12345678);
const dd2 = DatePicker.makeDate(29, 12, 2024);
// const dd3 = DatePicker.makeDate(29, 12); // Ни одна перегрузка не ожидает аргументы 2, но существуют перегрузки, которые ожидают аргументы 1 или 3.

/**
 * Rest-параметры
 */

function multiply(n: number, ...m: number[]) { // rest-параметр (...args) должен быть передан массивом
    return m.map((x) => x * n);
}

console.log(multiply(2, 3, 4, 5)); // [6, 12, 20, 30]

function fn3(...args: number[]): number { // rest-параметр (...args) должен быть передан массивом
    let sum = 0;
    for (const num of args) {
        sum += num;
    }
    return sum;
}

console.log(fn3(1, 2, 3, 4, 5)); // 15

/**
 * Rest-параметры в виде объекта
 */

function fn4({ a, b, ...rest }: { a: number; b: number; c?: number }): number { // rest-параметр ({ a, b, ...rest }) должен быть передан объектом
    let sum = a + b;
    if (rest.c !== undefined) {
        sum += rest.c;
    }
    return sum;
}

console.log(fn4({ a: 1, b: 2, c: 3 })); // 6

/**
 * Деструктуризация аргументов
 */

function fn5({ a, b, c = 0 }: { a: number; b: number; c?: number }): number { // деструктуризация объекта
    return a + b + c;
}

console.log(fn5({ a: 1, b: 2 })); // 3
console.log(fn5({ a: 1, b: 2, c: 3 })); // 6

// Аналогичная, но более читаемая запись, где типизация аргумента вынесена в алиас
type ABC = {
    a: number;
    b: number;
    c: number;
}

function fn6(args: ABC): number {
    return args.a + args.b + args.c;
}
// или:
function fn7({ a, b, c }: ABC) {
    return a + b + c;
}

/**
 * Типизация контекста функции через аргумент this
 */

interface SomeType {
    x: string;
    y: number;
}

/**
 * Первый параметр this является служебным для TS и будет удален при компиляции в JS
 */

function fn8(this: SomeType, x1: number) {
    // this.x = null;
    this.x = 'string';
    x1 = 1;

    this.y = 1;

    console.log('this', this);
    console.log('this.x', this.x);
    console.log('x', x1);

    return this.x
}

// fn8(22) // Контекст this типа "void" не может быть назначен методу this типа "SomeType".

const correctThis = {
    x: '1',
    y: 2,
    color: 'red'
};

fn8.call(correctThis, 22); // вызываем fn8 с передачей контекста, соответствующего типу SomeType
