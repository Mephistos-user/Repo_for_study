<?php
class ParentClass {
    // свойства и методы родительского класса
}
class ChildClass extends ParentClass {
    // свойства и методы дочернего класса
}
class Vehicle {
    public $brand;
    public function __construct($brand) {
        $this->brand = $brand;
    }
    public function startEngine() {
        echo "Запуск двигателя $this->brand.";
    }
}
class Car extends Vehicle {
    public function accelerate() {
        echo "Ускорение автомобиля $this->brand.";
    }
}

$obj = new Car("Toyota");
$obj->startEngine(); // Вывод: Запуск двигателя Toyota.
$obj->accelerate(); // Вывод: Ускорение автомобиля Toyota.


class Animal {
    protected $name;
    public function __construct($name) {
        $this->name = $name;
    }
    public function eat() {
        echo $this->name . " ест.";
    }
}
class Dog extends Animal {
    public function bark() {
        echo $this->name . " лает.";
    }
}class Cat extends Animal {
    public function meow() {
        echo $this->name . " мяукает.";
    }
}

$dog = new Dog("Бобик");
$dog->eat(); // Вывод: Бобик ест.
$dog->bark(); // Вывод: Бобик лает.
$cat = new Cat("Мурзик");
$cat->eat(); // Вывод: Мурзик ест.
$cat->meow(); // Вывод: Мурзик мяукает.