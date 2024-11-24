/**
 * Наследование - это возможность создать дочерний класс, который унаследует свойства и методы родителя,
 * а также будет иметь свои свойства и методы, недоступные родителю.
 * Позволяет создавать иерархические структуры
 */

 class Animal {
    kind: string; // Атрибут
    constructor(kind: string) {
        this.kind = kind;
    }

    eat(): void { // Метод
    }
}

class Lion extends Animal {
    age: number;
    constructor(kind: string, age: number) {
        super(kind); // Вызов конструктора родительского класса
        this.age = age;
    }
    bark() {
        console.log(`${this.kind} is barking!`);
    }
}

const animal = new Animal('Cheetah');
console.log(animal.kind)
console.log(animal.eat())
// console.log(animal.bark()) // error
// console.log(animal.age) // error

const lion = new Lion('Lion', 3);
console.log(lion.kind)
console.log(lion.eat())
console.log(lion.bark())
console.log(lion.age)

/**
 * Абстракция - позволяет создавать абстрактные классы,
 *  содержащие общие поля и методы, не зависящие от реализации класса.
 * Создание экземпляров абстрактного класса недоступно.
 * Принцип абстракции позволяет вынести неважное из объекта,
 * сконцентрировавщись на важных свойствах и методах для именно конкретного объекта
 */

abstract class Human {
    weight: number;
    gender: string;
}

class Adult extends Human {
    goToOffice() {
        console.log('Adult is going to office');
    }
}

class Child extends Human {
    playWithToys() {
        console.log('Child is playing with toys');
    }
}

/**
 * Инкапсуляция - класс состоит из данных (атрибутов) и функций (методов) и является черным ящиком.
 * Внешний код или пользователь может видеть только интерфейс класса (набор публичных свойств и методов),
 * остальное скрыто и управляется только изнутри класса.
 * Работают модификаторы доступа Public, Protected, Private
 */

/**
 * Полиморфизм - способность одного и того же метода испольнять различные действия в зависимости от экземпляра класса
 */
/**
 * Один и тот же метод speak() может возвращать различные значения
 * в зависимости от того, с каким из экземпляров (инстансов) класса мы его вызовем.
 */

abstract class Pet {
    abstract speak(): string;
}

class Cat extends Pet {
    speak(): string {
        return "Meow!";
    }
}

class Dog extends Pet {
    speak(): string {
        return "Woof!";
    }
}

class AngryDog extends Pet {
    speak(): string {
        return "Hurrr!";
    }
}

function makeSound(pet: Pet): string {
    return pet.speak();
}
