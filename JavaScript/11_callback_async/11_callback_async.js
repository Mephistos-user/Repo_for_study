// асинхроность - колбэки:
/*
// прямой порядок процессов/потоков
function first() {
    return "I'm the first";
};

function second() {
    return "I'm the second";
};

console.log(first());
console.log(second());
*/
/*
// таймаут - ожидание по времени
function first() {
    setTimeout( function() { // при вызове этой вункции она будет ждать 1000 миллисекунд потом выполняться
        console.log("I'm the first");
    }, 1000);
};

function second() {
    console.log("I'm the second");
    return "I'm the second";
};

first();
second();
*/


