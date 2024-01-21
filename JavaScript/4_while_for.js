// цикл while:
/*
let i = 1;

while (i <= 100) { // while (true)
    console.log(i);
    i = i + 1; // i++
}
*/

/*
while (condition) {
    тело цикла
}

while (i) == while ( i != 0)
*/

/*
// сколько букв "n" в слове:
let str = "Anna" //A - 0, n - 1, n - 2, a - 3
let nLetter = 0;
let i = 0;
while (i < str.length) { // str.length - length длина строки
    if (str[i] === "n") {
        nLetter = nLetter +1;
    }
    i = i + 1;
}
console.log(`В слове ${str} букв n ${nLetter}`);
*/

/*
// является ли число простым:
let div = 2;
let num = 18;
let flag = 1;

while (div <= num/2) {
    if (num % div === 0) {
        console.log(`Число ${num} не явдяется простым`);
        flag = 0;
        break
    }
    div = div + 1;
}
if (flag === 1) {
    console.log(`Число ${num} явдяется простым`)
}
*/

/*
// цикл do ... while - выполняется хотя бы 1 раз даже при не выполнении условия
let i = 1;
do {
    console.log(i);
    i++;
} while (i <= 100);
*/

/*
do {
    // тело цикла
} while (condition)
*/

/*
// цикл for:
for (let i = 1; i <=5; i++) {
    console.log(i);
}
*/

/*
for (начало; условие; шаг) {
    // тело цикла
}
*/

/*
let i = 1; // мы уже имеем объявленную i с присвоенным значением
for (; i <=7; i++) { // нет необходимости в "начале"
    console.log(i);
}
*/

/*
let i = 1;
for (; i <=8; ) { //нет необходимости в "шаге"
    console.log(i++); // иттерация будет происходить в теле цикла
}
*/

/*
for (;;) { //бесконечный цикл
    // тело цикла
}
*/

/*
// переставить буквы в обратном порядке:
let str = "Alex";
let newStr = "";
let letter = "";

for (let i = 0; i < str.length; i++) {
    letter = str[str.length - i - 1];
    newStr = newStr + letter;
}
console.log(newStr);
*/

/*
// директива continue:
// вывод нечетных чисел:
for (let j = 0; j < 15; j++) {
    if (j % 2 == 0) continue; // если true, пропустить оствшуюся часть тела цикла, перейти к следующему шагу
    console.log(j);
}
*/

