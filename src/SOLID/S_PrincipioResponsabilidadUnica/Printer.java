package SOLID.S_PrincipioResponsabilidadUnica;

public class Printer {
    public void print(Document document){
        //Print logic
        System.out.println("Printing document: "+ document.getContent());
    }
}
