// Инструкция if:
/*
let age = 17;

if(age < 18) {
    console.log("Не совершеннолетний");
}
*/

// 0, "", null, undefined, NaN - всегда false
/*
if(0) {
    // условие никогда не выполнится
}
if(1) {
    // условие будет выполнятся всегда
}
*/

/*
let bool = true;
if(bool) {
    // условие будет выполнятся всегда
}
*/

// блок else
/*
let age = 17;

if(age < 18) {
    console.log("Не совершеннолетний");
} else {
    console.log("Cовершеннолетний");
}
*/

// несколько условий
/*
let login = "Anna", pass = "123";
let loginFromDB = "Anna", passwordFromDB = "123";

if(login === loginFromDB && pass == passwordFromDB) {
    console.log("Добро пожаловать");
    } 
    else if (login === loginFromDB) {
        console.log("Проверте пароль");
        }
        else console.log("Пройдите регистрацию");
*/

// Тернарный (он же условный) оператор ?:
/*
let access;
if(age < 18) {
    access = false;
} else {
    access = true;
}

// let result = (age > 18) ? true : false;
// console.log(result)
// let result = условие ? значение если true : значение если false
// аналогичная запись:
// let result = age > 18;
*/

// Логические операторы:
//    && конъюнкция       / логическое И   / true И true = true 
//    || дизъюнкция       / логическое ИЛИ / true ИЛИ true = true
//    !  инверсия         / логическое НЕ  / !true = false
//    !! двойная инверсия /                / !!true = true

/*
console.log( true || true); // true
console.log( false || true); // true
console.log( true || false); // true
console.log( false || false); // false
*/

/*
console.log( 1 || 1); // 1
console.log( 0 || 1); // 1
console.log( 1 || 0); // 1
console.log( 0 || 0); // 0
*/

/*
if (1 || 0) {
    console.log("Правда!")
}

let hour = 9;
if (hour < 10 || hour > 18) {
    console.log("Офис закрыт.");
}
*/
/*
// ИЛИ "||" находит первое истиное значение
console.log(null || 0 || 1) // 1
*/
/*
console.log( true && true); // true
console.log( false && true); // false
console.log( true && false); // false
console.log( false && false); // false
*/
// И "&&" находит первое ложное значение
//console.log(5 && 1 && null) // null

/*
console.log(!true) // false
console.log(!0) // true
*/
/*
console.log(!!"No-empty string") // true
console.log(!!null) // false
*/


// Конструкция switch:
/*
let num = 3, season;

switch (num) {
    case 1:
        season = "Winter";
        break;
    case 2:
        season = "Spring";
        break;
    case 3:
        season = "Summer";
        break;
    case 4:
        season = "Fall";
        break;
    default:
        season = "Значение не найдено"
}
console.log(season)
*/