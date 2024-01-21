// объявление строк:
/*
let single = 'одинарные ковычки';
let double = "двойные ковычки";
let backticks = `шаблонные литералы`;
console.log(single, double, backticks);
*/
/*
let a = 10, b = 5;
let expressionBackticks = `Fifteen is ${(a + b)} and not ${2 * a + b}.`;
let expressionQuotes = "Fifteen is " + (a + b) + " and not " + (2 * a + b) + ".";
console.log(expressionBackticks);
console.log(expressionQuotes);
*/
/*
let userList = `Users online:
* Ivan
* Anna
* John
`;
console.log(userList)
*/
/*
let userList = "Users online:
* Ivan";
*/
/*
// специальные символы:
let userListSpecial = "Users online:\n* Ivan"; // \ - символ экранирования
console.log(userListSpecial);
console.log("\u{1F60D}"); // 😍
let confessionOne = 'I\'m Batman';
let confessionTwo = "I'm Batman";
console.log(confessionOne, confessionTwo);
*/
/*
// длинна строки:
let str = "Length of string is ";
console.log(`${str}${str.length}`); // это свойство, а не функция
*/
/*
// доступ к символу:
let greeting = "Hello!";
console.log(greeting[0]); // первый символ имеет индекс 0
console.log(greeting.charAt(0)); // метод

console.log(greeting[10]); // undefined
console.log(greeting.charAt(10)); // "" - выдаст пустую строку
*/
/*
for (let char of greeting) {
    console.log(char);
}
*/
/*
greeting[1] = 'a'; // не сработает
console.log(greeting);
*/
/*
// методы:
console.log(greeting.toUpperCase());
console.log(greeting.toLowerCase());
console.log(greeting[1].toUpperCase());
*/
/*
let darthVader = "Luke, I am your father";
console.log(darthVader.indexOf("Luke")); // поиск с начала строки
console.log(darthVader.indexOf("mother"));
console.log(darthVader.indexOf("a")); // первое вхождение символа или строки
console.log(darthVader.indexOf("a", 9)); // символ "а" начиная с 9й позиции
*/
/*
let darthVader = "Luke, I am your father";
console.log("Работает цикл: ");
let pos = -1;
while ((pos = darthVader.indexOf("a", pos + 1)) != 1) {
    console.log(pos);
}
*/
/*
let darthVader = "Luke, I am your father";
console.log(darthVader.indexOf("u"));     // первое вхождение символа
console.log(darthVader.lastIndexOf("u")); // последнее вхождение символа
*/
/*
let darthVader = "Luke, I am your father";
console.log(darthVader.includes("a")); // позоляет определить, содержит ли массив искомый элемент. В случае нахождения элемента метод возвращает true, иначе false
console.log(darthVader.includes("a", 9));
*/
/*
let darthVader = "Luke, I am your father";
console.log(darthVader.startsWith("Luk")); // проверяет начинается ли строка с указанных символов (true/false)
console.log(darthVader.endsWith("father")); // проверяет заканчивается ли строка указанными символами (true/false)
*/
/*
let darthVader = "Luke, I am your father";
// позволяет возвратить новый массив (срез), который содержит копии элементов, вырезанных из исходного массива
console.log(darthVader.slice(6)); // обрезает первые 6 символов
console.log(darthVader.slice(6, 10)); // обрезает первые 6 символов и берет следующие символы до 10 не включая 10й символ
console.log(darthVader.slice(-6)); // обрезает последние 6 символов с конца строки
*/

/*
let darthVader = "Luke, I am your father";
// позволяет извлечь символы из строки (подствроку) между двумя заданными индексами, или от определенного индекса до конца строки (похож на slice)
console.log(darthVader.substring(11)); // start
console.log(darthVader.substring(11, 16)); // start and end

console.log(darthVader.substr(11)); // start
console.log(darthVader.substr(11, 4)); // start and length
*/
/*
// сравнение строк:
let darthVader = "Luke, I am your father";
// localCompier() - возвращает число, указывающее, должна ли данная строка находится до, после или в том же самом месте, что и строка, переданная через параметр, при сортировке этих строк
// codePointAt() - возвращает неотрицательное целое число, являющееся закодированным в UTF-16 значением кодовой точки
console.log(darthVader.codePointAt(0));
console.log(String.fromCharCode(76)); // возвращает символ из кода

console.log("New Zealand".localeCompare("Zealand")); // -1
console.log("Zealand".localeCompare("Zealand"));     //  0    
console.log("Zealand".localeCompare("New Zealand")); //  1
*/
