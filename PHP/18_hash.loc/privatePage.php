<?php
    session_start();

    if (!($_SESSION['logged_in_user_id'] === '1' && $_SESSION['logged_in_user_name'] === 'vitalik23')) {
        Header('Location: authorize.php');
    }
?>

    <html>
        <head>
            <title>Private page</title>
        </head>
        <body>
            <h1>Личная страница</h1>
            <!-- <h2>Это моя личная страница!</h2> -->
            <h3><a href="index.php">На главную</a></h3>
        </body>
    </html>
