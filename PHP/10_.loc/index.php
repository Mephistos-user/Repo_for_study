<?php

// строгая типизация
// declare(strict_types = 1); // декларации применяются для строгой типизации


$lineBreak = "<br>";

// передача аргументов по ссылке и по значению
function sumUser($num) {
	$num = $num + 5;
	return;
}
$a = 3;
echo $a . $lineBreak; // 3
sumUser($a);
echo $a . $lineBreak; // 3 - при передаче по значению исходная переменная не изменяется, в функции операции проводяться с копией переменной

function sumUser1(&$num) {
	$num = $num + 5;
	return;
}
$a = 3;
echo $a . $lineBreak; // 3
sumUser1(&$a);
echo $a . $lineBreak; // 8 - при передаче по ссылке исходная переменная изменяется, в функции операции проводяться с самой переменной
echo $lineBreak;

// type hinting - конкретизация типов
function sumForNumbers(int $firstNum, int $secondNum) {
	var_dump($firstNum);
	var_dump($secondNum);
	$sum = $firstNum + $secondNum;
	return $sum;
}
echo sumForNumbers(5, 8);
echo $lineBreak;

echo sumForNumbers('5', '8');
echo $lineBreak;

echo sumForNumbers(5.5, 8.7);
echo $lineBreak;
echo $lineBreak;

function sumForNumbers1($firstNum, $secondNum) {
	var_dump($firstNum);
	var_dump($secondNum);
	$sum = $firstNum + $secondNum;
	return $sum;
}
echo sumForNumbers1(5, 8);
echo $lineBreak;

echo sumForNumbers1('5', '8');
echo $lineBreak;

echo sumForNumbers1(5.5, 8.7);
echo $lineBreak;
echo $lineBreak;


// рекурсия
/*
power(2, 2) = 2 * 2;
power(2, 3) = 2 * 2 * 2;
power(2, 3) = 2 * power(2, 2);
power($a, $b) = $a * power($a, $b -1);

power(2, 3) = 2 * power(2, 2);
power(2, 2) = 2 * power(2, 1);
power(2, 1) = 2;
*/
function power(int $a, int $b) {
	var_dump($a, $b);
	echo "<br>";
	if ($b === 0) {
		return 1;
	}
	return $a * power($a, $b - 1);
}

echo power(2, 2) . $lineBreak;
echo power(2, 3) . $lineBreak;
echo power(2, 1) . $lineBreak;
echo power(2, 0) . $lineBreak;

// отладка:
// вывод значений переменных

// метки:
// echo "МЕТКА 1";"МЕТКА 1"/"# 1 #"
// exit();

// время работы кода
//microtime(); - текущее время в миллисекундах