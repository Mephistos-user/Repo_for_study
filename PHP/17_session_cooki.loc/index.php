<?php
    session_start();
    echo "<br>";
    echo session_id();
    unset($_SESSION['passwd']); // unset очищает конкретные поля в массиве сессии
    unset($_SESSION['login']);
    // $_SESSION = []; // очищает все данные в массиве сессии
?>

    <html>
        <head>
            <title>My home page</title>
        </head>
        <body>
            <h1>Привет всем!</h1>
            <h2>Это моя домашняя страница!</h2>
            <h3><a href="privatePage.php">Закрытая информация</a></h3>
        </body>
    </html>
<?php
    echo session_name();
    // выводим имя текущей сессии
?>