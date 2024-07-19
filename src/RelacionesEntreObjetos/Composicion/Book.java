package RelacionesEntreObjetos.Composicion;

import java.util.List;
import java.util.ArrayList;

//La clase Library gestiona el ciclo de vida de los Book. Si la Library se destruye, los Book también.
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
        }
    }
}

