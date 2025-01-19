<?php

$lineBreak = "<br>";
$greeting = "Welcom";
$clientName = "Alex";
echo "{$greeting}, {$clientName}!{$lineBreak}";

$priceOfBookOne = 60;
$priceOfBookTwo = 17;
$discount = 30;
$bookCount = 2;

// бинарные операторы
$totalPrice = $priceOfBookTwo + $priceOfBookOne;

echo "Total price: {$totalPrice}.{$lineBreak}";

$totalPrice = $totalPrice - $discount;
echo "Total price with discount: {$totalPrice}.{$lineBreak}";

$totalPrice = $priceOfBookTwo * $bookCount + $priceOfBookOne * $bookCount - $discount;
echo "Total price for 2x2 books with discount: {$totalPrice}.{$lineBreak}";


$totalPrice = $priceOfBookOne / $discount;
echo "Total with discount: {$totalPrice}. {$lineBreak}";

// остаток от деления
$totalPrice = $priceOfBookOne % $priceOfBookTwo; // вычисление остатка от деления %
echo "Total: {$totalPrice}.{$lineBreak}";

// степень
$totalPrice = $priceOfBookTwo ** $bookCount; // возведение в степень **
echo "Total: {$totalPrice}.{$lineBreak}";


// унарный оператор
$positiveNumber = 78;
$negativeNumber = -$positiveNumber; // унарный оператор "-"
$count = $positiveNumber + $negativeNumber * 3;
echo $count;

// ассоциативность
$a = 7;
$b = 6;
$c = 5;

$d = $a - $b - $c; // - левоассоциативный оператор: вычисления идут слева на право

$a = $b = $c; // = правоассоциативный оператор: сначала "b" присвоится значение "c", затем "a" присвоится значение "b"

// Комбинированные операторы:
$variable = 0;

// Увеличение на 7:
$variable += 7;
echo "Комбинированнный оператор <b>сложения</b>: {$variable}.{$lineBreak}";

// Увеличение в 4 раза:
$variable *= 4;
echo "Комбинированнный оператор <b>умножения</b>: {$variable}.{$lineBreak}";

// Уменьшение на 8:
$variable -= 8;
echo "Комбинированнный оператор <b>вычитания</b>: {$variable}.{$lineBreak}";

// Деление на 4:
$variable /= 4;
echo "Комбинированнный оператор <b>деления</b>: {$variable}.{$lineBreak}";

// Возведение в 3 степень:
$variable **= 3;
echo "Комбинированнный оператор <b>возведения в степень</b>: {$variable}.{$lineBreak}";

// Вычисление остатка при делении на 3:
$variable %= 3;
echo "Комбинированнный оператор <b>остатка от деления</b>: {$variable}.{$lineBreak}";