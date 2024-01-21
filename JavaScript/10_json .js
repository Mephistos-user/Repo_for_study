// формат JSON
/*
// это не удобно
let user = {
    name: "John",
    age: 30,
    toString() {
        return `{name: "${this.name}", age: ${this.age}}`;
    }
};
console.log(user);
*/
/*
// использование формата JSON
let userNew = {
    name: 'John',
    age: 30,
    isAdmin: false,
    courses: ['html', 'css', 'js']
};
let json = JSON.stringify(userNew); // перевод объекта в формат JSON (сериализация)
console.log(json);
console.log(typeof(json)); // string
*/

/*
// еще сериализация
console.log(JSON.stringify(1));
console.log(JSON.stringify('test'));
console.log(JSON.stringify(true));
console.log(JSON.stringify([1, 2, 3]));
*/
/*
let userNew = {
    sayHi() { //будет пропущенно
        console.log("Hello");
    },
    something: undefined // как и это пропущено
};
console.log(JSON.stringify(userNew));
*/

/*
// вложенные объекты:
let meetup = {
    title: "Conference",
    room: {
        number: 23,
        participants: ["john", "ann"],
        date: new Date('2022-06-10')
    },
    // настройка функции toJSON
    // toJSON() {
    //   return this.title; // перечисляем поля для сериализации в JSON-формат
    // }
};
console.log( JSON.stringify(meetup));
*/
/*
// объявление JSON-формат переменных
let json = JSON.stringify(value, [replacer, space]); // value - обязательный аргумент, [replacer, space] - необязательные аргументы. 
let value = JSON.parse(str, [reviver]);// str - обязательный аргумент, [reviver] - необязательный аргумент
*/
/*
// перевод строки JSON-формата в обычный объект:
console.log(JSON.parse('{"name": "John", "age": 30, "toString": "[Function: toString]"}'));

let str = '{"title": "Conference", "date": "2017-11-30T12:00:00.000Z"}';

// не корректный перевод (parse) в формат объекта, который содержит дату:
// let meetupNew = JSON.parse(str);
// console.log(meetupNew.date.getDate()); // дата в объекте получается в формате строки, а не даты

// корректный перевод (parse) в формат объекта, который содержит дату:
let meetupNew = JSON.parse(str, function(key, value) {
    if (key == 'date') return new Date(value);
    return value
});
console.log(meetupNew.date.getDate());
*/