<?php
// XSS-уязвимость - возможность встраивания скриптов прямо в страницу (например в поле ввода)
	// вот так уязвимо (в поле ввода можно ввести скрипт):
	if(isset($_POST['form'])) {
		echo "Заголовок: ", $_POST['title'], '<br>';
		echo "Текст: ", $_POST['content'];
	}
	// так безопаснее (использовать специальные функции проверки символов)
	/*
	if(isset($_POST['form'])) {
		echo "Заголовок: ", htmlspecialchars($_POST['title'], ENT_QUOTES,'UNF-8'), '<br>';
		echo "Текст: ", htmlspecialchars($_POST['content'], ENT_QUOTES,'UNF-8'), '<br>';
	}
	*/
?>
<form method="POST">
	<p>Заголовок: <input name="title"></p>
	<p>Тектс: <textarea name="content"></textarea></p>
	<p><button name="form">Отправить!</button></p>
</form>

<!-- Способ - заменять знаки на мнемоники:-->
<div>
	Абзац &para; <br>
	Перевернутый знак вопроса &iquest; <br>
	Знак умножения (крестик) &times; <br>
	Стрелка влево &larr; <br>
	Типографический крестик &dagger; <br>
	Копирайт &copy; <br>
</div>