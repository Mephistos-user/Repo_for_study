<?php
$lineBreak = "<br>";
function typeOfAge ($age) {
	$lineBreak = "<br>";
	if ($age > 10 && $age <19) {
		return "Возраст $age является подростковым. {$lineBreak}";
	}
	return "Возраст $age не является подростковым. {$lineBreak}";
}
echo typeOfAge(5);
echo typeOfAge(16);

function typeOfAge1 ($age) {
	$lineBreak = "<br>";
	$str = "Поздравляю!";
	if ($age > 10 && $age <19) {
		return "{$str} Возраст $age является подростковым. {$lineBreak}";
	}
	return "Возраст $age не является подростковым. {$lineBreak}";
}
echo typeOfAge1(5);
echo typeOfAge1(16);

function typeOfAge2 ($age) {
	$lineBreak = "<br>";
	$str = "";
	if ($age > 10 && $age <19) {
		$str = "Возраст $age является подростковым. {$lineBreak}";
	} else {
		$str = "Возраст $age не является подростковым. {$lineBreak}";
	}
	return $str;
}
echo typeOfAge2(5);
echo typeOfAge2(16);


function auth($login, $pass) {
	$passwordFromDB ="1234";
	$loginFromDB = "Alex";
	$result = "";
	$lineBreak = "<br>";

	if ($login === $loginFromDB && $pass === $passwordFromDB) {
		$result = "Добро пожаловать! {$lineBreak}";
	} else {
		if ($login === $loginFromDB) {
			$result = "Проверте пароль. {$lineBreak}";
		} else $result = "Пройдите регистрацию. {$lineBreak}";
	}
	return $result;
}
echo auth("Bob", "825");
echo auth("Alex", "87845");
echo auth("Alex", "1234");


function auth1($login, $pass) {
	$passwordFromDB ="1234";
	$loginFromDB = "Alex";
	$result = "";
	$lineBreak = "<br>";

	if ($login === $loginFromDB && $pass === $passwordFromDB) {
		$result = "Добро пожаловать! {$lineBreak}";
	} elseif ($login === $loginFromDB) {
			$result = "Проверте пароль. {$lineBreak}";
	} else $result = "Пройдите регистрацию. {$lineBreak}";
	return $result;
}
echo auth1("Bob", "825");
echo auth1("Alex", "87845");
echo auth1("Alex", "1234");


// тернарный оператор:
function absUser($num) {
	if ($num >= 0) {
		return $num;
	} else return -$num;
}
echo absUser(-5) . $lineBreak;
echo absUser(10) . $lineBreak;

function absTernar($num) {
	return $num >= 0 ? $num : -$num;
}
echo absTernar(-5) . $lineBreak;
echo absTernar(10) . $lineBreak;


$num = 3;
switch ($num) {
	case 1:
		$str = "Winter";
		break;
	case 2:
		$str = "Spring";
		break;
	case 3:
		$str = "Summer";
		break;
	case 3:
		$str = "Fall";
		break;
	default:
		$str = "Unknown";
		break;
}
echo $str;