// объекты (именнованные коллекции):
/*
let obj1 = new Object(); // конструктор объекта
let obj2 = {}; // литерал объекта
*/
/*
let authorizedUser = {
    name: "John",
    login: "JD_scrubs",
    year: 1987,
    phone: "8(900)-111-11-11",
    "has friends": true,
    age: 40
};

console.log(authorizedUser);

console.log(authorizedUser.name); // обращение к значению по ключу
console.log(authorizedUser.login);

//console.log(authorizedUser.has friends); // ошибка
console.log(authorizedUser["has friends"]); // правильно

authorizedUser.isMale = true; // новая пара ключ (isMale): значение (true)
console.log(authorizedUser);

delete authorizedUser.age; // удаление пары ключ: значение
console.log(authorizedUser);
*/

/*
const userFullName = {
    firstName: "John",
    surName: "Townsend" 
};

userFullName.firstName = "Peter";
console.log(userFullName);
*/

/*
// использование переменной в качестве ключа:
let fruit = "pineApples";
let market = {
    [fruit]: 5
};
console.log(market["pineApples"]);
console.log(market.pineApples);

// проверка наличия ключа в объекте
console.log("pineApples" in market);
console.log("apples" in market);
*/
/*
console.log("Перебор значений объекта: ");
for (let key in authorizedUser) {
    console.log(key, authorizedUser[key]);
};
*/

// map
/*
let map = new Map();

map.set("1", "stringAsKey");
map.set(1, "numAsKey");
map.set(true, "boolAsKey");

console.log(map);

// методы map:
console.log(map.get("1")); // получить значение по ключу
console.log(map.has(true)); // проверить наличие ключа
console.log(map.size); // размер коллекции
console.log(map.delete(1)) // удаление ключ:значение
console.log(map);

map.clear(); // очистка коллекции
console.log(map);
*/

/*
// перебор значений:
let clients = new Map ([
    ["Jack", 1994],
    ["Bob", 1997],
    ["Alex", 1987]
]);
console.log(clients);
// перебор и вывод ключей
for (let name of clients.keys()) {
    console.log(name);
};
// перебор и вывод значений
for (let year of clients.values()) {
    console.log(year);
};
// перебор и вывод пар ключей и значений
for (let values of clients) {
    console.log(values);
};
// перебор и вывод пар ключей и значений
clients.forEach((value, key, map) => {
    console.log(`${key}: ${value}`);
});
*/

/*
// set: // в коллекции нет ключей, но содержит только уникальные значения
let set = new Set();

let john = { name: "John" };
let pete = { name: "Pete" };
let mary = { name: "Mary" };

set.add(john); // добавить в коллекцию элемент
set.add(pete);
set.add(mary);
set.add(john);
set.add(mary);

console.log(set.size);
console.log(set);

// перебор значений set:
for (let user of set) {
    console.log(user.name); // John потом Pete и Mary
};
*/

