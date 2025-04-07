<?php
interface Logger {
    public function log($message);
}

class FileLogger implements Logger {
    public function log($message) {
        //Логирование в файл
    }
}
class DatabaseLogger implements Logger {
    public function log($message) {
        // Логирование в базу данных
    }
}
class Application {
    private $logger;

    public function setLogger(Logger $logger) {
        $this->logger = $logger;
    }
    public function doSomething() {
        // Выполнение операций
        $this->logger->log("Операция выполнена");
    }
}
$fileLogger = new FileLogger();
$databaseLogger = new DatabaseLogger();
$application = new Application();
$application->setLogger($fileLogger);
$application->doSomething();
$application->setLogger($databaseLogger);
$application->doSomething();