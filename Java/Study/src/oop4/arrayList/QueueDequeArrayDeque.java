package oop4.arrayList;

public class QueueDequeExample {


    // Queue - очередь (FIFO - first in, first out)

//    boolean offer(E obj); // добавляет в конец очереди

    // получение элементов ВСЕГДА из начала очереди

//    E element(); // без удаления. Очередь пуста = ошибка
//    E peek(); // без удаления. Очередь пуста = null
//    E remove(); // с удалением. Очередь пуста = ошибка
//    E poll(); // с удалением. Очередь пуста = null


    // Deque - FIFO + LIFO
    // можно добавлять и брать элементы с любой стороны очереди
    void addFirst(E obj); // добавать в начало
    void addLast(E obj); // добавить в конец
    E getFirst(); // получить с начала
    E getLast(); // получить с конца
}
