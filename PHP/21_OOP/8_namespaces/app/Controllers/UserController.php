<?php

namespace app\Controllers;

use app\Models\User;

class UserController {
    public function getUser($id) {
        // Код для получения пользователя
        $user = new User();
        echo "Пользователь с ID = {$id} - создан!";
    }
}