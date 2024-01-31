// O - open-closed principle - принцип открытости / закрытости
// код должен быть открыт к расширению, но закрыт к модификации

// позволяет расширять код не переписывая функционал


/*class Circle {
    constructor(radius) {
        this.radius = radius;
        this.type = 'circle';
    }
}
class Square {
    constructor(size) {
        this.size = size;
        this.type = 'square';
    }
}

class AreaCalc {
    constructor(shapes = []) {
        this.shapes = shapes;
    }

    sum() {
        return this.shapes.reduce((acc, shape) => { // reduce - применяет функцию reducer для каждого значения и возвращает результат
            if(shape.type === 'circle') {
                acc += (shape.radius ** 2) * Math.PI;
            } else if(shape.type === 'square') {
                acc += shape.size ** 2;
            }
            return acc;
        }, 0)
    }
}

const calc = new AreaCalc([new Circle(10), new Square(5)]);
console.log(calc.sum());*/
// проблема возникнет когда мы захотим вычислять площадь другой фигуры или фигур. В этом случае каждый раз нам придется переписывать метод sum()

// решение

class Shape {
    area() {
        throw new Error('Please, implement Area method in your class')
    }
}

class Circle extends Shape {
    constructor(radius) {
        super();
        this.radius = radius;
        this.type = 'circle';
    }
    area () {
        return (this.radius ** 2) * Math.PI;
    }
}
class Square extends Shape {
    constructor(size) {
        super();
        this.size = size;
        this.type = 'square';
    }
    area () {
        return this.size ** 2;
    }
}

class AreaCalc {
    constructor(shapes = []) {
        this.shapes = shapes;
    }

    sum() {
        return this.shapes.reduce((acc, shape) => {

            acc += shape.area();

            return acc;
        }, 0)
    }
}
// теперь мы может добавлять сколько нужно фигур, главное прописывать им свой метод area()

const calc = new AreaCalc([new Circle(10), new Square(5)]);
console.log(calc.sum());
const square = new Square(2);
console.log(square.area());