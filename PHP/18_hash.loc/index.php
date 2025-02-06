<?php
    session_start();

    unset($_SESSION['logged_in_user_id']);
    unset($_SESSION['logged_in_user_name']);
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
<!-- $password = 'veryStrongPass12@'; -->