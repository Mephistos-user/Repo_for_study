package oop3.oop54;

import java.util.Scanner;

public class TableScanner55 {
    Row55[] scanTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter header, left column");
        String headerLeft = scanner.nextLine();
        System.out.println("Please enter header, right column");
        String headerRight = scanner.nextLine();
        Row55 header = new Row55(headerLeft, headerRight);

        System.out.println("How many rows you will have in table: ");
        int rowsCount = scanner.nextInt();
        Row55[] table = new Row55[rowsCount + 1];
        table[0] = header;

        
        return ;
    }
}
