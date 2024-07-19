package Polimorfismo;

class HourlyEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, int hourlyRate,int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
