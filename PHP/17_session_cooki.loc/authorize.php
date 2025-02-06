<?php
    session_start();
    // создаем новую сессию или восстанавливаем текущую
    if (!isset($_GET['submit'])) {
        echo "
        <form>
            Login: <input type=text name=login>
            Password: <input type=password name=passwd>
            <input type=submit name=submit value=Войти>
        </form>
        ";
    } else {
        $_SESSION['login'] = $_GET['login'];
        // регистрируем переменную login
        $_SESSION['passwd'] = $_GET['passwd'];
        // регистрируем переменную passwd
        // Теперь логин и пароль - глобальные переменные для этой сессии (так делать не безопасно!!!)
        if ($_GET['login'] == "abc" && $_GET['passwd'] == "123") {
            Header("Location: privatePage.php"); // Header - отправка HTTP-заголовка (перенаправляем страницу)
        } else {
            echo "Неверный логин или пароль! Попробуйте еще раз<br>";
        }
    }
    echo "<br>";
    echo session_id();
    print_r($_SESSION); // выводим все переменные сессии
?>