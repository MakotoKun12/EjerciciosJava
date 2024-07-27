package SOLID.D_PrinciprioInversionDependencias;

class MongoDBDatabase implements Database {
    @Override
    public void insert(String data) {
        System.out.println("Inserting data into MongoDB database: " + data);
    }

    @Override
    public void update(String data) {
        System.out.println("Updating data in MongoDB database: " + data);
    }

    @Override
    public void delete(String data) {
        System.out.println("Deleting data from MongoDB database: " + data);
    }
}
