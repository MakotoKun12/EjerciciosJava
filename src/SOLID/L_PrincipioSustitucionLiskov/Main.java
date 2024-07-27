package SOLID.L_PrincipioSustitucionLiskov;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(1000,0.05);
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawl: " + account.getBalance());

        // The following line will throw an exception because SavingsAccount
        // has a withdrawal limit set in the overridden withdraw method
        account.withdraw(1500); // This will throw an exception

        //Explicacion
        /*
        Clase BankAccount: Esta es la clase base que define métodos para operaciones comunes
        de cuentas bancarias como deposit y withdraw.

        Clase SavingsAccount: Esta clase extiende BankAccount y agrega un método para aplicar
        intereses. Además, sobrescribe el método withdraw para limitar la cantidad que se puede
        retirar, demostrando cómo una subclase puede alterar o extender el comportamiento de la clase base.

        Principio de Sustitución de Liskov: En el método main, una instancia de SavingsAccount se maneja a
        través de una referencia de tipo BankAccount. Esto es un ejemplo de LSP, donde la subclase
        (SavingsAccount) se puede utilizar en lugar de la clase base (BankAccount) sin romper la
        funcionalidad del programa.
        */

    }
}
