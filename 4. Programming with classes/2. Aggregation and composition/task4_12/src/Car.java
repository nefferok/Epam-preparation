import java.util.Arrays;

public class Car {
    private String model;
    private Double fuelLevel;
    private Wheels [] wheels;
    private Engine engine;
    private double coordinate;

    public Car(String brand, Double fuelLevel, Wheels[] wheels, Engine engine, double coordinate) {
        this.model = brand;
        this.fuelLevel = fuelLevel;
        this.wheels = wheels;
        this.engine = engine;
        this.coordinate = coordinate;
    }

    public void Drive (double distance){
        this.coordinate+=distance;
        this.fuelLevel -= this.engine.getFuelConsumption()*distance/100;
    }

    public void refuel(double liters){
        this.fuelLevel+=liters;
    }
    public void changeWheel (int numberOldWheel, Wheels newWheel){
        for (int i =0; i<wheels.length; i++){
            if (i == numberOldWheel){
                this.wheels[i] = newWheel;
            }
        }
    }

    public void printModel(){
        System.out.println("\nThe model of our car is: " + this.model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", wheels=" + Arrays.toString(wheels) +
                ", engine=" + engine +
                ", coordinate=" + coordinate +
                '}';
    }
}
