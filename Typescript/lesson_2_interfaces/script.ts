/**
 * Интерфейсы представляют из себя еще один способ задать тип объектов наравне в Object type aliases
 */

interface UserS {
    name: string;
    isActive: boolean;
    age: number;
}

/** VS */
// type UserS = {
//     name: string;
//     isActive: boolean;
//     age: number;
// };

/**
 * Интерфейсы могут быть расширяемыми
 */

interface Student extends UserS {
    university: string;
}

/** Аналогично как типы расширяются через пересечение типов (Types Interection) */
// type Student = UserS & {
//     university: string;
// };

const student: Student = {
    name: "John",
    isActive: true,
    age: 25,
    university: "Synergy"
}

/** Различие интерфейсов - это открытость интерфейса для добавления полей, в отличии от типа */

interface MyInterface {
    foo: string;
}
interface MyInterface {
    bar: string;
}

const myInterface: MyInterface = {
    foo: "Hello",
    bar: "World"
}

/** В то время, как типы нельзя модифицировать */
// type MyType = {
//     foo: string;
// }
// type MyType = {
//     bar: string;
// }

/** Интерфейсы используются гораздо чаще на практике для описания объектов и классов */

interface CircleParams {
    radius: number;
    x: number;
    y: number;
}

interface ICircle extends CircleParams {
    getArea(): number
}

/** сдужебный оператор implements означает, что класс должен удовлетворять требованиям интерфейса, который он имплементирует */

class Circle implements ICircle {
    x = 0;
    y = 0;
    radius = 1;
    constructor({x, y, radius}: CircleParams) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    getArea(): number {
        const area: number = 3.12 * (this.radius ** 2)
        return area
    }
}
const smallCircleParams: CircleParams = {x: 1, y: 0, radius: 2}

const smallCircle = new Circle(smallCircleParams);
const smallCircleArea = smallCircle.getArea();
console.log('smallCircleAre = ', smallCircleArea);

const largeCircle = new Circle({x: 7, y: 3, radius: 4});
const largeCircleArea = largeCircle.getArea();
console.log('largeCircleArea = ', largeCircleArea);