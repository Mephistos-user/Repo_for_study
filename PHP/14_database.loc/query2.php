<?php
	// 1. Соединение с базой данных (хост, логин, пароль, название базы данных):
	$link = mysqli_connect("localhost", "root", "", "furniturestore"); // функция возвращает объект - ресурс подключения

	// 2. Проверка корректности соединения:
	if ($link == false) {
		print("Невозможно подключится к MySQL. Ошибка: " . mysqli_connect_error()); // функция ошибки соединения
	} else {
		print("Соединение установленно успешно!<br>");
		mysqli_set_charset($link, "utf8"); // Для работы с кириллицей в конкретном соединении (указываем, что $link будет работать в unf8)
		$date = "15.01.2025";
		$date = date("Y-m-d", strtotime($date));
		echo "Список заказов, совершенных: <b>" . $date . ": </b><br>";

		// 3. SQL-запрос:
		$sql = 'SELECT clients.surname, clients.firstname, clients.secondname, clients.phone, products.productname, material.materialname, orders.orderDate
				 FROM clients 
				 JOIN material JOIN products JOIN orders
				 ON orders.clientID = clients.ID and orders.materialID = material.ID and orders.productID = products.ID
				 WHERE orders.orderDate = \'' .$date. '\';';

		$result = mysqli_query($link, $sql); // в result присвоиться или false, или ссылка на результаты запроса в памяти
		if ($result == false) {
		print("Произошла ошибка при выполнении запроса: " . mysql_error($link)); // функция ошибки последнего запроса
		} else {
			print("<br>Запрос выполнен успешно!<br>");
			while ($row = mysqli_fetch_array($result)) { // вывод с помощью именнованных ключей
			print("<br>Имя клиента: " . $row['surname'] . " " . $row['firstname'] . " " . $row['secondname'] . 
					";<br>Номер телефона: " . $row['phone'] . 
					";<br>Товар: " . $row['productname'] .
					";<br>Материал изготовления: " . $row['materialname'] . "<br><br>");
			}
		}
	}