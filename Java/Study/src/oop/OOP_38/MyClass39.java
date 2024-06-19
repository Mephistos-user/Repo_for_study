package oop.OOP_38;

import java.util.Random;
import java.util.Scanner;

public class MyClass39 {
    public static void main(String[] args) {

        // двумерные массивы
//        char[][] superArr = new char[3][5];
//
//        superArr[0][0] = '.';
//        superArr[0][1] = '-';
//        superArr[0][2] = '.';
//        superArr[0][3] = '-';
//        superArr[0][4] = '.';
//
//        superArr[1][0] = '-';
//        superArr[1][1] = '.';
//        superArr[1][2] = '-';
//        superArr[1][3] = '.';
//        superArr[1][4] = '-';
//
//        superArr[2][0] = '.';
//        superArr[2][1] = '.';
//        superArr[2][2] = '.';
//        superArr[2][3] = '.';
//        superArr[2][4] = '.';
//
//        for (int i = 0; i < superArr.length; i++) {
//            for (int j = 0; j < superArr[i].length; j++) {
//                System.out.print(superArr[i][j]);
//
//            }
//            System.out.println();
//        }


        // морской бой

        char[][] battleField = new char[10][10];
        printColNumber();

        for (int row = 0; row < 10; row++) {
            printRowNumber(row);

            for (int col = 0; col < 10; col++) {
                boolean sergey1 = row == 0 && col < 4;
                boolean sergey2 = row >= 2 && row <= 4 && col == 3;


                if (sergey1 || sergey2) {
                    System.out.print("[C]");
                    battleField[row][col] = 'C';
                } else {
                    System.out.print("[ ]");
                    battleField[row][col] = ' ';

                }
            }
            System.out.println();
        }

        for (int i = 0; i < 7; i++) {
            int olgaRow = new Random().nextInt(10);
            int olgaCol = new Random().nextInt(10);
            battleField[olgaRow][olgaCol] = 'O';
        }

        int olgaShipLives = 7;

        while (olgaShipLives > 0) {

            System.out.println("Sergey, make your turn:");
            System.out.println("row num: ");
            Scanner scanner = new Scanner(System.in);
            int chosenRow = scanner.nextInt();
            chosenRow--;
            System.out.println("col num: ");
            int chosenCol = scanner.nextInt();
            chosenCol--;

//        boolean isOlgaShip = battleField[chosenRow][chosenCol] == 'O';
//        boolean olga1 = chosenCol == 7 && chosenRow >= 5 && chosenRow <= 7;
//        boolean olga2 = chosenRow == 9 && chosenCol >= 1 && chosenCol <= 4;
            if (battleField[chosenRow][chosenCol] == 'O') {
                battleField[chosenRow][chosenCol] = 'X';
                olgaShipLives--;
                System.out.println("ranil");
            } else {
                System.out.println("mimo");
            }

            printColNumber();

            for (int row = 0; row < 10; row++) {
                printRowNumber(row);
                for (int col = 0; col < 10; col++) {
                    System.out.print("[" + battleField[row][col] + "]");
                }
                System.out.println();
            }

            if (olgaShipLives == 0) {
                System.out.println("Sergey, you win");
            }

        }
    }

    private static void printRowNumber ( int row){
        System.out.print(row + 1);
        if (row + 1 == 10) {
            System.out.print(" ");
        } else {
            System.out.print("  ");
        }
    }

    private static void printColNumber () {
        System.out.print("   ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }
}
