<?php
    session_start();

    if (!($_SESSION['login'] == 'abc' && $_SESSION['passwd'] == '123')) {
        Header('Location: authorize.php');
    }
    echo "<br>";
    echo session_id();
    print_r($_SESSION);
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
