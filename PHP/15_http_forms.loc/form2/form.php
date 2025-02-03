<?php
	// функция определения високосный год или нет
	function isLeap($year) {
		return date("L", mktime(0,0,0, 7,7, $year));
	}
	// функция определения дня недели для указанной даты
	function whatDay($date) {
		return date("l", strtotime($date));
	}
	// функция определения дней до следующего дня рождения пользователя
	function daysToBD($dateBD) {
		$currentTimeStamp = time();
		$secsPerDay = 60 * 60 * 24;
		$daysToNextBirthDay = intval((strtotime($dateBD) - $currentTimeStamp)/$secsPerDay);
		return $daysToNextBirthDay;
	}

	// проверка заполнения формы
	if(isset($_POST['userCity'], $_POST['userYear'], $_POST['userDate'], $_POST['userBirthD'])) {
		print("Любимый годод пользователя: " . $_POST['userCity'] . "<br>");

		if(isLeap($_POST['userYear'])) print("Год " . $_POST['userYear'] . " является високосным.<br>");
		else print("Год " . $_POST['userYear'] . " не является високосным.<br>");

		print("Дате: " . $_POST['userDate'] . " соответствует день недели: " . whatDay($_POST['userDate']) . "<br>");

		print("До следующего дня рождения: " . daysToBD($_POST['userBirthD']) . " дней!<br>");
	}
