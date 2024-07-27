package SOLID.O_PrincipioAbiertoCerrado;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        //Ground shipping
        order.setDeliveryStrategy(new GroundShipping());
        System.out.println("Cost Ground Shipping: " + order.shippingCost());

        //Fly shipping
        order.setDeliveryStrategy(new FlyShipping());
        System.out.println("Cost Fly Shipping: " + order.shippingCost());
    }
}
