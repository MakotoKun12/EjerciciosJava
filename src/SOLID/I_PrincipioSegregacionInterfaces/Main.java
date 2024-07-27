package SOLID.I_PrincipioSegregacionInterfaces;

public class Main {
    public static void main(String[] args) {
        CloudStorageProvider dropbox = new Dropbox();
        dropbox.storeFile("myFile.txt");
        System.out.println(dropbox.getFile("myFile.txt"));

        Amazon amazon = new Amazon();
        amazon.createServer("us-east-1");
        amazon.storeFile("myFile.txt");
        System.out.println(amazon.getFile("myFile.txt"));
        System.out.println(amazon.getCDNAddress());

        /*
        Al dividir una interfaz grande en varias interfaces más pequeñas y especializadas,
        cada clase implementa solo las interfaces que son relevantes para sus responsabilidades.
        Esto evita que las clases tengan que implementar métodos que no utilizan, promoviendo un diseño
        más limpio y mantenible.
         */

    }
}
