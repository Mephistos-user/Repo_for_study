// https://www.google.com/search?q=url

// https - протокол передачи данных;
// googlt.com - доменное имя; == IP адрес

// /earch - путь к ресурсу
// ? - после знака вопроса идут параметры


// глобальные объекты: window, document, navigator, console
let win = window; // объект окна браузера

// получить URL-адресс
let winUrl = window.location; // location - объект

// методы открытия/закрытия страниц
// win.open('https://ya.ru');
// win.close();


console.log(win);
console.log(winUrl);

console.log(win.document); // document - объект на основе страницы HTML (можо обратиться к дереву DOM страницы)

console.log(win.document.body); // выведет тело документа
console.log(win.document.getElementsByTagName('div')); // выведет первый попавшийся див

// window.document - доступ к DOM-дереву текущей страницы (можно изменять DOM)
// window.history - доступ к истории браузера
// window.navigator - содержит информацию о браузере и ОС

// работа с таймерами и интервалами
// window.setTimout()
// window.setInterval()

// работа с хранилищами
// window.localStorage
// window.sessionStorage
// document.cookie