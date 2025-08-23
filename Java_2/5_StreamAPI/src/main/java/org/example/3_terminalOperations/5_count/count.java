// Получение информации о потоке: count():
//  – Возвращает количество элементов в потоке.
long count = numbers.stream().filter(n -> n % 2 == 0).count();
System.out.println(count); // Output: 2