<?php

$lineBreak = "<br>";
print_r("Welcome, friend!{$lineBreak}");
$straightText = "How are you?";

// стандартные функции
$reverseText = strrev($straightText);
print_r("Straight text: {$straightText}. {$lineBreak} Reverse text: {$reverseText}.{$lineBreak}");

$resultOper = 2 ** 3;
$resultPow = pow(2, 3);
print_r("Res1: {$resultOper}. {$lineBreak} Res2: {$resultPow}. {$lineBreak}");

// функция без аргументов
$randomNumber = rand();
print_r("Random number: {$randomNumber}. {$lineBreak}");

$randomNumber2 = rand(45, 56);
print_r("Random number2: {$randomNumber2}. {$lineBreak}");

// функции с параметром по умолчанию
$floatNumber = 56.4356;
$result = round($floatNumber);
print_r("Rounded: {$result}. {$lineBreak}");
$result = round($floatNumber, 1);
print_r("Rounded to 1: {$result}. {$lineBreak}");
$result = round($floatNumber, 2);
print_r("Rounded to 2: {$result}. {$lineBreak}");

// описание функции:
/*
	function <имя функции> (<аргументы функции>) {
		<тело функции>
		return <резултат вычислений>;
	}
*/
// пользовательская функция без аргументов:
function greetingAndrew() {
	$lineBreak = "<br>"; // область видимости
	return "Hello, Andrew!{$lineBreak}";
}
echo greetingAndrew();
echo greetingAndrew();

// пользовательская функция с аргументом:
function greetingNewPerson($name) {
	$lineBreak = "<br>";
	return "Welcome, {$name}!{$lineBreak}";
}
echo greetingNewPerson("Ivan");

// пользовательская функция с аргументами:
function greetingNewPersonByNewWord($name, $greetingWord) {
	$lineBreak = "<br>";
	return "{$greetingWord}, {$name}!{$lineBreak}";
}
echo greetingNewPersonByNewWord("Max", "Hi");
echo greetingNewPersonByNewWord("Kate", "Welcome");

// пользовательская функция с аргументом по умолчанию:
function greetingName($greetingWord, $name = "Nick") {
	$lineBreak = "<br>";
	return "{$greetingWord}, {$name}!{$lineBreak}";
}
echo greetingName("Hi");
echo greetingName("Hello", "Tom");

// return...
function howReturnWorks() {
	return 8; // инструкция в функции после слова return прекратит выполнение и вернется в место где функция была вызвана
	return 9;
}
echo howReturnWorks(), $lineBreak;

// функция без return - ошибка:
function sum($a, $b) {
	$sum = $a + $b;
}
$resultSum = sum(5, 7); // null - тип NULL
print_r(var_dump($resultSum));
print_r($lineBreak);
print_r(sum(5, 7));
print_r($resultSum);

// функция - это выражение
$firstRow = "Welcome to my website! " . $lineBreak . greetingNewPerson("Bob");

print_r($firstRow);


function sum2($a, $b) {
	$sum = $a + $b;
	return $sum;
}

$a = 7;
$b = 9;
$c = $a + $b + sum2(5, 3);
print_r($c);
print_r($lineBreak);

$minVariable = min(2, 9);
print_r($minVariable);
print_r($lineBreak);

$minVariable2 = min(1+3, 9);
print_r($minVariable2);
print_r($lineBreak);

$negativeNum = -8;
$minVariable3 = min(3, abs($negativeNum));
print_r($minVariable3);
print_r($lineBreak);