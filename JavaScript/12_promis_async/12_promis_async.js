/*
// callback hell - многократный вызов через колбеки
loadNewScript('1.js', function(error, script) {
    if (error) {
        handleError(error);
    } else {
        // ...
        loadNewScript('2.js', function(error, script) {
            if (error) {
                handleError(error);
            } else {
                // ...
                loadNewScript('3.js', function(error, script) {
                    if (error) {
                        handleError(error);
                    } else {
                        // ... и т.д.
                    }
                });
            }
        });
    }
});
*/




/*
// promise - обещание
let promise = new Promise(function(resolve, reject) { // resolve, reject - колбеки
    // executor - исполняющий что-то код
});
// resolve(value);
// reject(error);
*/



// пример применения промиса:
let promise = new Promise(function(resolve, reject) {
    setTimeout( function () {
        let mark = Math.floor(Math.random() * 4) + 2; // Math.floor - округление вниз
        if (mark > 3) {
            resolve(mark);
        }
        reject(mark); // reject(new Error("Whoops!"))
    }, 1000);
});
/*
// метод then - метод объекта Promise - позволяет отреагировать результат работы промиса
promise.then(
    result => console.log(`I,ve got ${result}! The supr is mine.`),
    error => console.log(`Oh, no! i,ve got ${error}!`)
)
*/
/*
// метод catch - метод объекта Promise - 
promise
.then(result => console.log(`I,ve got ${result}! The supr is mine.`))
.catch(result => console.log(`Oh, no! i,ve got ${result}!`));
*/
/*
// метод finally - метод объекта Promise - факт завершения работы самого промиса
promise
.finally(() => console.log(`Promise is Finished`)) // удобен, например, убрать кольцо загрузки страницы после ее успешной загрузки (выполнится независимо от результата)
.then(result => console.log(`I,ve got ${result}! The super is mine.`))
.catch(result => console.log(`Oh, no! i,ve got ${result}!`));
*/