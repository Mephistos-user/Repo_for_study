// Поиск: anyMatch(), allMatch(), noneMatch(), findAny(), findFirst():

// – anyMatch(): Проверяет, есть ли хотя бы один элемент, соответствующий заданному предикату.
boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
System.out.println(hasEven); // Output: true

//  – allMatch(): Проверяет, соответствуют ли все элементы заданному предикату.
boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
System.out.println(allEven); // Output: false

//  – noneMatch(): Проверяет, не соответствует ли ни один элемент заданному предикату.
boolean noneGreaterThanTen = numbers.stream().noneMatch(n -> n >
10);
System.out.println(noneGreaterThanTen); // Output: true

//  – findAny(): Возвращает любой элемент из потока (особенно полезно для параллельных потоков).
Optional<Integer> anyNumber = numbers.stream().findAny();
anyNumber.ifPresent(System.out::println); // Output: Может быть любое число из потока

//  – findFirst(): Возвращает первый элемент из потока.
Optional<Integer> firstNumber = numbers.stream().findFirst();
firstNumber.ifPresent(System.out::println); // Output: 1