// Модификация кода во время выполнения программы
// Reflection

/* Рефлексия в Java предоставляет мощные инструменты для работы с метаданными классов,
полей, методов и конструкторов во время выполнения программы.Это дает разработчикам
возможность динамически исследовать и изменять поведение объектов. Такая гибкость очень
полезна при создании универсальных библиотек и фреймворков.. В этом уроке мы научимся
использовать рефлексию для получения информации о классе Person и его элементах, а также
рассмотрим, как динамически вызывать методы и создавать экземпляры классов.
*/

public class Person {
    public String name;
    private int age;
    protected String address;
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    private void setAge(int age) {
        this.age = age;
    }
}

// 1. Получение имени класса
// – Методы: getName(), getSimpleName()

Class<?> clazz = Person.class;
System.out.println("Full name: " + clazz.getName()); // Выводит полное имя класса
System.out.println("Simple name: " + clazz.getSimpleName()); // Выводит простое имя класса

// 2. Получение модификаторов
// – Метод: getModifiers()
// – Модификаторы используются для определения свойств класса, методов и полей
// (public, private, protected, static, final и т.д.).

int modifiers = clazz.getModifiers();
System.out.println("Is public: " + Modifier.isPublic(modifiers));
// Проверяет, является ли класс публичным
System.out.println("Is final: " + Modifier.isFinal(modifiers));
// Проверяет, является ли класс финальным

// 3. Получение списка полей
// – Методы: getFields(), getDeclaredFields()
// – getFields() возвращает только публичные поля, включая унаследованные.
// getDeclaredFields() возвращает все поля, объявленные в классе, включая приватные.
java Field[] publicFields = clazz.getFields();
System.out.println("Public fields:");
for (Field field : publicFields) {
    System.out.println(field.getName()); // Выводит имена всех публичных полей
}
Field[] allFields = clazz.getDeclaredFields();
System.out.println(“All fields:”);
for (Field field : allFields) {
    System.out.println(field.getName()); // Выводит имена всех полей, объявленных в классе
}

// 4. Доступ к приватным полям
// – Метод: setAccessible(true)
// – Использование метода setAccessible(true) позволяет получить доступ к
// приватным и защищённым членам класса.

Class <Person> personClass = Person.class;
personClass.getField("id").setAccessable(true);

// 5. Получение списка методов
// – Методы: getMethods(), getDeclaredMethods()
// • getMethods(): Возвращает только публичные методы, включая
// унаследованные.
// • getDeclaredMethods(): Возвращает все методы, объявленные в классе,
// включая приватные и защищённые.

try {
    Method method = clazz.getDeclaredMethod("setAge", int.class); // Получение метода 'setAge'
    Class<?>[] parameterTypes = method.getParameterTypes(); // Получение типов параметров метода
    System.out.println("Parameter types:");
    for (Class<?> paramType : parameterTypes) {
        System.out.println(paramType.getName()); // Выводит типы параметров метода
    }
} catch (NoSuchMethodException e) {
    e.printStackTrace();
}

// 6. Информация о методах
// – Получение информации о параметрах метода: Использование метода
// getParameterTypes() для получения типов параметров метода.

try {
    Method method = clazz.getDeclaredMethod("setAge", int.class);
    Class<?>[] parameterTypes = method.getParameterTypes();
    System.out.println("Parameter types:");
    for (Class<?> paramType : parameterTypes) {
        System.out.println(paramType.getName());
    }
} catch (NoSuchMethodException e) {
    e.printStackTrace();
}

// 7. Вызов метода
// – Метод: invoke()
// – Метод invoke() используется для вызова методов объекта. Необходимо
// передать объект, на котором вызывается метод, и аргументы метода.

try {
    Method method = clazz.getDeclaredMethod("setAge", int.class); //    Получение метода 'setAge'
    method.setAccessible(true); // Разрешает доступ к приватному методу
    Person person = new Person();
    method.invoke(person, 25); // Вызов метода 'setAge' с аргументом 25
    System.out.println("Private method setAge invoked.");
} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
    e.printStackTrace();
}

// 8. Получение списка конструкторов
// – Методы: getConstructors(), getDeclaredConstructors()
// • getConstructors(): Возвращает только публичные конструкторы.
// • getDeclaredConstructors(): Возвращает все конструкторы,
// объявленные в классе, включая приватные и защищённые.

Constructor<?>[] publicConstructors = clazz.getConstructors();
System.out.println("Public constructors:");
for(Constructor<?> constructor : publicConstructors) {
    System.out.println(constructor.getName()); // Выводит имена всех публичных конструкторов
}
Constructor<?>[] allConstructors = clazz.getDeclaredConstructors();
System.out.println("All constructors:");
for (Constructor<?> constructor : allConstructors) {
    System.out.println(constructor.getName()); // Выводит имена всех конструкторов, объявленных в классе
}

// 9. Создание экземпляра класса
// – Методы: newInstance(), конструкторы
// – Метод newInstance() устарел, рекомендуется использовать конструкторы для
// создания экземпляров классов.

try {
    Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
    // Получение конструктора

    constructor.setAccessible(true); // Разрешает доступ к приватному конструктору
    Person person = (Person) constructor.newInstance("Jane Doe", 28);
    // Создание экземпляра класса с помощью конструктора

    System.out.println("Instance created: " + person.getName());
} catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
    e.printStackTrace();
}