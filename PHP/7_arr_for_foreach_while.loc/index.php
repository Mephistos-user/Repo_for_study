<?php
$lineBreak = "<br>";

$arr = array(1, 2, 3, 4);
$arr1[] = 1;
$arr1[] = 2;
$arr1[] = 3;
echo $arr[0] . $lineBreak;
echo $arr1[2] . $lineBreak;

$arr2 = array('1' => 3, '2' => 5, '3' => 6);
$arr3[1] = 3;
$arr3[2] = 5;
$arr3[3] = 6;
echo $arr2[3] . $lineBreak;
echo $arr3[2] . $lineBreak;

$arr4 = array('hello' => 'Hi!', '2' => 'world', '3' => 6);
$arr5['hello'] = 'Hi!';
$arr5[2] = 'world';
$arr5[3] = 6;
echo $arr4['hello'] . $lineBreak;
echo $arr5['hello'] . $lineBreak;

$str = "Hello, world!";
echo $str[1] . $lineBreak;


$temperatures = array(-0.4, -2.5, -6.9, -4.6, 0.5, 0.6);
// подсчет среднего значения
$count = count($temperatures);
$sum = 0;
foreach ($temperatures as $temp) {
	$sum += $temp;
}
$average = round($sum / $count);
echo "Средняя максимальная температура за неделю составила {$average} &deg;C.{$lineBreak}";

// rsort - для сортировки по убыванию
rsort($temperatures);
// получаем 3 самых больших значения
$warmestTemps = array_slice($temperatures, 0, 3);
echo "<p>Три самых высоких значения температуры: {$lineBreak}";
foreach($warmestTemps as $warm) {
	echo "{$warm} &deg;C {$lineBreak}";
}

// Выводим минимальные значения
$coolestTemps = array_slice($temperatures, -3, 3);
echo "<p>Три самых низких значения температуры: {$lineBreak}";
foreach($coolestTemps as $cool) {
	echo "{$cool} &deg;C {$lineBreak}";
}
echo $lineBreak;


echo "Многомерный массив случайных чисел: {$lineBreak}";
$arr = [];
for ($i = 0; $i < 10; $i++) { 
	echo "Значения подмассива <b>{$i}</b>: ";
	for ($j = 0; $j < 10; $j++) { 
		$arr[$i][$j] = rand(1, 10);
		echo $arr[$i][$j] . " ";
	}
	echo $lineBreak;
}
echo $lineBreak;


$users = array(
	array(
		"userName" => "Stanley",
		"login" => "stan1994",
		"password" => "pasForStan94"
	),
	array(
		"userName" => "Martin",
		"login" => "mrMartin78",
		"password" => "12345Martin"
	),
	array(
		"userName" => "George",
		"login" => "KingGeorge",
		"password" => "sayHi67"
	)
);
echo "Данные пользователей: {$lineBreak}";
foreach ($users as $user) {
	foreach ($user as $key => $value) {
		echo "{$key}: {$value}{$lineBreak}";
	}
	echo $lineBreak;
}
echo $lineBreak;

echo "Сумма квадратов чисел в установленном диапазоне: {$lineBreak}";
$sum = 0;
for ($i = 1; $i <= 25 ; $i++) { 
	$sum += pow($i, 2);
}
echo $sum . $lineBreak;
echo $lineBreak;


function greetings($language, $name) {
	$greetingsArr = array('ru' => 'Привет',
						  'en' => 'Hello',
						  'fr' => 'Salut',
						  'it' => 'Ciao');
	$text = $greetingsArr[$language] . ", " . $name . ".";
	return $text;
}
echo "Приветствие на русском языке: " . "<b>" . greetings('ru', 'Алексей') . "</b>{$lineBreak}";
echo "Приветствие на русском языке: " . "<b>" . greetings('en', 'George') . "</b>{$lineBreak}";
echo "Приветствие на русском языке: " . "<b>" . greetings('fr', 'Alana') . "</b>{$lineBreak}";
echo "Приветствие на русском языке: " . "<b>" . greetings('it', 'Felice') . "</b>{$lineBreak}";
echo $lineBreak;


function userOutput() {
	$i = 1;
	while ($i <= 100) {
		echo $i . "<br>";
		$i = $i + 1;
	}
	return;
}
// userOutput();

// зацикливание:
// function userOutput1() {
// 	$i = 1;
// 	while ($i > 0) {
// 		echo $i . $lineBreak;
// 		$i = $i + 1;
// 	}
// 	return;
// }
// userOutput1();


function sum($firstNumber, $secondNumber) {
	$i = $firstNumber;
	$sum = 0; // нейтральный элемент для сложения
	while($i <= $secondNumber) { // количество иттераций $secondNumber - $firstNumber + 1 = 7
		echo $sum . " + " . $i . "<br>";
		$sum = $sum + $i;
		// $i += 1;
		$i++;
	}
	return $sum;
}
echo sum(3, 9) . "<br>";

$str = "Anna";
$nLetter = 0;
$i = 0;
while($i < strlen($str)) {
	if($str[$i] === 'n') {
		$nLetter = $nLetter + 1;
	}
	$i = $i + 1;
}
echo "В имени {$str} букв 'n': {$nLetter}. <br>";


function strRevUser($str) {
	$i = 0;
	$newStr = "";
	while($i < strlen($str)) {
		$newStr = $newStr . $str[(strlen($str) -1) - $i];
		$num = (strlen($str) -1) - $i;
		echo "Текущая строка " . $newStr . ". Текущий номер символа " . $num . "<br>";
		$i++;
	}
	return $newStr;
}
echo strRevUser("Alex");
echo "<br>";

function isPrime($num) {
	$div = 2;
	while($div <= $num/2) {
		if ($num % $div === 0) {
			return false;
		}
		$div++;
	}
	return true;
}
var_dump(isPrime(17));
echo "<br>";
var_dump(isPrime(16));
echo "<br>";


$div = 2;
$num = 8;
$result = "";
while($div <= $num/2) {
	if ($num % $div === 0) {
		$result = "Не является простым!";
		break;
	}
	$div++;
}
echo $result . "<br>";


function strRevUserFor($str) {
	$newStr = "";
	for($i = 0; $i < strlen($str); $i++) {
		$let = $str[$i];
		$newStr = "{$let}{$newStr}";
		$num = (strlen($str) -1) - $i;
		echo "Текущая строка " . $newStr . ". Текущий номер символа " . $num . "<br>";
	}
	return $newStr;
}
echo strRevUserFor("Andrew");
echo "<br>";