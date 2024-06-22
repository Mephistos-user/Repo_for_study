package oop2.oop44;

import java.util.Scanner;

public class AwesomeString {
    String name;
    String str;
    Scanner scanner;

    // default constructor
    AwesomeString() {
        this.scanner = new Scanner(System.in);
        System.out.print("Default AwesomeString() constructor works. Pleas specify input: ");
        this.str = scanner.nextLine();
    }
    AwesomeString(String inputStr) {
        this.str = inputStr;
        this.scanner = new Scanner(System.in);
    }
    AwesomeString(int inputNum) {
        this.str = String.valueOf(inputNum);
        this.scanner = new Scanner(System.in);
    }

    void readString() {
        System.out.print(this.name + " input: ");
        this.str = this.scanner.nextLine();
    }
}
