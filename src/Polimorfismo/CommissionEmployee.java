package Polimorfismo;

class ComissionEmployee extends Employee {
    private double sales;
    private double comissionRate;

    public ComissionEmployee(String name, int id, double sales, double comissionRate) {
        super(name, id);
        this.sales = sales;
        this.comissionRate = comissionRate;
    }

    @Override
    double calculatePay() {
        return sales * comissionRate;
    }
}
