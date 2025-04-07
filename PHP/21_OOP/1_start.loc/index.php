<?php
class MyClass {
    // Свойства класса
    public $property1;
    private $property2;

    // Методы класса
    public function method1() {
        // код метода
    }

    private function method2() {
        // код метода
    }
}

$obj = new MyClass();

$obj->method1();


class Car {
    public $brand;
    private $color;

    // конструктор класса
    public function __construct($brand, $color) {
        $this->brand = $brand;
        $this->color = $color;
    }

    public function startEngine() {
        echo "Запуск двигателя автомобиля $this->brand.";
    }
    public function changeColor($newColor) {
        $this->color = $newColor;
        echo "Цвет автомобиля изменен на $this->color.";
    }
}

$obj = new Car("Toyota", "синий");
$obj->startEngine(); // Запуск двигателя автомобиля Toyota.
$obj->changeColor("красный"); // Цвет автомобиля изменен на красный.

$obj->brand = "Mercedes"; // работает
$obj->color = "зеленый"; // не работает

if ($obj instanceof Car) {
    echo "Объект является экземпляром класса Car.";
} else {
    echo "Объект не является экземпляром класса Car.";
}