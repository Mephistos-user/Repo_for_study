<?php
    // Функция валидации
    function checkInput($text) {
        $text = trim($text); // удаляет пробелы (или другие символы) из начала и конца строки
        $text = stripcslashes($text); // удаляет экранирование символов, произведенное функцией addcslashes()
        $text = htmlspecialchars($text); // преобразует специальные символы в HTML-сущности
        return $text;
    }

	// Инициализация переменных
	$name = $email = $gender = $message = "";
    $nameErr = $emailErr = $genderErr = $messageErr = "";

    // Обработка формы при отправке
    // Проверка введенных значений в каждом поле формы, и если они пусты, выводится соответствующее сообщение об ошибке.
    // Если данные введены верно, они сохраняются в переменные $name, $email, $gender и $message.
    // Затем эти данные будут использоваться для отображения в форме результатов.
    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        if (empty($_POST['userName'])) { // проверяет пуста ли переменная
            $nameErr = 'Введите имя';
        } else {
            $name = checkInput($_POST['userName']); // запускаем очистку введенной строки
			if (!preg_match("/^(([a-zA-Z' -]{1,40})|([а-яА-Я' -]{1,40}))$/u", $name)) { // preg_match - выполняет проверку на соответсвие регулярному выражению (проверяет, что введенное имя состоит только буквы русского и английского алфавита, пробелы, дефис и апостров)
            // /^ и $/ - начало и конец регулярного выражения, [a-zA-Z' -] - набор требуемых символов, {1,40} - ограничение по длине строки, флаг 'u' в конце строки - определяет кодировку utf8
				$nameErr = 'Введите корректное имя';
			}
        }

        if (empty($_POST['userEmail'])) {
            $emailErr = 'Введите Email';
        } else {
            $email = checkInput($_POST['userEmail']);
			if (!filter_var($email, FILTER_VALIDATE_EMAIL)) { // filter_var - фильтрует переменную с помощью определенного фильтра (FILTER_VALIDATE_EMAIL - проверяет валидность email)
                $emailErr = 'Введите корректный email';
            }
        }

        if (empty($_POST['userGender'])) {
            $genderErr = 'Выберите пол';
        } else {
            $gender = checkInput($_POST['userGender']);
        }
    }
	$message = checkInput($_POST['userMessage']);
?>



<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FormHTML</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="contact-us">
        <!-- ($_SERVER["PHP_SELF"]) - обработка будет осуществленна в текущем файле -->
		<form name="userForm" method="POST" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
			<label for="">Ваше имя:<span class="error">*<br><?php echo $nameErr;?></span><input type="text" name="userName"></label>
            <label for="">Ваш email:<span class="error">*<br><?php echo $emailErr;?></span><input type="email" name="userEmail"></label>
            <label for="">Ваш пол:<span class="error">*<br><?php echo $genderErr;?></span></label><br>
                Мужской<input class="radioB" type="radio" name="userGender" value="Мужской">
                Женский<input class="radioB" type="radio" name="userGender" value="Женский"><br>
            <label for="">Ваш комментарий:<textarea name="userMessage"></textarea></label>
            <input type="submit" name="send" value="Отправить">
        </form>
		<b>Вы ввели:</b><br>
        Имя: <?php echo $name;?><br>
        Email: <?php echo $email;?><br>
        Пол: <?php echo $gender;?><br>
        Комментарий: <?php echo $message;?><br>
    </div>
</body>
</html>