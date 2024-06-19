package oop.OOP_38;

public class MyClass38 {
    public static void main(String[] args) {
//        for (int row = 0; row < 10; row++) {
//            for (int col = 0; col < 20; col++) {
//                boolean rigthUpperCorner = row < 3 && row > 0 && col > 13 && col < 16;
//                boolean leftUpperCorner = row < 3 && row > 0 && col > 3 && col < 6;
//                boolean lowerRows = row > 5 && row < 9;
//                if (rigthUpperCorner || leftUpperCorner || lowerRows) {
//                    System.out.print("[X]");
//                } else {
//                    System.out.print("[ ]");
//                }
//            }
//            System.out.println();
//        }

        // зиг-заг
//        for (int row = 0; row < 10; row++) {
//            for (int col = 0; col < 20; col++) {
//
//                if (row % 2 == 0) {
//                    System.out.print("\\");
//                } else {
//                    System.out.print("/");
//                }
//            }
//            System.out.println();
//        }

        // андреевский флаг
//        int size = 20;
//        for (int row = 0; row < size; row++) {
//            for (int col = 0; col < size; col++) {
//
//                if (row == col) {
//                    System.out.print("\\");
//                } else if (size - 1 == row + col) {
//                    System.out.print("/");
//                } else {
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }


        // таблица умножения
        int size = 9;
        System.out.print("X  ");

        for (int i = 0; i < size; i++ ) {
            System.out.print(i + 1 + "   ");
        }
        System.out.println();

        for (int row = 0; row < size; row++) {
            System.out.print(row + 1 + "  ");

            for (int col = 0; col < size; col++) {
//                if ((row + 1) * (col + 1) >= 100) {
//                    System.out.print((row + 1) * (col + 1) + " ");
//                } else if ((row + 1) * (col + 1) >= 10){
//                    System.out.print((row + 1) * (col + 1) + "  ");
//                } else {
//                    System.out.print((row + 1) * (col + 1) + "   ");
//                }

//                int mult = (row + 1) * (col + 1);
//                double log = Math.log10(mult);
//                int logCel = (int) log;
//                System.out.print(mult);
//                for (int i = 0; i < 3 - logCel; i++) {
//                    System.out.print(' ');
//                }

                int mult = (row + 1) * (col + 1);
                String str = String.valueOf(mult);
                System.out.print(mult);
                for (int i = 0; i < 4 - str.length(); i++) {
                    System.out.print(' ');
                }

            }

            System.out.println();
        }
    }
}
