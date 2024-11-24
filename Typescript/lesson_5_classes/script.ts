class Point {
    protected x: string | number = 0;
    protected y: string | number = 0;
    private readonly _description: string = "This is a point";

    private static readonly privateStaticComment: string = "privateStaticComment"; // static-методы и static-свойства не требуют инициации класса для обращения к ним
    private privateComment: string = "privateComment";
    protected protectedComment: string = "protectedComment";
    protected static protectedStaticComment: string = "privateStaticComment";
    public publicComment1: string = "publicComment1";
    publicComment2: string = "publicComment2";

    constructor(x: string | number, y: string | number) {
        this.x = x;
        this.y = y;
    }

    private _privateMethod () {

    }

    changePoint(x: string | number, y: string | number) {
        // this._description = 'new description'; // readonly property
        // console.log(this.privateStaticComment); // Property 'privateStaticComment' does not exist on type 'Point'
        console.log(Point.privateStaticComment);
        this.x = x;
        this.y = y;
    }
}

type CircleCoordType = string | number;
type CircleColorType = "black" | "white";

interface CircleParams<CircleColor, CircleRadius, CircleCoord> {
    radius: CircleRadius;
    x: CircleCoord;
    y: CircleCoord;
    color: CircleColor;
    draw(): string
}

class Circle<X, Y, R> extends Point implements CircleParams<CircleColorType, number, CircleCoordType> {
    x: CircleCoordType = 0; // поля класса
    y: CircleCoordType = 1; // поля класса
    radius = 1; // поля класса
    color: CircleColorType = "black"; // поля класса

    constructor(x: CircleCoordType, y: CircleCoordType, radius: number, color: CircleColorType) {
        super(x, y);
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    draw() {
        const circle = `
            <svg viewBox="0 0 100 100" xmlns="http://www.w3.org/2000/svg">
                <circle cx="${this.x}" cy="${this.y}" r="${this.radius}" fill="${this.color}" />
            </svg>`
        return circle;
    }

    isIntersectWith({x, y}: {x: X, y: Y}, r: R): boolean {
        /**
         * если сумма радиусов окружностей больше, чем расстояние между центрами окружностей, то окружности пересекаются
         */
        return this.radius + +r > Math.sqrt( ((+x - +this.x) ** 2) + ((+y - +this.y) ** 2) )
    }

    testVisibility() {
        console.log(this.privateComment); //  Свойство PrivateComment является частным и доступно только внутри класса Circle.
        console.log(this.protectedComment); // Свойство protectedComment защищено и доступно только внутри класса Circle и его подклассов.
        console.log(this.publicComment1); // Свойство publicComment1 является общедоступным и доступно вне класса.
        console.log(this.publicComment2); // Свойство publicComment2 является общедоступным и доступно вне класса.
        console.log(Point.privateStaticComment); // Свойство PrivateStaticComment является частным и доступно только внутри класса Point.
        console.log(Point.protectedStaticComment); // Свойство protectedStaticComment защищено и доступно только внутри класса Point и его подклассов.
    }
}

const circle1 = new Circle("50", 10, 20, "black");
console.log(circle1.draw());
console.log(circle1.isIntersectWith({x: 60, y: 60}, 15));

console.log(circle1.changePoint(7, 8));
console.log(circle1.privateStaticComment); //
console.log(Point.privateStaticComment); //
console.log(circle1.protectedComment) //
console.log(circle1.publicComment1) //
console.log(circle1.publicComment2) //
console.log(circle1.protectedStaticComment) //

/**
 * Getters / Setters
 */

class C {
    _length = 0;
    get length() {
        return this._length;
    }
    set length(value) {
        this._length = value;
    }
}

/**
 * Обобщенные классы - классы, в параметрах которого есть дженерик
 */

class Box<Type> {
    contens: Type;
    constructor(value: Type) {
        this.contens = value;
    }
}

const box1 = new Box(10);
const box2 = new Box("10");
const box3 = new Box(true);

/**
 * Абстрактные классы - класс, у которого не может быть создано экземпляров, можно только наследоваться
 */

abstract class Base {
    abstract getName(): string;

    printName() {
        console.log("Hello" + this.getName());
    }
}

const b2 = new Base(); // Невозможно создать экземпляр абстрактного класса.