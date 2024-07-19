package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Alice", 1, 60000),
                new HourlyEmployee("Bob", 2, 20, 160),
                new CommissionEmployee("Charlie", 3, 50000, 0.10)
        };

        for (Employee emp : employees) {
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Monthly Pay: $" + emp.calculatePay());
            System.out.println();
        }
    }
}
