package RelacionesEntreObjetos.Herencia;

//La clase EBook hereda de la clase Book. Un objeto EBook puede tratarse como un objeto Book.
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

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private String format;

    public EBook(String title, String author, String format) {
        super(title, author);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Format: " + format);
    }
}