// 1. экспорт сразу:


// экспорт переменной
export let userName = "Anna";

// экспорт коллекции
export let newUser = {
    name: "Andrew",
    surname: "Sokolov",
    age: "40"
}

// экспорт массива
export let week = ['Mn', 'Tu', 'We', 'Thu', 'Fr', 'Sat', 'Sun'];

// экспорт константы
export const DAYS_IN_YEAR = 365;

// экспорт класса
export class User {
    constructor(name) {
        this.name = name;
    }
}

// 2. экспорт после объявления:

// экспорт метода
function greeting(newUser) {
    alert(`Hello, ${newUser}`);
}
function farewell(newUser) {
    alert(`Bye, ${newUser}`);
}

export {greeting, farewell};