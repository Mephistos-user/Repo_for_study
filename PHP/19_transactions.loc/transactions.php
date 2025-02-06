<?php
    $link = mysqli_connect("localhost", "root", "", "furniturestore");
    if (!$link) {
        exit("Error: " . mysqli_connect_error());
    }
    // начало транзакции:
    mysqli_autocommit($link, FALSE); // включает (TRUE) или отключает (FALSE) автокоммит (автоматическую фиксацию изменений базы данных) базы данных
    try {
        $sql1 = "INSERT INTO clients (surname, firstname, secondname, phone) VALUES ('Антоненко', 'Дмитрий', 'Игоревич', '8(911)856-45-09')";
        $result1 = mysqli_query($link, $sql1);
        if(!$result1) {
            throw new Exception();
        }

        $sql2 = "UPDATE material SET materialname = 'Дерево.Ясень' WHERE ID = '2'";
        $result2 = mysqli_query($link, $sql2);
        if(!$result2) {
            throw new Exception();
        }

        $sql3 = "INSERT INTO products (productname) VALUES ('Комод')";
        $result3 = mysqli_query($link, $sql3);
        if(!$result3) {
            throw new Exception();
        }
    } catch(Exception $e) {
        mysqli_rollback($link);
        echo "Ошибка при выполнении запросов: ". $e->getMessage();
    }
    // ручной вызов коммита
    mysqli_commit($link);

    echo "Запросы успешно выполнены!";