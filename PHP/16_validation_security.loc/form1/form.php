<?php
	// Проверка на наличие не NULL переменных в массиве POST (пустые строки также будут не NULL):
	if(isset($_POST['userName'], $_POST['userEmail'], $_POST['userMessage'])) {
		// защита от XSS вставок:
		print("Имя: " . htmlspecialchars($_POST['userName'])); // htmlspecialchars - преобразует специальные символы в HTML-сущности (не значительно увеличивает результирующую строку, достаточно безопасна)
		print("<br>Email: " . htmlentities($_POST['userEmail'])); // htmlentities - преобразует все возможные символы в HTML-сущности (значительно увеличивает результирующую строку, более безопасна)
		print("<br>Сообщение: " . htmlspecialchars($_POST['userMessage']));

	}
