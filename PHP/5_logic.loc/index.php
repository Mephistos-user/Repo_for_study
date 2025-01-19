<?php
// операторы сравнения:

$lineBreak = "<br>";
$a = 67;
$b = 56;
$d = $a > $b;
echo $d . $lineBreak;
var_dump($d);
print_r($lineBreak);

$d = $a < $b;
echo $d . $lineBreak;
var_dump($d);
print_r($lineBreak);

$d = $a >= $b;
echo $d . $lineBreak;
var_dump($d);
print_r($lineBreak);

$d = $a <= $b;
echo $d . $lineBreak;
var_dump($d);
print_r($lineBreak);

$d = $a === $b;
echo $d . $lineBreak;
var_dump($d);
print_r($lineBreak);

$d = $a !== $b;
echo $d . $lineBreak;
var_dump($d);
print_r($lineBreak);
// нежелательные операторы:
$d = $a == $b;
echo $d . $lineBreak;
var_dump($d);
print_r($lineBreak);
$d = $a != $b;
echo $d . $lineBreak;
var_dump($d);
print_r($lineBreak);

// функция предикат (возвращает true или false):
function isTeen ($age) {
	return $age < 19;
}
var_dump(isTeen(25));
print_r($lineBreak);
var_dump(isTeen(12));
print_r($lineBreak);

function isTeenCorrect ($age) {
	return $age < 19 && $age > 10; // 
}
var_dump(isTeenCorrect(25));
print_r($lineBreak);
var_dump(isTeenCorrect(12));
print_r($lineBreak);
var_dump(isTeenCorrect(8));
print_r($lineBreak);

function isPasswordCorrect($pass) {
	$passGoldenStandart = "1234";
	return $pass === $passGoldenStandart;
}
echo "Является ли пароль корректным? ";
var_dump(isPasswordCorrect("1234"));
print_r($lineBreak);
echo "Является ли пароль корректным? ";
var_dump(isPasswordCorrect("1234sfgg"));
print_r($lineBreak);

// логические:
// && - логическое И/умножение/конъюнкция. true И true = true
// || - логическое ИЛИ/деление/дизъюнкция. true ИЛИ false = true
// ! - логическое НЕ/инверсия. НЕ true = false
// !! - логическое НЕ(НЕ)/двойная инверсии. НЕ(НЕ true) = true

function isEven($num) {
	return $num % 2 === 0;
}
echo "Является ли число четным? ";
print_r($lineBreak);
var_dump(isEven(6));
print_r($lineBreak);
var_dump(isEven(9));
print_r($lineBreak);

// 0, '', null - false(0)
// любое другое - true(1)

echo 0 || 1;
print_r($lineBreak);
echo "var_dump(0 === false)" . var_dump(0 === false);
print_r($lineBreak);
echo "var_dump(0 == false)" . var_dump(0 == false);
print_r($lineBreak);
echo "var_dump('' === false)" . var_dump('' === false);
print_r($lineBreak);
echo "var_dump('' == false)" . var_dump('' == false);
print_r($lineBreak);
echo "var_dump(null === false)" . var_dump(null === false);
print_r($lineBreak);
echo "var_dump(null == false)" . var_dump(null == false);
print_r($lineBreak);