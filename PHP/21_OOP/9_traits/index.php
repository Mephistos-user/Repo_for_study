<?php
trait Loggable {
    public function log($message) {
        echo "Logging message: $message";
    }
}

class User {
    use Loggable;

    public function register() {
        // Логирование регистрации пользователя
        $this->log('User registered');
        // Дополнительные действия по регистрации
    }
}

$user = new User();
$user->register(); // Выведет "Logging message: User registered"
