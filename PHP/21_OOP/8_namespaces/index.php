<?php
// Создание объекта класса из пространства имен
$obj = new MyNamespace\MyClass();
MyNamespace\myFunction(); // Вызов функции из пространства имен
echo MyNamespace\MY_CONST; // Вывод значения константы из пространства имен

use AnotherNamespace\AnotherClass;
// Создание объекта из другого пространства имен
$obj2 = new AnotherClass(); // в этом случае не нужно указывать пространство имен перед классом при создании объекта
$obj2->someMethod(); // Вызов метода из объекта

spl_autoload_register(function ($class) {
    $base_dir = __DIR__;
    $file = $base_dir . DIRECTORY_SEPARATOR . str_replace('\\', DIRECTORY_SEPARATOR, $class) . '.php';
    if (!file_exists($file)) {
        throw new \Exception("File is not found: {$file}");
    }
    require $file;
});

$userController = new \app\Controllers\UserController();
$userController->getUser(1);