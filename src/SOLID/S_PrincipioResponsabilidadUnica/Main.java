package SOLID.S_PrincipioResponsabilidadUnica;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Hello world!!");
        Printer printer = new Printer();
        PrintLogger printLogger = new PrintLogger();

        printer.print(document);
        printLogger.log("Document printed: "+document.getContent());
    }
}
