package SOLID.I_PrincipioSegregacionInterfaces;

class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider{
    @Override
    public String getCDNAddress() {
        return "Amazon CDN Address";
    }

    @Override
    public void createServer(String region) {
        System.out.println("Creating server in region: " + region);
    }

    @Override
    public void listServers(String region) {
        System.out.println("Listening servers in region: " + region);
    }

    @Override
    public void storeFile(String name) {
        System.out.println("Store file in Amazon: " + name);
    }

    @Override
    public String getFile(String name) {
        return "File content from Amazon for: " + name;
    }
}
