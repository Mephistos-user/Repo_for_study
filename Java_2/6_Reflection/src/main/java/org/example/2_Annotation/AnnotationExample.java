// Аннотации в Java

/* Аннотации в Java предоставляют способ добавления метаданных к коду, что позволяет
компилятору и среде выполнения использовать эту информацию для выполнения различных
задач. */

/* 1. Что такое аннотации
– Аннотации — это специальные маркеры, которые добавляют метаданные к
элементам кода (классам, методам, полям и т.д.). Аннотации не изменяют
поведение программы, но могут использоваться компилятором и средой
выполнения для различных целей, таких как валидация, генерация кода и многое
другое. */


// 2. Стандартные аннотации
// – @Override
// • Аннотация @Override используется для указания, что метод
// переопределяет метод суперкласса.

@Override
public String toString() {
    return "Person{name='" + name + "', age=" + age + "}";
}

// – @Deprecated
// • Аннотация @Deprecated указывает, что элемент кода устарел и не
// рекомендуется к использованию.

@Deprecated
public void oldMethod() {
    // ...
}

// – @SuppressWarnings
// • Аннотация @SuppressWarnings используется для подавления
// определённых предупреждений компилятора.

@SuppressWarnings("unchecked")
public void methodWithWarnings() {
    // ...
}

// 3. Создание собственной аннотации
// – Собственные аннотации создаются с использованием ключевого слова
// @interface.

@Retention(RetentionPolicy.RUNTIME) // обязательно указать когда применяется аннотация
@Target(ElementType.METHOD) // обязательно указать к чему применяется аннотация
public @interface MyCustomAnnotation {
    String value();
}

// 4. Получение аннотаций класса
// – Методы: getAnnotations(), getDeclaredAnnotations()
// – Метод getAnnotations() возвращает все аннотации, доступные в данном
// классе, включая унаследованные. Метод getDeclaredAnnotations()
// возвращает только аннотации, объявленные в данном классе.

@MyCustomAnnotation("Example class")
public class Person {
    // ...
}
Class<?> clazz = Person.class;
Annotation[] annotations = clazz.getAnnotations();
for (Annotation annotation : annotations) {
    System.out.println(annotation);
}

// 5. Получение аннотаций методов и полей
// – Методы: getAnnotations(), getDeclaredAnnotations()
// – Аннотации методов и полей можно получить аналогично аннотациям класса.

public class Person {
    @MyCustomAnnotation("Example method")
    public String getName() {
        return name;
    }
    @MyCustomAnnotation("Example field")
    private String name;
}
Method method = clazz.getMethod("getName");
Annotation[] methodAnnotations = method.getAnnotations();
for (Annotation annotation : methodAnnotations) {
    System.out.println(annotation);
}
Field field = clazz.getDeclaredField("name");
Annotation[] fieldAnnotations = field.getAnnotations();
for (Annotation annotation : fieldAnnotations) {
    System.out.println(annotation);
}
/* 6. Этот код определяет класс Person с аннотированным методом getName и
аннотированным полем name с использованием пользовательской аннотации
@MyCustomAnnotation.
7. С помощью рефлексии код получает аннотации, примененные к методу getName, и
выводит их на консоль.
8. Аналогично, с помощью рефлексии код получает аннотации, примененные к полю
name, и также выводит их на консоль. */