package PrinciplesDesign.ComposicionSobreHerencia;

public class Main {
    public static void main(String[] args) {
        Car electricCar = new Car(new ElectricEngine());
        electricCar.startCar(); // Output: Starting electric engine...

        Car gasolineCar = new Car(new GasolineEngine());
        gasolineCar.startCar(); // Output: Starting gasoline engine...
    }
}
