package oop4.oop65;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // priorityQueue - ВСЕГДА сортируется

        PriorityQueue<Customer2> queue = new PriorityQueue<>();


        queue.add(new Customer2("user1", 4));
        queue.add(new Customer2("user2", 2));
        queue.add(new Customer2("user3", 10));
        queue.add(new Customer2("user4", 7));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}

class Customer implements Comparable<Customer2> {
    String fullName;
    int loyaltyPoints;


    public Customer (String fullName, int loyaltyPoints) {

        this.fullName = fullName;
        this.loyaltyPoints = loyaltyPoints;
    }

    // сортировка с помощью Comparable
    @Override
    public int compareTo(Customer2 o) {
        return o.loyaltyPoints - loyaltyPoints;
    }

    @Override
    public String toString() {
        return "Cuctomer{" +
                "fullName='" + fullName + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }
}
