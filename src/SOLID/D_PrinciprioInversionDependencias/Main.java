package SOLID.D_PrinciprioInversionDependencias;

public class Main {
    public static void main(String[] args) {
        Database mySQLDatabase = new MySQLDatabase();
        BudgetReport report1 = new BudgetReport(mySQLDatabase);
        report1.save("Budget data for MySQL");

        Database mongoDBDatabase = new MongoDBDatabase();
        BudgetReport report2 = new BudgetReport(mongoDBDatabase);
        report2.save("Budget data for MongoDB");

        /*
        Interfaz Database: Define los métodos insert(), update(), y delete(). Esta interfaz es la abstracción
         que las clases de alto nivel (BudgetReport) usan para interactuar con las bases de datos.

        Clases MySQLDatabase y MongoDBDatabase: Son implementaciones concretas de la interfaz Database.
        Cada clase implementa los métodos de la interfaz de una manera específica para el sistema de gestión
         de base de datos correspondiente.

        Clase BudgetReport: Es una clase de alto nivel que depende de la abstracción Database, no de
        implementaciones concretas. Esto permite que BudgetReport trabaje con cualquier implementación de
        Database, promoviendo así la flexibilidad y extensibilidad del sistema.

        Inversión de Dependencias: En lugar de que BudgetReport dependa directamente de una implementación
        específica de base de datos, depende de una abstracción (Database). Las clases de bajo nivel
        (MySQLDatabase y MongoDBDatabase) implementan esta interfaz, invirtiendo así la dependencia tradicional
        y facilitando el mantenimiento y la escalabilidad del sistema.
         */
    }
}
