/**
 * namespaces используются, когда нужно запустить много скриптов
 */

/**
 * в файле 1 расположим некоторые экспортируемые сущности и обернем их в namespace Validation {}
 */

namespace Validation {
    export interface StringValidator {
        isAcceptable(s: string): boolean;
    }

    export class StringValidator implements StringValidator {
        isAcceptable(s: string): boolean {
            return true
        }
    }
}

/**
 * в файле 2 будут другие сущности в том же пространстве имен
 */

namespace Validation {
    export interface NumberValidator {
        isAcceptable(s: string): boolean;
    }

    export class NumberValidator implements NumberValidator {
        isAcceptable(s: string): boolean {
            return true
        }
    }
}

/** 
 * В файле 3 еще сущности
 */

namespace Validation {
    let someVariable = ''
    export interface ObjectValidator {
        isAcceptable(s: string): boolean;
    }

    export class ObjectValidator implements ObjectValidator {
        isAcceptable(s: string): boolean {
            return true
        }
    }
}

/**
 * Таким образом мы разместили в одном пространстве имен сущности из нескольких файлов
 * Мы можем импортировать все эти сущности внутри неймспейса с помощью специальных директив
 * 
 * /// <reference path="./namespace1.ts" />
 * /// <reference path="./namespace1_copy.ts" />
 * /// <reference path="./namespace1_copy_2.ts" />
 */

/// <reference path="./namespace1.ts" />
/// <reference path="./namespace1_copy.ts" />
/// <reference path="./namespace1_copy_2.ts" />

const s = new Validation.StringValidator();
const n = new Validation.NumberValidator();
const o = new Validation.ObjectValidator();

// import nested = Validation.NestedNS.test
// console.log('nested', nested)

// import { ZipCodeValidator } from 'controller'


// const zipCodeValidator = new ZipCodeValidator();
// console.log(`validator.isAcceptable('12345')`, validator.isAcceptable('12345'))
// console.log(`validator.isAcceptable('123454')`, validator.isAcceptable('123454'))

/**
 * запустим данный код с помощью NodeJs
 * 
 * tsc -p ./tsconfig.json && node ./dist/index.js
 */

// import { test, Class, fn1 } from './controller'
// import { test as test1 } from './controller'
// import controller from './controller'

// console.log('test, Class, fn1', test, Class, fn1)
// console.log('test1', test1)
// console.log('controller', controller)