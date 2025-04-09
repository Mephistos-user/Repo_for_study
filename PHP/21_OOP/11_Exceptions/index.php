<?php

// 1. Использование оператора try-catch.
try {
    // Потенциально опасный код
    $a = 10;
    $b = 0;
    if ($b == 0) {
        // Генерация исключения
        throw new Exception("Ошибка: деление на ноль!");
    }
    $c = $a / $b;
    echo $c;
    
} catch (Exception $e) {
    // Обработка исключения (код исполняемый в случае ошибки)
    echo "Поймано исключение: " . $e->getMessage();
}


// 2. Создание пользовательских исключений
class CustomException extends Exception {
    public function errorMessage() {
        return "Пользовательское исключение: " . $this->getMessage();
    }
}
try {
    // Потенциально опасный код
    // // Генерация пользовательского исключения
    throw new CustomException("Ошибка: неверные данные!");
} catch (CustomException $e) {
    // Обработка пользовательского исключения
    echo $e->errorMessage();
}


// 3. Использование блока finally
try {
    // Потенциально опасный код
    // // Генерация исключения
    throw new Exception("Ошибка: непредвиденная ситуация!");
} catch (Exception $e) {
    // Обработка исключения
    echo "Поймано исключение: " . $e->getMessage();
} finally {
    // Выполнение кода в любом случае
    echo "Выполнение блока finally";
}