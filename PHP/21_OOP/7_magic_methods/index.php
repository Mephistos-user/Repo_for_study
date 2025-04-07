<?php
// магические методы:

// 1. `__construct()`: Этот метод автоматически вызывается при создании нового экземпляра класса (объекта). Он используется для инициализации объекта и может принимать аргументы.

// 2. `__destruct()`: Этот метод вызывается при уничтожении объекта (при завершении его работы или явном удалении с помощью unset()). Он может быть использован для освобождения ресурсов или выполнения завершающих действий.

// 3. `__get($name)`: Этот метод вызывается, когда происходит попытка доступа к несуществующему или защищенному свойству объекта. Позволяет переопределить логику получения свойства.

// 4. `__set($name, $value)`: Этот метод вызывается при попытке установить значения для несуществующего или защищенного свойства объекта. Позволяет переопределить логику установки свойства.

// 5. `__call($name, $arguments)`: Этот метод вызывается при попытке вызвать несуществующий или недоступный метод объекта. Позволяет переопределить логику вызова метода.

// 6. `__toString()`: Этот метод вызывается, когда объект преобразуется в строку (например, при использовании функции echo для объекта). Позволяет определить, как объект должен быть представлен в виде строки.

// 7. `__clone()`: Этот метод вызывается при клонировании объекта с помощью оператора clone. Позволяет контролировать создание копии объекта.

// 8. `__isset($name)`: Этот метод вызывается при проверке наличия несуществующего или защищенного свойства с помощью функции isset() или empty(). Позволяет определить, считается ли свойство существующим.

// 9. `__unset($name)`: Этот метод вызывается при удалении несуществующего или защищенного свойства с помощью функции unset(). Позволяет контролировать удаление свойства.

// __construct
class MyClass {
    public function __construct() {
        echo "Объект создан";
    }
}
$obj = new MyClass(); // Выводит: Объект создан

// __destruct()
class MyClass {
    public function __destruct() {
        echo "Объект уничтожен";
    }
}
$obj = new MyClass();
unset($obj); // Выводит: Объект уничтожен

// __get($name)
class MyClass {
    private $myProperty = 10;
    public function __get($name) {
        if ($name === 'myProperty') {
            return $this->myProperty * 2;
        }
    }
}
$obj = new MyClass();
echo $obj->myProperty; // Выводит: 20

// __set($name, $value)
class MyClass {
    private $myProperty;
    public function __set($name, $value) {
        if ($name === 'myProperty') {
            $this->myProperty = $value;
        }
    }
}
$obj = new MyClass();
$obj->myProperty = 42;
echo $obj->myProperty; // Выводит: 42

// __call($name, $arguments)
class MyClass {
    public function __call($name, $arguments) {
        if ($name === 'myMethod') {
            echo "Вызван метод myMethod с аргументами: " . implode(', ', $arguments);
        }
    }
}
$obj = new MyClass();
$obj->myMethod('Аргумент 1', 'Аргумент 2');// Выводит: Вызван метод myMethod с аргументами: Аргумент 1, Аргумент 2

// __toString()
class MyClass {
    public function __toString() {
        return "Это объект класса MyClass";
    }
}
$obj = new MyClass();
echo $obj; // Выводит: Это объект класса MyClass

// __clone()
class MyClass {
    public $myProperty = 10;
    public function __clone() {
        $this->myProperty = 0;
    }
}
$obj1 = new MyClass();
$obj2 = clone $obj1;
echo $obj1->myProperty; // Выводит: 10
echo $obj2->myProperty; // Выводит: 0

// __isset($name)
class MyClass {
    private $myProperty = 42;
    public function __isset($name) {
        if ($name === 'myProperty') {
            return true;
        }
        return false;
    }
}
$obj = new MyClass();
var_dump(isset($obj->myProperty)); // Выводит: bool(true)

// __unset($name)
class MyClass {
    private $myProperty = 42;
    public function __unset($name) {
        if ($name === 'myProperty') {
            $this->myProperty = null;
        }
    }
}
$obj = new MyClass();
unset($obj->myProperty);
echo $obj->myProperty; // Выводит: Notice: Undefined property: MyClass::$myProperty