package PrinciplesDesign.EncapsulaLoQueVaria;

// Clase que utiliza la lógica encapsulada para calcular el total del pedido
public class Order {
    private double total;
    private String country;

    public Order(double total, String country) {
        this.total = total;
        this.country = country;
    }

    public double getTotal() {
        return total;
    }

    public String getCountry() {
        return country;
    }

    public double getOrderTotal() {
        TaxCalculator taxCalculator = new TaxCalculator();
        return total + taxCalculator.calculateTax(this);
    }
}
