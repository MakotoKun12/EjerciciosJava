package SOLID.D_PrinciprioInversionDependencias;

class MySQLDatabase implements Database{
    @Override
    public void insert(String data) {
        System.out.println("Inserting data into MySQL database: " + data);
    }

    @Override
    public void update(String data) {
        System.out.println("Updating data in MySQL database: " + data);
    }

    @Override
    public void delete(String data) {
        System.out.println("Deleting data from MySQL database: " + data);
    }
}
