// 1. Строковое преобразование:
//let bool = true;
//let number  = 654;
//console.log("Тип данных переменной bool: " + typeof(bool)); // boolean
//console.log("Тип данных переменной number: " + typeof(number)); // number
//
//bool = String(bool); // преобразование логического типа в строковый
//bool = String(number); // преобразование числового типа в строковый
//console.log("Тип данных переменной bool: " + typeof(bool)); // string
//console.log("Тип данных переменной number: " + typeof(number)); // string
//
//let str = "2 + 5";
//console.log("2 + 5"); // 2 + 5
//console.log(1 + "2 + 5"); // 12 + 5  "1" сначала преобразуется в строку, затем происходит конкатинация

// 2. Численное преобразование:
//console.log("10" / "5"); // 2. сначала преобразуется в число затем вычисляется
//console.log("10" - "5"); // 5. сначала преобразуется в число затем вычисляется
//console.log("10" * "5"); // 50. сначала преобразуется в число затем вычисляется
//console.log("10" + "5"); // 105. не преобразуется в число, а происходит конкатинация

// 2.1
/*
let strNum = "639";
let boolNum = false
console.log("Тип данных strNum: " + typeof(strNum)); // string
console.log("Тип данных boolNum: " + typeof(boolNum)); // bool

strNum = Number(strNum);
boolNum = Number(boolNum);
console.log("Тип данных strNum: " + typeof(strNum)); // number
console.log("Тип данных boolNum: " + typeof(boolNum)); // number
console.log(boolNum); // 0
*/

// 2.2
/*
let someFieldInForm = Number("Непереводимая игра слов");
console.log("Тип данных переменной someFieldInForm: " + typeof(someFieldInForm)); // number
console.log(someFieldInForm); // NaN
*/

// 2.3
/*
let undf = undefined;
let nl = null;
let trueVar = true;
let falseVar = false;
let emptyString = "";

undf = Number(undf); // NaN
nl = Number(nl); // 0
trueVar = Number(trueVar); // 1
falseVar = Number(falseVar) // 0
emptyString = Number(emptyString); // 0

console.log(undf, nl, trueVar, falseVar, emptyString);
*/

// 3.
// Логическое преобразование:
// 3.1
/*
let undf = undefined;
let nl = null;
let numVar = 0;
let emptyString = "";

undf = Boolean (undf); // false
nl = Boolean (nl); // false
numVar = Boolean (numVar); // false
emptyString = Boolean (emptyString); // false

console.log(undf, nl, numVar, emptyString);
*/

// 3.2
/*
let strBool = "Hello!";
let strNull = "0";
let numNull = 0;
let numBool = 564;

strBool = Boolean(strBool); // true - непустая строка
strNull = Boolean(strNull); // true - непустая строка
numNull = Boolean(numNull); // false 
numBool = Boolean(numBool); // true - число не равное 0

console.log(strBool, strNull, numNull, numBool);
*/

// Базовые операторы:

// 1. Бинарные:
/*
let sum = 5 + 8;
let sub = 6 - 4;
let div = 18 / 2;
let mult = 5 * 9;
let mode = 42 % 9; // вычисление остатка от деления
let pow = 7 ** 2; // возведение в степень
let pow2 = 25 ** (1/2);

console.log(sum, sub, div, mult, mode, pow, pow2);
*/

// 2. Унарные:
/*
let neg = -5;
let subNew = neg + 7; // -5 + 7 = 2
let pos = +6; // 6
console.log(subNew, pos);

let strToNum = +"5"; // + переводит строку в число
console.log(typeof(strToNum)); // number
*/

// 3. Сложение строк:
/*
let strFive = "5";
let strSev = "7";
console.log(strFive + strSev); // 57
console.log(+strFive + +strSev); // 12

let numF = 9;
let strE = "10";
console.log(numF + strE); // 910
console.log(5 + 1 + "18"); // 618

console.log("10" / "5");
console.log("10" - "5");
console.log("10" * "5");
console.log();
*/

// 4. Присваивание:
/*
let a = 6;
let b = 9;
let c = 3 - (a = b + 1);
console.log(a, c); // 10, 7
*/

// 5. Сокращенная запись:
/*
let x = 18;
x += 2;
x /= 2;
console.log(x); // 10

x = 2;
x *= 6 + 3; // x = x * (6 + 3)
console.log(x); // 18
*/

// 6. Инкремент/декремент: 
/*
// Префиксная форма:
let count = 2;
console.log(++count); // 3
console.log(--count); // 2

// Постфиксная форма
count = 1;
console.log(count++); // 1
console.log(count++); // 2
*/

// 7. Опреаторы сравнения:
/*
let g = 5;
let h = 6;
console.log(g < h);
console.log(g > h);
console.log(g <= h);
console.log(g >= h);
console.log(g == h);
console.log(g != h);
*/

// Сравнение строк:
/*
console.log("A" < "Z"); // true
console.log("А" < "Я"); // true
console.log("A" < "a"); // true
*/

// Сравнение разных типов:
/*
console.log("5" > 3); // true
console.log("03" < 1); // false
console.log(false == 1); // false
console.log(false == 0); // true
console.log(false != 0); // false
console.log(true == 1); // true
console.log(false == ""); // true
*/

// Строгое сравнение:
//console.log(false === ""); // false
//console.log(false === 0); // false
//console.log(false !== 0); // true

// null и undefined:
/*
console.log(null === undefined); // false
console.log(null == undefined); // true

console.log(null > 0); // false
console.log(null == 0); // false
console.log(null >= 0); // true
console.log(null === 0); // false

console.log(undefined > 0); // false
console.log(undefined == 0); // false
console.log(undefined >= 0); // false
console.log(undefined === 0); // false

console.log(NaN > 0); // false
console.log(NaN == 0); // false
console.log(NaN >= 0); // false
console.log(NaN === 0); // false
*/
