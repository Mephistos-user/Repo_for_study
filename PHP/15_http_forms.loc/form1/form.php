<?php
	// Проверка на наличие не NULL переменных в массиве POST (пустые строки также будут не NULL):
	if(isset($_POST['userName'], $_POST['userEmail'], $_POST['userMessage'])) {
		print("Имя: " . $_POST['userName']);
		print("<br>Email: " . $_POST['userEmail']);
		print("<br>Сообщение: " . $_POST['userMessage']);
		$file = $_FILES['userFoto'];
		print("<br>Загружен файл с именем " . $file['name'] . " и размером " . $file['size'] . " байт");
	}
	// Загрузка файла в указанную директорию:
	$current_path = $_FILES['userFoto']['tmp_name']; // текущий путь ('tmp_name' - полный путь к файлу 'userFoto' во временном хранилище на сервере)
	$filename = $_FILES['userFoto']['name']; // присваиваем переменной filename имя ['name'] файла 'userFoto'
	$new_path = dirname(__FILE__) . '/uploads/' . $filename; // генерируем путь(директорию) для сохранения файла на сервере (dirname(__FILE__) - возвращает путь к родительскому каталогу(из которого работает скрипт))
	move_uploaded_file($current_path, $new_path); // перемещает загруженный файл из временного хранилища в новую директорию