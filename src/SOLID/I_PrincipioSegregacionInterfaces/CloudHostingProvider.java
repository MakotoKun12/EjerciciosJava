package SOLID.I_PrincipioSegregacionInterfaces;

//Interfaz para hosting en la nube
interface CloudHostingProvider {
    void createServer(String region);
    void listServers(String region);
}
