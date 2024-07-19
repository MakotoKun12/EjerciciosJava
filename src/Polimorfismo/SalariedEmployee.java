package Polimorfismo;

class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    double calculatePay() {
        return annualSalary / 12;
    }
}
