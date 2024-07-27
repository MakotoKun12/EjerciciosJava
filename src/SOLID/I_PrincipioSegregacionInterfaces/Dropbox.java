package SOLID.I_PrincipioSegregacionInterfaces;

public class Dropbox implements CloudStorageProvider{
    @Override
    public void storeFile(String name) {
        System.out.println("Store file in Dropbox: " + name);
    }

    @Override
    public String getFile(String name) {
        return "File content from Dropbox for: " + name;
    }
}
