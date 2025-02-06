<?php
    $password = 'veryStrongPass12@';
    $hash = password_hash($password, PASSWORD_BCRYPT); //password_hash - создает хеш пароля, PASSWORD_BCRYPT - используемый алгоритм

    var_dump($hash);
    if(password_verify($password, $hash)) { //password_verify - проверяет соответствие пароля хешу
        echo 'Пароль введен верно';
    } else {
        echo 'Пароль введен неверно';
    }