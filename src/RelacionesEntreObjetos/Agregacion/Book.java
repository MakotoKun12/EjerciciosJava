package RelacionesEntreObjetos.Agregacion;

import java.util.List;
import java.util.ArrayList;

//La clase Library contiene una colección de Book. Los Book pueden existir independientemente de la Library.
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

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
        }
    }
}

