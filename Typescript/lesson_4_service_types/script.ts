/** Служебные */

/**
 * Partial<Type> - тип, где все поля исходного типа отмеаются как опциональные
 * полезен для обновления нескольких полей в объекте
 */

interface Todo {
    title: string;
    description: string;
}

function updateTodo(todo: Todo, fieldsToUpdate: Partial<Todo>) {
    return {...todo,...fieldsToUpdate };
}

const todo1 = {
    title: 'Задача 1',
    description: 'Описание задачи 1',
};

const todo2 = updateTodo(todo1, {
    description: 'Обновленное описание задачи 1',
});

/**
 * Required<Type> - создает тип, где все поля исходного типа будут обязательными
 */

interface Props {
    a?: number;
    b?: string;
}

const obj: Props = {a: 5};

// const obj2: Required<Props> = {a: 5}; // Ошибка, т.к. все поля Props стали обязательными
const obj3: Required<Props> = {a: 5, b: 'asd'};

/**
 * Readonly<Type> - выставляет все поля исходного типа в состояние Read-only
 */


interface Todo2 {
    title: string;
    description: string;
}

const todo3: Todo2 = {
    title: 'Задача 2',
    description: 'Описание задачи 2',
};

const todo4: Readonly<Todo2> = todo3;

// todo4.description = 'Измененное описание задачи 2'; // Ошибка, т.к. поле description стало Read-only

/**
 * Record<Keys, Type> - можно сконструировать объектный тип
 */

type Record1 = Record<'phone' | 'email', string>

/** Пример посложнее */
interface CatInfo {
    age: number;
    breed: string
}

type CatName = 'miffy' | 'boris' | 'mordred';

const cats: Record<CatName, CatInfo> = {
    miffy: { age: 5, breed: 'Persian' },
    boris: { age: 3, breed: 'British Shorthair' },
    mordred: { age: 7, breed: 'Maine Coon' },
}

cats.boris;

/**
 * Pick<Type, Keys> - создает тип, выбирая некоторые ключи из исходного типа
 */

interface Todo3 {
    title: string;
    description: string;
    completed: boolean
}

type TodoFields = Pick<Todo3, 'title' | 'description'>;

const todo5: TodoFields = {
    title: 'Задача 3',
    description: 'Описание задачи 3',
};

/**
 * Omit<Type, Keys> - создает новый тип, удаляя указанные ключи из исходного
 */

interface Todo4 {
    title: string;
    description: string;
    completed: boolean;
    dueDate: Date;
}

type TodoOmittedFields = Omit<Todo4, 'completed' | 'dueDate'>;

const todo6: TodoOmittedFields = {
    title: 'Задача 4',
    description: 'Описание задачи 4',
};

/**
 * NonNullable<Nype> - исключает null и underfind из типа Type
 */
type T0 = NonNullable<string | number | undefined>;
// type T0 = string | number;

type T1 = NonNullable<string[] | null | undefined>;
// type T1 = string[];

/**
 * Служебные типы для работы с объединением (Union)
 */

type T0 = Exclude<'a' | 'b' | 'c', 'a'>;
// type T0 = 'b' | 'c'

type T1 = Extract<'a' | 'b' | 'c', 'a' | 'b'>;
// type T1 = 'c'

type T2 = Exclude<string | number | (() => void), Function>;
// type T2 = string | number


type T3 = Extract<'a' | 'b' | 'c', 'a' | 'f'>;
// type T3 = 'a'

type T4 =Extract<string | number | (() => void), Function>;
// type T4 = () => void

/**
 * Служебные типы для работы с функциями и классами
 */

type T0 = Parameters<() => string>;
// type T0 = []

type T1 = Parameters<(s: string) => void>;
// type T1 = [s: string]

type T2 = Parameters<<T>(arg: T) => T>;
// type T2 = [arg: unknown]

/**
 * ConstructorParameners<Type>
 */

class C {
    constructor(a: number, b: string) {}
}

type T3 = ConstructorParameters<typeof C>;
// type T3 = [a: number, b: string]

/**
 * ReturnType<Type>
 */

declare function f1(): { a: number, b: string};

type T4 = ReturnType<typeof f1>;
// type T4 = { a: number, b: string }

type T5 = ReturnType<() => string>;
// type T5 = string

type T6 = ReturnType<(s: string) => void>;
// type T6 = void

type T7 = ReturnType<<T>() => T>;
// type T7 = unknown

type T8 = ReturnType<<T extends U, U extends number[]>() => T>;
// type T8 = number[]


