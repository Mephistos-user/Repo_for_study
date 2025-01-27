<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Урок 11</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <header>
        <nav class="container">
            <ul id="menu">
                <?php
                    include 'template.php';
                ?>
            </ul>
        </nav>
    </header>
    <div class="container">
        <div class="posts-list">
            <article id="post-1" class="post">
                <div class="post-content">
                    <div class="category">
                        <a href="#">Первая категория основного контента</a>
                    </div>
                    <h2 class="post-title">Первый пост</h2>
                    <p>Здесь какая-то информация из первого поста</p>
                </div>
            </article>
        </div>
    </div>
    <footer>
        <div class="container">
            <div class="footer-col"><span>Мой первый сайт 2022</span></div>
        </div>
    </footer>
</body>
</html>