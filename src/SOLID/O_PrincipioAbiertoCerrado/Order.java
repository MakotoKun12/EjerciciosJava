package SOLID.O_PrincipioAbiertoCerrado;

public class Order {
    private DeliveryStrategy deliveryStrategy;

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy){
        this.deliveryStrategy = deliveryStrategy;
    }

    public double shippingCost(){
        return deliveryStrategy.shippingCost();
    }
}
