// пользовательская функция:
function greetAnna () {
    console.log("hello, Anna!");
};
greetAnna();


// область видимости переменных
function greetAnna1 () {
    let greeting = "Hello, Anna!"; // локальная (приватная) переменная не доступна за пределами функции
    console.log(greeting);
};
greetAnna1();
// console.log(greeting); // выдаст ошибку


let userName1 = "Anna"; // глобальная(публичная) переменная доступна для использования в функции
function greetAnna2 () {
    let greeting = "Hello, " + userName1;
    console.log(greeting);
};
greetAnna2();


function greetAnna3 () {
    userName1 = "Elsa"; // функция может менять значения глобальных переменных
    let greeting = "Hello, " + userName1;
    console.log(greeting);
};
console.log(userName1);
greetAnna3();
console.log(userName1);


function greetUser (userName) {
    userName = userName + "!";
    let greeting = "Hello, " + userName;
    console.log(greeting);
};
let userName = "John";
greetUser(userName);
console.log(userName);
greetUser("Ivan");
console.log(userName);


// аргументы функции, значения по умолчанию:
function greetUser2 (userName, text = "Привет, ") {
    userName = userName + "!";
    let greeting = text + userName;
    console.log(greeting);
};

greetUser2(userName);
greetUser2(userName, "Hi, ");


//function greetUser2(userName, oneMoreFunction()) {} // вызов функции внутри функции


/*
// наследие прошлого:
function showMessage (from, text) { // встарых версиях JS
    if (text === undefined) {
        text = "текст не добавлен";
    };

    console.log( from + ": " + text );
};

function showMessage (from, text) {
    text = text || "текст не добавлен";
    ...
};
*/

/*
// возврат значений:
function howReturnWorks() {
    return 8; // возврат из функции может быть только один. работа функции дальше заканчивается
    return 9; // не будет возврата
};
console.log(howReturnWorks);

function getSum (a, b) {
    sum = a + $;
    return sum;
};
console.log(5, 8);

function checkAge(age) {
    if (age > 18) {
        return true;
    } else {
        return confirm("Вход  запрещен");
    };
};
console.log(checkAge(25));
*/
/*
// function expression:
let greeting = function() {
    console.log("Добрый День!");
};

console.log(greeting);

let func = greeting;
console.log(func);
*/
/*
// callback - отложенный вызов:

function askForm(question, yes, no) {
    if (confirm(question)) yes()
    else no()
};

function ok() {
    alert("Это да.");
};

function cansel() {
    alert("Это нет");
};

askForm("Что вы выберете?", ok, cansel);
*/


// стрелочные функции:
let numbers = [6, 187, 66, 4, 67, 30, 18];
console.log(numbers.sort((a, b) => a - b));


let sum1 = (a, b) => a + b;
// то же самое ->
let sum2 = function(a, b) {
    return a + b;
};

console.log(sum1(6, 5));
console.log(sum2(6, 5));



let mult = c => c * 2;
console.log(mult(9));

let greeting1 = () => console.log("Добрый день!");
greeting1();

let sum3 = (a, b) => {
    let result = a + b;
    return result;
};
console.log(sum3(7, 3));


