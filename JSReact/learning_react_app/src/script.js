
// получить элемент по id
let element = document.getElementById('id');

// получить элемент по имени класса
let elementByClassName = document.getElementsByClassName('.className');

// получить элемент по тегу
let elementByTag = document.getElementsByTagName('div');

// получить все элементы по тегу
let elements = document.querySelectorAll('div');

// добавляем класс к элементу
element.classList.add('newClassName');

// удалить класс у элемента если он существует
element.remove('newClassName');

// проверить есть ли такой класс у элемента
let bool = element.classList.contains('newClassName');
if(bool) {
    console.log('yes');
}

// переопределить имя тега
element.innerHTML = '<button>MY_BUTTON</button>';

// поменять текст в кнопке
element.innerText = 'Наша новая кнопка';

// изменить/удалить аттрибут
//           имя аттрибута, значение аттрибута
element.setAttribute('src', '../src/img.png');

// получить значение аттрибута
let atrButton = element.getAttribute('src'); // '../src/img.png'

// удалить аттрибут
element.removeAttribute('src');

// обработчик событий
//                   какое событие, функция которая будет выполняться
element.addEventListener('click', (event) => {
    console.log(event);
});

// удалить обработчик событий
element.removeEventListener('click', () => {
    console.log('клик удален');
});

