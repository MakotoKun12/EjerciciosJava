package SOLID.I_PrincipioSegregacionInterfaces;

interface CloudStorageProvider {
    void storeFile(String name);
    String getFile(String name);
}
