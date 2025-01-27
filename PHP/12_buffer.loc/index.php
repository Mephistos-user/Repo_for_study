<?php
	echo "<p><b>Пример 1. 3 буфера вывода</b></p>";
	// включаем буфер
	ob_start();
	echo '<p>Буфер 1</p>';
	// отключаем буфер вывода и отправляем в браузер
	ob_end_flush();

	// включаем буфер
	ob_start();
	echo '<p>Буфер 2</p>';
	// отключаем и очищаем буфер
	ob_end_clean();

	// включаем буфер
	ob_start();
	echo '<p>Буфер 3</p>';
	ob_flush();
	ob_end_clean();


/*
ob = output buffer
ob_start()     - "открываем буфер вывода"
ob_clean()     - "очищаем буфер вывода"
ob_flush()     - "отправляем буфер вывода"
ob_end_clean() - "отключаем и очищаем буфер вывода"
ob_end_flush() - "отключаем буфер вывода и отправляем в браузер"
ob_get_clean() - "получаем(без отправки в браузер) буфер вывода, очищаем и отключаем"
ob_get_flush() - "отправляем буфер вывода, очищаем и отключаем"
*/

echo "<p><b>Пример 2. Сохранение данных</b></p>";
ob_start(); // включаем буфер
{
	echo "<p>hello world</p>"; // выводим информацию
	$content = ob_get_contents(); // сохраняем все, что есть в буфере в переменную $content
}
ob_end_clean(); // отключаем и очищаем буфер

echo $content;

$content = "";


echo "<p><b>Пример 3. Функция-обработчик буфера</b></p>";
function ob_handler ($buffer) { // колбек функция для буфера
	return "Length of string '$buffer' is " . strlen($buffer);
}
ob_start('ob_handler');
echo "Hello world!";
ob_flush();
ob_end_clean();



echo "<p><b>Пример 4. Буфер внутри буфера внутри буфера...</b></p>";
echo ob_get_level() . "<br>"; // получить уровень буфера
ob_start();
	echo ob_get_level() . "<br>";
	ob_start();
		echo ob_get_level() . "<br>";
		ob_start();
			echo ob_get_level() . "<br>";
		ob_end_flush();
	ob_end_flush();
ob_end_flush();


echo "<p><b>Пример 5. Буфер внутри буфера внутри буфера...</b></p>";
ob_start();
{
	ob_start();
	echo '<p>Вывод второго буфера</p>';
	ob_end_flush();

	echo '<p>Вывод первого буфера</p>';

	ob_start();
	echo '<p>Вывод третьего буфера</p>';
	ob_end_flush();
}
ob_end_flush();
// ob_end_clean(); // очистка буфера вывода верхнего уровня очистит и все данные вложенных буферов


// Задачи:
$lineBreak = "<br>";
echo $lineBreak;
echo "<b>Задание 1. Порядок вывода информации:</b>{$lineBreak}";
ob_start();
	echo "Первая строка{$lineBreak}";
	$firstRow = ob_get_contents();
ob_end_clean();
echo "Вторая строка{$lineBreak}";
echo $firstRow;
echo $lineBreak;

echo "<b>Задание 2. Callback функция:</b>{$lineBreak}";
function ob_handler2 ($buffer) {
	$newString = "";
	while ($i < strlen($buffer)) {
		$newString = $newString . $buffer[(strlen($buffer) - 1) - $i];
		$i++;
	}
	return $newString;
}
ob_start("ob_handler2");
	echo "Reverse string.";
ob_end_flush();
echo $lineBreak;

echo "<b>Задание 3. Вложенные буферы вывода:</b>{$lineBreak}";
echo "Это исходный код.{$lineBreak}";
echo ob_get_level();
ob_start();
	echo ob_get_level();
	ob_start();
		echo ob_get_level();
		ob_start();
			echo ob_get_level();
		ob_end_flush();
	ob_end_flush();
ob_end_flush();
echo $lineBreak;


echo "Это итоговый код.{$lineBreak}";
echo ob_get_level();
ob_start();
	ob_start();
		ob_start();
			echo ob_get_level();
		ob_end_flush();
		echo ob_get_level();
	ob_end_flush();
	echo ob_get_level();
ob_end_flush();
echo ob_get_level();
echo $lineBreak;