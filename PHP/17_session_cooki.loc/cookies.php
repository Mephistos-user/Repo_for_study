<?php
    $visitCount = 0;

    if(isset($_COOKIE["visitCount"])) { // isset - проверяет что значение не NULL
        $visitCount = $_COOKIE["visitCount"] + 1;
    }

    // Функция setcookie устанавливает cookies ("visitCount" - имя, $visitCount - хранимое в cookies значение, strtotime("+30 days") - время жизни cookies)
    // setcookie("visitCount", $visitCount, time() + (86400 * 30), "/"); // 86400 seconds = 24 hours, 30 days
    setcookie("visitCount", $visitCount, strtotime("+30 days")); // 30 days

    print("Вы посещали эту страницу " . $visitCount . " раз");