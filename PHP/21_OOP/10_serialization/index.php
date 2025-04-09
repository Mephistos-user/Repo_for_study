<?php

// 1. Сохранение объекта в файл:
class User {
    private $username;
    private $email;

    public function __construct($username, $email) {
        $this->username = $username;
        $this->email = $email;
    }

    public function getName() {
        return $this->name;
    }
    public function getEmail() {
        return $this->email;
    }
}

$user = new User('john_doe', 'john@example.com');
// Сериализация объекта и сохранение в файл
$serializedUser = serialize($user);
file_put_contents('user_data.txt', $serializedUser);
// Извлечение сериализованных данных из файла
$str = file_get_contents('user_data.txt');
$unUser = unserialize($str);
echo $unUser->getName() . " " . $unUser->getEmail();


// 2. Кеширование данных:
function fetchDataFromDatabase($userId) {
    // Запрос данных из базы данных
    // ...
    return $data;
}
$userId = 123;
$cacheKey = 'user_data_' . $userId;
// Проверка наличия данных в кеше
if ($cachedData = getFromCache($cacheKey)) {
    // Используем закешированные данные
    $user = unserialize($cachedData);
} else {
    // Если данных нет в кеше, загружаем из базы данных и кешируем их
    $data = fetchDataFromDatabase($userId);
    $user = new User($data['username'], $data['email']);
    $serializedUser = serialize($user);
    saveToCache($cacheKey, $serializedUser);
}


// 3. Хранение настроек или конфигурации:
class Config {
    public $appName;
    public $apiKey;
    public $debugMode;
    // ...
}

$config = new Config();

$config->appName = 'My Application';
$config->apiKey = '123456789';
$config->debugMode = true;

// Сериализация объекта конфигурации
$serializedConfig = serialize($config);

// Сохранение сериализованного объекта в файл
file_put_contents('config_data.txt', $serializedConfig);