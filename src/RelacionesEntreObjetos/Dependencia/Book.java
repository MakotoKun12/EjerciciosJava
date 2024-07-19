package RelacionesEntreObjetos.Dependencia;

//La clase Library depende de la clase Book. Si la clase Book cambia, la clase Library podría verse afectada.
class Book {
    private String title;
    private String author;

    public Book(String title, String author){
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

class Library{
    public void displayBookInfo(Book book){
        System.out.println("Book title: "+book.getTitle());
        System.out.println("Author: "+book.getAuthor());
    }
}
