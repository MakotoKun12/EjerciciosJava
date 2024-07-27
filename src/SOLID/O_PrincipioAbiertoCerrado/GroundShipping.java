package SOLID.O_PrincipioAbiertoCerrado;

public class GroundShipping implements DeliveryStrategy{
    @Override
    public double shippingCost() {
        return 10.0;
    }
}
