// S - Single-responsibility principle - принцип единственной ответственности

class News { // класс отвечает за создание контента новостей и их обновление
    constructor(title, text) {
        this.title = title;
        this.text = text;
        this.modified = false;
    }

    updateNews (text) {
        this.text;
        this.modified = true;
    }
/*    // проблема
    toHTML() { // потом захотели еще добавить шаблонизатор...
        return `
        <div class = "news">
            <h1>${this.title}</h1>
            <p>${this.text}</p>
        </div>`
    }
    toJSON() { // ...и перевод в формат JSON
        return JSON.stringify({
            title: this.title,
            text: this.text,
            modified: this.modified
        }, null, 2)
    }*/

}

const news = new News('Что такое SOLID?', 'SOLID - это аббривиатура пяти основных принципов проектирования в ООП');
console.log(news);


// решение - вынести новый функционал в отдельный объект
class NewsFormater { 
    constructor(news) {
        this.news = news;
    }

    toHTML() {
        return `
        <div class = "news">
            <h1>${this.title}</h1>
            <p>${this.text}</p>
        </div>`
    }
    toJSON() {
        return JSON.stringify({
            title: this.title,
            text: this.text,
            modified: this.modified
        }, null, 2)
    }
}

