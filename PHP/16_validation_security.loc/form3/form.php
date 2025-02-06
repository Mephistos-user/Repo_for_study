<?php
    function checkInput($text) {
        $text = trim($text);
        $text = stripcslashes($text);
        $text = htmlspecialchars($text);
        return $text;
    }

	// Инициализация переменных
	$name = $email = $login = $password = "";
    $nameErr = $emailErr = $loginErr = $passwordErr = "";

    // Обработка формы при отправке
    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        if (empty($_POST['userName'])) {
            $nameErr = 'Введите имя';
        } else {
            $name = checkInput($_POST['userName']); // запускаем очистку введенной строки
			if (!preg_match("/^(([a-zA-Z' -]{1,40})|([а-яА-Я' -]{1,40}))$/u", $name)) {
				$nameErr = "Введите корректное имя. Используйте буквы русского или англиского алфавита, пробел, знаки ' или -";
			}
        }

        if (empty($_POST['userEmail'])) {
            $emailErr = 'Введите Email';
        } else {
            $email = checkInput($_POST['userEmail']);
			if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
                $emailErr = 'Введите корректный email';
            }
        }

        if (empty($_POST['userLogin'])) {
            $loginErr = 'Введите логин';
        } else {
            $login = checkInput($_POST['userLogin']);
            if (!preg_match("/^([a-zA-Z0-9-_]{2,20})$/u", $login)) {
                    $loginErr = "Введите корректный логин. Используйте буквы англиского алфавита, цифры, знаки - или _";
                }
        }

        if (empty($_POST['userPassword'])) {
            $passwordErr = 'Введите пароль';
        } else {
            $password = checkInput($_POST['userPassword']);
            if (!preg_match("/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[^\da-zA-Z]).{6,}$/u", $password)) {
                    $passwordErr = "Введите корректный пароль: длина не менее 6 символов, включающий буквы англиского алфавита верхнего и нижнего регистров, цифры и спец.символы";
            }
        }
    }
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
		<form name="userForm" method="POST" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
			<label for="">Ваше имя:<span class="error">*<br><?php echo $nameErr;?></span><input type="text" name="userName"></label>
			<label for="">Ваш логин:<span class="error">*<br><?php echo $loginErr;?></span><input type="text" name="userLogin"></label>
            <label for="">Ваш пароль:<span class="error">*<br><?php echo $passwordErr;?></span><input type="password" name="userPassword"></label>
            <label for="">Ваш email:<span class="error">*<br><?php echo $emailErr;?></span><input type="email" name="userEmail"></label>
            <input type="submit" name="send" value="Зарегистрироваться">
        </form>
		<b>Вы ввели:</b><br>
        Пароль: <?php echo $password;?><br>
    </div>
</body>
</html>