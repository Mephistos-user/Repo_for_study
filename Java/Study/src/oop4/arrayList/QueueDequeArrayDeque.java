package oop4.arrayList;

import java.util.*;

public class QueueDequeArrayDeque {
    public static void main(String[] args) {
        // Queue - очередь (FIFO - first in, first out)

//    boolean offer(E obj); // добавляет в конец очереди

        // получение элементов ВСЕГДА из начала очереди

//    E element(); // без удаления. Очередь пуста = ошибка
//    E peek(); // без удаления. Очередь пуста = null
//    E remove(); // с удалением. Очередь пуста = ошибка
//    E poll(); // с удалением. Очередь пуста = null


        // Deque - FIFO + LIFO
        // можно добавлять и брать элементы с любой стороны очереди
//    void addFirst(E obj); // добавить в начало
//    void addLast(E obj); // добавить в конец
//    E getFirst(); // получить с начала
//    E getLast(); // получить с конца


//        ArrayDeque<String> states = new ArrayDeque<>();
//        states.add("Germany");
//        System.out.println(states.getFirst());
//        states.addFirst("France"); // добавить в начало
//        states.push("Great Britain"); // добавить в начало
//        states.addLast("Spain"); // добавить в конец
//        states.add("Italy"); // добавить в конец
//        System.out.println(states);
//
//        System.out.println(states.getFirst()); // получить с начала
//        System.out.println(states.getLast()); // получить с конца


//        LinkedList(); // создает пустой список
//        LinkedList(Collections<? extends E> col); // создает список, в который добавляет все элементы коллекции col

//        addFirst(); // добавляет в начало
//        offerFirst(); // добавляет в начало
//        addLast(); // добавляет в конец
//        offerLast(); // добавляет в конец

//        removeFirst(); // удаляет первый элемент
//        pollFirst(); // удаляет первый элемент
//        removeLast(); // удаляет последний элемент
//        pollLast(); // удаляет последний элемент

//        getFirst(); // получает первый элемент
//        peekFirst(); // получает первый элемент
//        getLast(); // получает последний элемент
//        peekLast(); // получает последний элемент


        // отличия ArrayDeque и LinkedList:
        // 1. Основаны на разных интерфейсах
        // 2. ArrayDeque - более эффективен для операций добавления и удаления на обоих концах
        // 3. LinkedList - более эффективен для удаления текущего элемента по время итерации


        // Задача: сравнить по скорости вставки элементов в конец ArrayList и LinkedList
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        long arrayInsertTime = getInsertTimeMs(arrayList);
        long linkedInsertTime = getInsertTimeMs(linkedList);
        System.out.println("ArrayList ms: " + arrayInsertTime);
        System.out.println("LinkedList ms: " + linkedInsertTime);
//        ArrayList ms: 189194
//        LinkedList ms: 154

        // LinkedList в некоторых ситуациях намного быстрее ArrayList
        // Но ArrayList более универсальный и в большинстве случаев используют его.
        // Но в некоторых задачах стоит использовать другие коллекции

    }

    public static long getInsertTimeMs(List list) {
        Date startTime = new Date();
        insert(list);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public static void insert(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());
        }
    }
}
