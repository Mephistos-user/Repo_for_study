// @ts-nocheck
// директива ts-nocheck отменяет поиск ошибок компиляции в .ts файлах

/**
 * Модули в отличии от скриптов мы будем запускать через NodeJS
 * tsc -p .tsconfig.json && node ./dist/index.js -
 */

/**
 * Модули - это изолированные части кода. У каждого модуля своя область видимости.
 * Для того, чтобы экспортировать из модуля некую переменную или метод ,используется слово export
 */

// module1.ts
export const test = 'test';
export class Class {};
export function fn1() {};
export interface Interface1 {};
export type Box {};

/** В другом модуле мы можем импортировать данные переменные */

 // module2.ts
import { test, Class, fn1, Interface1, Box } from './module1';

console.log(test); // 'test'
new Class(); // Class {}
fn1(); // undefined
console.log(Interface1); // undefined
console.log(Box); // undefined

/**
 * Кроме множества экспортов, каждый модуль может иметь один
 * 
 * export default
 */

// module1.ts
const moduleContents = {
    fn1: function() {},
    class1: class Class1 {},
    variable: 123
}
export default moduleContents;

// module2.ts
import module1 from './module1';
import alias from '../path/module1.ts'

console.log(module1.fn1()); // function() {}
new module1.class1(); // Class1 {}
console.log(module1.variable); // 123

console.log(alias) // { fn1: [function: fn1], class1: [class Class1], variable: 123 }

/** Для импорта дефолтного экспорта не обязательно использовать то же самое название,
 * как и в экспортируемом файле
 */

/**
 * export, export default, import возможен как для переменных, классов, функций,
 * так и для типов и интерфейсов
 */

/**
 * Реэкспорт из третьего модуля.
 * Модуль 2 может реэкспортировать что-то из модуля 3
 */

// module2.ts
export { method } from './other/module3'
export * from './other/module' // реэкспорт

/**
 * Реэкспорт из файла с названием index.ts позволяет сократить путь при импорте
 */

import smth from 'Component/Imput/index' // данная запись эквивалентна следующей
import smth from 'Component/Imput'

/**
 * так же возможно переимпортирование экспортируемой переменной
 */

export { moduleContents as renamedModeleContents }

/**
 * И переименование переменной при импортировании
 */

import { someExportedObj as alias, secondObj } from "./path/to/module";

/**
 * Импорт и переимонование всего модуля
 */

export const test1 = 'test1';
export const test2 = () => {};
export class Test3 {}
export default Test3;

import * as alias from './path/to/module';
// alias {
//     test1: 'test1',
//     test2: [Function: test2],
//     Test3: [class Test3],
//     default: [class Test3]
// }

/**
 * Некоторые модули либо ничего не экспортируют, либо пишут свои данные в глобальные области видимости.
 * Такие модули импортируются следующим кодом:
 */
import "./my-module.js";

/**
 * Импорт типов нужен для того, чтобы гарантировано убрать данные переменные при генерации JS-файлов
 */

// Explicitly use import type
import type { APIResponseType } from './api';
// Explicitly pull out a value (getResponse) and a type (APIResponseType)
import { getResponse, type APIResponseType } from './api'

/**
 * Относительные и библиотечные импорты
 */

/** Импорт из библиотек (npm-пакетов) */
import React, { FC, useState } from 'react'
import { Component } from "@angular/core"

/**
 * Пути для относительных импортов чаще всего начинаются с ./ или ../
 * 
 * ./subfolder/module - ищет модуль во вложенной папке subfolder относительно расположения текущего файла
 * ../index - ищет модуль на 1 директорию выще
 * ../../module2 - идет на 2 директории выше, относительно расположения текущего файла, там находит moduele2
 */