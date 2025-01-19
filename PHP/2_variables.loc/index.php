<?php

// Переменные
$lineBreak = "<br>";

$a = 5;
echo $a, "<br>";
$a = $a + 6;
echo $a, "<br>";
$a = "Ha-ha";
echo $a, "<br>";

// $my-kebab-variable; // error
$my_snake_variable;
$myCamelCaseVariable; // Must have in PHP

$secondsPerMinute = 60;
$minutePerHour = 60;

$houresCount = 2;

$secondsCount = $secondsPerMinute * $minutePerHour * $houresCount;

echo $secondsCount, "<br>";

// константы
const E = 2.17;
echo E, "<br>";

// интерполяция
$greeting = "Hello";
$name = "Andrew";
echo "{$greeting}, {$name}", "<br>";

// переменные переменных:
$varA = 50;
$varB = 70;
$pupil = "varA";
echo "Количество учеников: ${$pupil}. {$lineBreak}";
$student = "varB";
echo "Количество студентов: ${$student}. {$lineBreak}";

$varC = "Hello";
$$varС = "world";
echo "{$varC} + ${$varC}{$lineBreak}";
// echo "{$var} + $hello"{$lineBreak};