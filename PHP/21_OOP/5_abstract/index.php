<?php
// Абстрактный класс Транспортное средство
abstract class Transport {
    protected $brand;
    
    public function __construct($brand) {
        $this->brand = $brand;
    }
    abstract public function start();
    abstract public function stop();
}
// Класс Автомобиль
class Car extends Transport {
    public function __construct($brand) {
        parent::__construct($brand);
    }
    public function start() {
        echo "Автомобиль {$this->brand} завелся.\n";
    }
    public function stop() {
        echo "Автомобиль {$this->brand} заглушился.\n";
    }
}
// Класс Мотоцикл
class Motorcycle extends Transport {
    public function __construct($brand) {
        parent::__construct($brand);
    }
    public function start() {
        echo "Мотоцикл {$this->brand} завелся.\n";
    }
    public function stop() {
        echo "Мотоцикл {$this->brand} заглушился.\n";
    }
}
// Функция для работы с транспортным средством
function operateTransport(Transport $transport) {
    $transport->start();
    // ... некоторая работа с транспортным средством ...
    $transport->stop();
}
$car = new Car("Toyota");
operateTransport($car);
$motorcycle = new Motorcycle("Honda");
operateTransport($motorcycle);