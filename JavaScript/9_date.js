// объект для хранения и работы с датой и временем:
/*
let newDate = new Date(); // при вызове конструктора без аргументов мы получаем текущую дату и время
console.log(newDate);

newDate = new Date(0);
console.log(newDate); // 01.01.1970

// timestamp - численное представление даты
newDate = new Date(24 * 3600 * 1000); // new Date(milliseconds) 1970-01-02T00:00:00.000Z
console.log(newDate);
newDate = new Date(-24 * 3600 * 1000); // 1969-12-31T00:00:00.000Z
console.log(newDate); 
newDate = new Date("2022-06-10"); // new Date(datestring) 2022-06-10T00:00:00.000Z
console.log(newDate);
// больше способов создания объекта в документации
*/

// методы:

/*
newDate = new Date();

let year = newDate.getFullYear(); // не использовать getyeear!!!
console.log(year);

let month = newDate.getMonth(); // 0 - 11
console.log(month);

let day = newDate.getDate(); //
console.log(day);

let hours = newDate.getHours(); //
console.log(hours);

let minutes = newDate.getMinutes(); //
console.log(minutes);

let seconds = newDate.getSeconds(); //
console.log(seconds);

let milliseconds = newDate.getMilliseconds(); //
console.log(milliseconds);

console.log(newDate.getDate());
*/

/*
// установить параметры даты и времени (set)
newDate.setFullYear(2023); //
console.log(newDate);

newDate.setMonth(6); // от 0 до 11
console.log(newDate);

newDate.setDate(13); //
console.log(newDate);

newDate.setHours(23); //
console.log(newDate);

newDate.setMinutes(26); //
console.log(newDate);

newDate.setSeconds(40); //
console.log(newDate);

newDate.setMilliseconds(546); //
console.log(newDate);

newDate.setTime(3452849); // в миллисекундах
console.log(newDate);
*/

/*
let date = new Date(2016, 1, 28); // 28 февраля 2016 года (високосный год)
console.log(date.getDate());
date.setDate(date.getDate() + 2); // 1 марта 2016 года
console.log(date.getDate());
*/
/*
// сколько дней осталось до дня рождения:
let currentTimeStamp = new Date(); // текущая дата
let myBirthDayTimeStamp = new Date("2024-06-30"); // дата очередного дня рождения
const SECS_PER_DAY = 24 * 60 * 60 * 1000; // пересчет одного дня в миллисекунды
let daysToNextBirthDay = parseInt((myBirthDayTimeStamp - currentTimeStamp)/SECS_PER_DAY); // без gettime работает
console.log(daysToNextBirthDay);
// parseInt - переводит в целое число
*/

/*
// миллисекунд от даты 01.01.1970года
let ms = Date.parse('2022-06-10T13:51:50.417-07:00');
let newDate = new Date("2022-06-10T13:51:50.417-07:00");
console.log(ms);
console.log(newDate.getTime());
*/

