<?php
    // библиотека GUMP - для валидации форм
    // С помощью пакетного менеджера Composer переходим в папку с проектом C:\OSPanel\domains\forms.loc
    // Запускаем консольную команду: composer require wixel/gump
    // Затем вставляем require 'vendor/autoload.php' в этот файл 
    require 'vendor/autoload.php';

    function checkInput($text) {
        $text = trim($text);
        $text = stripcslashes($text);
        $text = htmlspecialchars($text);
        return $text;
    }

    // Заполняем правила валидации
    $rules = [
        'email' => 'required|valid_email', // valid_email -валидация email
        'password' => 'required|min_len,8',
        'login' =>'required|alpha_num', // alpha_num - буквы и цифры
    ];
    
    // Инициализируем экземпляр GUMP и применяем правила к $_POST
    $gump = new GUMP('ru'); // создаем новый объект GUMP
    $gump->validation_rules($rules); // задаем правила для объекта gump
    $validated_data = $gump->run($_POST); // 
    
    // Если валидация не пройдена выводим ошибки
    if (!$validated_data) {
        $errors = $gump->get_error_array();
        foreach ($errors as $error) {
            echo $error. '<br>';
        }
    } else {
        // Здесь вы можете добавить код для сохранения введенных данных в базу данных или другим образом
        echo 'Все поля заполнены верно!';
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