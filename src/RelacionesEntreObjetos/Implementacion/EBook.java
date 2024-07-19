package RelacionesEntreObjetos.Implementacion;

interface Readable {
    void read();
}

//La clase EBook implementa la interfaz Readable. Los objetos EBook pueden tratarse como Readable.
class EBook implements Readable {
    private String title;
    private String author;

    public EBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void read() {
        System.out.println("Reading eBook: " + title + " by " + author);
    }
}
