<?php
	// 1. Соединение с базой данных (хост, логин, пароль, название базы данных):
	$link = mysqli_connect("localhost", "root", "", "testDataBase"); // функция возвращает объект - ресурс подключения

	// 2. Проверка корректности соединения:
	if ($link == false) {
		print("Невозможно подключится к MySQL. Ошибка: " . mysqli_connect_error()); // функция ошибки соединения
	} else {
		print("Соединение установленно успешно!<br>");
	}

	mysqli_set_charset($link, "utf8"); // Для работы с кириллицей в конкретном соединении (указываем, что $link будет работать в unf8)
	
	// 3. SQL-запрос:
	// $sql = 'SELECT id, Name, Phone FROM Clients';
	$sql = 'SELECT id, Name, Phone FROM Clients ORDER BY Name LIMIT 2';

	$result = mysqli_query($link, $sql); // в result присвоиться или false, или ссылка на результаты запроса в памяти
	// echo var_dump($result) . "<br>"; // object(mysqli_result)#2 (5) { ["current_field"]=> int(0) ["field_count"]=> int(3) ["lengths"]=> NULL ["num_rows"]=> int(2) ["type"]=> int(0) }
	// 																						количество полей 							количество строк

	echo "<br>Количество строк в таблице клиентов: " . mysqli_num_rows($result);

	// 4. Парсинг резултата:
		
	while ($row = mysqli_fetch_array($result)) { // вывод с помощью именнованных ключей
		print("<br>Имя клиента: " . $row['Name'] . ";<br>Идентификатор: " . $row['id'] . ";<br>Телефон: " . $row['Phone'] . "<br>");
	}
		
	/*while ($row = mysqli_fetch_array($result, MYSQLI_NUM)) { // вывод с помощью индексов
		print("<br>Имя клиента: " . $row[1] . ";<br>Идентификатор: " . $row[0] . ";<br>Телефон: " . $row[2] . "<br>");
	}*/


	// Получить весь массив данных:
	/*$rows = mysqli_fetch_all($result, MYSQLI_ASSOC);
	foreach ($rows as $row) {
		print("<br>Имя клиента: " . $row['Name'] . ";<br>Идентификатор: " . $row['id'] . ";<br>Телефон: " . $row['Phone'] . "<br>");
	}*/

	// Добавить данные в таблицу:
	// $sqlClient = 'INSERT INTO Clients SET Name = "Андрей", Phone = "8(910)222-22-22"';
	$sqlClient = 'INSERT INTO Clients (Name, Phone) VALUES ("Светлана", "8(928)963-25-14")';
	$resultClient = mysqli_query($link, $sqlClient);
	$callIdClient = mysqli_insert_id($link); // функция возвращает id последней добавленной записи
	if ($resultClient == false) {
		print("Произошла ошибка при выполнении запроса: " . mysql_error($link)); // функция ошибки последнего запроса
	} else {
		print("<br>Запрос на добавление данных в таблицу Clients выполнен успешно!<br>");
	}

	$sql = "INSERT INTO call_center (id_clients, id_operators, problem, status) VALUES ('". $callIdClient ."', '2', 'Problem 5', 'Solution')";
	echo "<br>Запрос на новый отчет о звонке: " . $sql;
	$result = mysqli_query($link, $sql);
	if ($result == false) {
		print("Произошла ошибка при выполнении запроса: " . mysql_error($link)); // функция ошибки последнего запроса
	} else {
		print("<br>Запрос на добавление данных в таблицу call_center выполнен успешно!<br>");
	}