// Источники данных

/* Представление различных типов источников данных:
Stream API может работать с различными источниками данных, такими как:
    – Коллекции (Collections): Коллекции, такие как List, Set и Map, являются
одними из наиболее часто используемых источников данных для потоков.
    – Массивы (Arrays): Потоки можно создавать из массивов примитивных типов и
объектов.
    – Файлы: Потоки можно создавать для чтения данных из файлов.
    – Произвольные данные: Потоки можно создавать из произвольных данных с
помощью специальных методов. */


/* Методы для создания потоков данных из различных источников: */

//    – Из коллекций: Используется метод stream(), доступный для коллекций, начиная с Java 8.
List<String> list = Arrays.asList("a", "b", "c");
Stream<String> stream = list.stream();

//    – Из массивов: Используется метод Arrays.stream() или Stream.of().
int[] array = {1, 2, 3, 4, 5};
IntStream intStream = Arrays.stream(array);
String[] strArray = {"a", "b", "c"};
Stream<String> strStream = Stream.of(strArray);

//  – Из файлов: Используется класс Files для создания потока строк из файла.
try (Stream<String> lines = Files.lines(Paths.get("path/to/file.txt"))) {
    lines.forEach(System.out::println);
} catch (IOException e) {
    e.printStackTrace();
}


//  – Произвольные данные:

// • Метод Stream.generate(): Создает бесконечный поток, используя функцию-поставщика (Supplier).
Stream<String> generatedStream = Stream.generate(() -> "element").limit(10);
generatedStream.forEach(System.out::println); // Output: element (10 times)

// • Метод Stream.iterate(): Создает бесконечный поток, используя начальное значение и функцию для вычисления следующего элемента.
Stream<Integer> iteratedStream = Stream.iterate(0, n -> n + 2).limit(5);
iteratedStream.forEach(System.out::println); // Output: 0, 2, 4, 6, 8
