<?php
    class Car {
        // Свойства
        public $name;
        public $color = 'green';

        // Методы
        function set_name($name) {
            $this->name = $name;
        }

        function get_name() {
            return $this->name;
        }
    }

    $bmw = new Car();
    $mercedes = new Car();

    // Использование свойств и методов
    $bmw->name = 'BMW';
    $mercedes->name = 'Mercedes';

    echo 'Car name: ' . $bmw->name  . '<br>';
    echo 'Car name: ' . $mercedes->name  . '<br>';
    echo 'Car color: ' . $bmw->color  . '<br>';
    echo 'Car color: ' . $mercedes->color  . '<br>';
    echo '<br>';
    $bmw->color = 'blue';
    $mercedes->color = 'white';
    echo 'Car color: ' . $bmw->color  . '<br>';
    echo 'Car color: ' . $mercedes->color  . '<br>';
    echo '<br>';

    $bmw->name = 'BMW 6';
    $mercedes->name = 'Mercedes AMG';
    echo 'Car name: ' . $bmw->name  . '<br>';
    echo 'Car name: ' . $mercedes->name  . '<br>';
    echo '<br>';

    // Изменение свойств
    $bmw->set_name('BMW 5');
    $mercedes->set_name('Mercedes Benz');

    // Получение свойств
    echo 'Car name: ' . $bmw->get_name() . '<br>';
    echo 'Car name: ' . $mercedes->get_name() . '<br>';
    echo 'Car color: ' . $bmw->color . '<br>';
    echo 'Car color: ' . $mercedes->color . '<br>';