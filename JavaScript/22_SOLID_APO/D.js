// D - dependency inversion principle - принцип инверсии зависимостей
// классы должны зависеть от абстракций, а не от конкретных деталей. Используется для минимизации зацепления в компьютерных программах

/*class Database { // зависит от конкретных реализаций методов и нам приходится каждый раз переписывать код
    constructor() {
        // this.fetch = new Fetch();
        // проблема - теперь мы работаем не с базой данной, а с localstorage (Fetch устарел для нас)
        this.localStorage = new LocalStorage();
    }

    getData() {
        // return this.fetch.request('any.url');
        // проблема - теперь мы работаем не с базой данной, а с localstorage (Fetch устарел для нас)
        return this.localStorage.get();
    }
}

class Fetch {
    request(url) {
        return Promise.resolve('test data');
    }
}

// проблема - теперь мы работаем не с базой данной, а с localstorage (Fetch устарел для нас)
class LocalStorage {
    get() {
        const localStorageData = 'new test data';
        return localStorageData;
    }
}

const db = new Database();
console.log(db.getData());*/

//решение
class Fetch {
    request(url) {
        return Promise.resolve('test data');
    }
}

class LocalStorage {
    get() {
        const localStorageData = 'new test data';
        return localStorageData;
    }
}

class FetchClient {
    constructor() {
        this.fetch = new Fetch();
    }

    clientGet(url) {
        return this.fetch.request(url);
    }
}

class LocalStorageClient {
    constructor() {
        this.localStorage = new LocalStorage;
    }
    clientGet(key) {
        return this.localStorage.get(key);
    }
}


class Database {
    constructor(client) {
        this.client = client;
    }

    getData(url) {
        return this.client.clientGet(url);
    }
}



const db = new Database(new FetchClient);
console.log(db.getData('any url'));
const db1 = new Database(new LocalStorageClient);
console.log(db1.getData('key'));