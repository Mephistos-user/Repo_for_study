package oop3.oop55;

public interface TableWriter {
    void writeTable(Row[] table);

    String getOutputPlace();

    // метод который по умолчанию будет у всех наследников интерфейса:
    default void printTableHeaderToConsole(Row[] table) {
        System.out.println("Will print table with columns: " + table[0].left + " and " + table[0].right);
    }
}
