<?php
    session_start();
    if (!isset($_GET['submit'])) {
        echo "
        <form>
            Login: <input type=text name=login>
            Password: <input type=password name=passwd>
            <input type=submit name=submit value=Войти>
        </form>
        ";
    } else {
        // получаем данные из формы
        $login = $_GET['login'];
        $passwordForm = $_GET['passwd'];
        // подключаемся к базе данных
        $link = mysqli_connect("localhost", "root", "", "passwords");
        
        if (!$link) {
            print("Невозможно подключится к MySQL. Ошибка: ". mysqli_connect_error());
        } else {
            echo "Соединение установлено...<br>";
            $sql = "SELECT hash FROM users WHERE login = '" . $login . "';";
            $result = mysqli_query($link, $sql);
            if ($result == false) {
                print("<br>Ошибка в запросе: ". mysqli_error($link));
            } else {
                $passwordDB = mysqli_fetch_array($result);
                if (password_verify($passwordForm, $passwordDB['hash'])) {
                    echo "Вы успешно авторизовались!";
                    $_SESSION['logged_in_user_id'] = '1';
                    $_SESSION['logged_in_user_name'] = 'vitalik23';
                    Header("Location: privatePage.php");
                } else {
                    echo "Неверный логин или пароль! Попробуйте еще раз<br>";
                }
            }
        }
    }
?>