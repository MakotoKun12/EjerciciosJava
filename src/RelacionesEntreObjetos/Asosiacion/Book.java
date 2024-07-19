package RelacionesEntreObjetos.Asosiacion;

//La clase Library conoce la clase Book. La clase Library depende de Book.
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
    private Book book;

    public Library(Book book) {
        this.book = book;
    }

    public void displayBookInfo() {
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}
