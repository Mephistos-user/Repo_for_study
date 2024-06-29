package oop4.oop65;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {

        // сортировка с помощью Comparator

        PriorityQueue<Customer2> queue = new PriorityQueue<>(new CustomerComparator());

        queue.add(new Customer2("user1", 14));
        queue.add(new Customer2("user2", 42));
        queue.add(new Customer2("user3", 20));
        queue.add(new Customer2("user4", 37));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}

class Customer2 {
    String fullName;
    int loyaltyPoints;


    public Customer2(String fullName, int loyaltyPoints) {

        this.fullName = fullName;
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public String toString() {
        return "Cuctomer{" +
                "fullName='" + fullName + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }
}

class CustomerComparator implements Comparator<Customer2> {

    @Override
    public int compare(Customer2 customer1, Customer2 customer2) {

        return customer2.loyaltyPoints - customer1.loyaltyPoints;
    }
}
