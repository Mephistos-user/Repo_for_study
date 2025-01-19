<?php
$lineBreak = "<br>";

// heredoc
$information = <<<INFO
Name: John Smith
Adress: 123 Main St
City: Springville, CA
INFO;

echo ($information . $lineBreak);
echo $lineBreak;

$information = <<<INFO
Name: John Smith
Adress: 123 Main St
City: Springville, CA
INFO;

echo nl2br($information); // вывод с соблюдением форматирования
echo $lineBreak.$lineBreak;

$information = <<<INFO
"Аптеку позабудь ты для венков лавровых
И не мори больных, но усыпляй здоровых"
INFO;

echo nl2br($information);
echo $lineBreak.$lineBreak;

$date = "010224";
echo substr(chunk_split($date, 2, '.'), 0, -1); // chunk_split() разделяет строку указанными символами через каждое указанное количество символов
echo $lineBreak.$lineBreak;

$date = "Я считаю до пяти";
if (strpos($date, 'пяти') !== false) {
	echo "Слово присутствует в строке. {$lineBreak}";
} else {
	echo "Слова в строке нет. {$lineBreak}";
}
echo $lineBreak.$lineBreak;

$pathToFile = "C:/OpenServer/domains/localhost/index.php";
$fileName = substr(strrchr($pathToFile,'/'), 1); // strrchr() - ищет номер позиции последнего указанного символа (первый справа налево)
echo $fileName;
echo $lineBreak.$lineBreak;


// кодировка / локальный алфавит
$strEn = "Hello";
$strRu = "Привет";

echo strlen($strEn) . $lineBreak; // 5
echo strlen($strRu) . $lineBreak; // 12

echo mb_strlen($strRu) . $lineBreak; // 6

echo $strRu[2] . $lineBreak; // ???
echo mb_substr($strRu, 2, 1) . $lineBreak; // и

// получение подстроки
echo strpos("Hello, world!", "ello") . $lineBreak; // 1 (индекс начала подстроки)
echo mb_strpos("Привет, мир!", "мир") . $lineBreak; // 8 (индекс начала подстроки)

if(strpos("Hello world", "Hello")) { // 0 (index) приводится к false, поэтому код в теле не выполнится
	echo "Find! <br>";
}

if(strpos("Hello world", "Hello") !== false) { // 0 (index) не приводится к false, а происходит строгое сравнение
	echo "Find! <br>";
}