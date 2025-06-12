package org.example.example2;
import java.util.HashMap;
import java.util.Map;

// Использование более эффективных структур данных, таких как HashMap вместо ArrayList для быстрого доступа к элементам
/*
public class Library {
    private List<Book>books;
    public Library() {
        books = new ArrayList<>();
    }
    //Метод для добавления книги в библиотеку
    public void addBook(Book book) {
        books.add(book);
        System.out.println("New book added to the library: " + book.getTitle());
    }
    //Метод для получения книги по индексу
    public Book getBook(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        } else {
            System.out.println("Invalid index.");
            return null;
        }
    }
    // Метод получения книги по названию
    public Book getBookByTitle(String title) {
        return books.stream().filter(item -> item.getTitle().equals(title)).findFirst().orElseThrow();
    }
    //Метод для удаления книги из библиотеки
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book\"" + book.getTitle() + "\" has been removed from the library.");
        } else {
            System.out.println("Book\"" + book.getTitle() + "\" not found in the library.");
        }
    }
    //Метод для отображения всех книг в библиотеке
    public void displayAllBooks() {
        System.out.println("Books in the library: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return"Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}

public static void main(String[] args) {

    Book book1 = new Book();
    book1.setTitle("First book");

    Library library = new Library();
    library.addBook(book1);

    library.displayAllBooks();
    
}
*/
// Операции добавления, удаления и получения книги выполняются за время, пропорциональное O(n),где n - количество книг в библиотеке


// Измененный код с использованием HashMap


public class Library {
    private Map<String, Book> books;
    public Library() {
        books = new HashMap<>();
    }
    // Метод для добавления книги в библиотеку
    public void addBook (String title, Book book) {
        books.put(title, book);
        System.out.println("New book added to the library: " + title);
    }
    // Метод для получения книги по названию
    public Book getBook (String title) {
        return books.get(title);
    }
    // Метод для удаления книги из библиотеки
    public void removeBook (String title) {
        if (books.containsKey(title)) {
            books.remove(title);
            System.out.println("Book\"" + title + "\" has been removed from the library.");
        } else {
            System.out.println("Book\"" + title + "\" not found in the library.");
        }
    }
    // Метод для отображения всех книг в библиотеке
    public void displayAllBooks() {
        System.out.println("Books in the library: ");
        for (Map.Entry<String,Book> entry : books.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
class Book {
    private String author;
    private int year;
    public Book(String author, int year) {
        this.author = author;
        this.year = year;
    }

    
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return"Author: " + author + ", Year: " + year;
    }
}

public static void main(String[] args) {

    Book book1 = new Book(null, 0);
    
}

