function f(key: string): any {
    console.log("f evaluate: ", key);
    return function (target: any, propertyKey: string, descriptor: PropertyDescriptor) {
        console.log("f call: ", key, target, propertyKey, descriptor);
    };
}

function g(key: string): any {
    console.log("g evaluate: ", key);
    return function (target: any, propertyKey: string, descriptor: PropertyDescriptor) {
        console.log("g call: ", key, target, propertyKey, descriptor);
    };
}

@f("Class Decorator")
@g("Class Decorator")
class C {
    @g("Static Property")
    @f("Static Property")
    static prop?: number;

    @f("Static Method")
    @g("Static Method")
    static staticMethod(
        @f("Static Method Parameter")
        @g("Static Method Parameter")
        foo: any
    ) {}

    constructor(@f("Constructor Parameter") @g("Constructor Parameter") foo: any) {} // Декораторы можно писать

    @f("Instance Method")
    @g("Instance Method")
    method (
        @f("Instance Method Parameter")
        @g("Instance Method Parameter")
        foo: any
    ) {}

    @f("Instance Property")
    @g("Instance Property")
    prop?: number;

    @f("Accessor Decorator")
    @g("Accessor Decorator")
    get property() {
        return this.prop;
    }
}

const test = new C('test')
test.method('test')

test.property