package SOLID.O_PrincipioAbiertoCerrado;

public class FlyShipping implements DeliveryStrategy{

    @Override
    public double shippingCost() {
        return 20.0;
    }
}
