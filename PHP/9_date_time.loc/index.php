<?php
$lineBreak = "<br>";

echo time() . $lineBreak; // timestam - временная метка в секундах начиная с 01.01.1970

const SECOND_IN_YEAR = 60 * 60 * 24 * 365;
$currentYear = intval(floor(time()/SECOND_IN_YEAR) + 1970) . $lineBreak; // intval() - целое значение, floor() - округление

echo $currentYear . $lineBreak;

echo date("D") . $lineBreak;

echo mktime(0, 0, 0, 2, 20, 2022) . $lineBreak;
//          h, m, s, M, DD, YYYY

echo date_default_timezone_get() . $lineBreak; // Europe/Moscow

echo date_default_timezone_set("Europe/Bratislava") . $lineBreak; // 1 - изменение дефолтного часового пояса
echo date_default_timezone_get() . $lineBreak; // Europe/Bratislava
echo date_default_timezone_set("Europe/Moscow") . $lineBreak;
echo date_default_timezone_get() . $lineBreak;



$myBirthDayTimesStamp = mktime(0, 0, 0, 02, 14, 2025);
$currentTimeStamp = time();

const SECOND_PER_DAY = 60 * 60 * 24;

$daysToNextBirthDay = intval(($myBirthDayTimesStamp - $currentTimeStamp)/SECOND_PER_DAY);

echo "До следующего дня рождения: $daysToNextBirthDay дней!" . $lineBreak;
echo $lineBreak;

$currentDate = "2022-02-23";
$newDate = date("d-m-Y", strtotime($currentDate));
echo $newDate . $lineBreak;
echo $lineBreak;

$fromDate = strtotime("2025-01-01");
$toDate = time();
$subDate = intval(($toDate - $fromDate)/SECOND_PER_DAY);
echo $subDate;


