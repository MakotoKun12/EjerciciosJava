package PrinciplesDesign.EncapsulaLoQueVaria;

// Clase que encapsula la lógica del cálculo del impuesto
public class TaxCalculator {
    public double calculateTax(Order order) {
        double tax = 0.0;
        if (order.getCountry().equals("US")) {
            tax = order.getTotal() * 0.07;
        } else if (order.getCountry().equals("EU")) {
            tax = order.getTotal() * 0.20;
        }
        return tax;
    }
}