package oop3.oop55;

public class ConsoleTableWriter implements TableWriter {
    @Override
    public void writeTable(Row[] table) {
        int maxLenght = 0;
        for (int i = 0; i < table.length; i++) {
            Row current = table[i];
            if (maxLenght < current.left.length()) {
                maxLenght = current.left.length();
            }
        }

        for (int i = 0; i < table.length; i++) {
            Row current = table[i];

            System.out.println(current.left + spaceString(table, current.left.length()) + "\t\t" + "|" + "\t\t"+ current.right);
        }
    }

    @Override
    public String getOutputPlace() {
        return "console";
    }


    private String spaceString(Row[] table, int currLength) {
        int maxLenght = 0;
        for (int i = 0; i < table.length; i++) {
            Row current = table[i];
            if (maxLenght < current.left.length()) {
                maxLenght = current.left.length();
            }
        }
        int dif = maxLenght - currLength;
        String space = " ";
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < dif; i++) {
            str.append(space);
        }
        return str.toString();
    }
}
