// I - interface segregation princpe - принцип разделения интерфейса
// клиенты не должны зависеть от методов, которые они не используют


/*class Animal {
    constructor(name) {
        this.name = name;
    }

    fly() {
        console.log(`${this.name} can fly`);
    }

    swim() {
        console.log(`${this.name} can swim`);
    }

    walk() {
        console.log(`${this.name} can walk`);
    }
}
// проблема - нам приходится переопределять метод базового класса чтобы заблокировать его функционал для объектов в которых эти методы не используются
class Dog extends Animal {
    fly() {
        return null;
    }
}

class Parrot extends Animal {
    swim() {
        return null;
    }
}
class Dolphin extends Animal {
    swim() {
        return null;
    }
    walk() {
        return null;
    }
}

const dog = new Dog('Snowflake');
dog.walk();*/


// решение
class Animal {
    constructor(name) {
        this.name = name;
    }
}


const flier = {
    fly() {
        console.log(`${this.name} can fly`);
    }
}
const swimmer = {
    swim() {
        console.log(`${this.name} can swim`);
    }
}
const walker = {
    walk() {
        console.log(`${this.name} can walk`);
    }
}


class Dog extends Animal {

}

class Parrot extends Animal {

}
class Dolphin extends Animal {

}

Object.assign(Dog.prototype, swimmer, walker); // Object.assign - используется для копирования значений всех собсвенных перечисляемых свойств из одного или более исходных объектов в целевой объект. После копирования он возвращает целевой объект
Object.assign(Parrot.prototype, flier, walker);
Object.assign(Dolphin.prototype, swimmer);


const dog = new Dog('Snowflake');
dog.walk();
dog.swim();
dog.fly(); // TypeError: dog.fly is not a function