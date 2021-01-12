public class CarRealisation {
    public static void main(String[] args) {
        Wheels wheel1 = new Wheels(15, 195, 65);
        Wheels wheel2 = new Wheels(15, 195, 65);
        Wheels wheel3 = new Wheels(15, 195, 65);
        Wheels wheel4 = new Wheels(15, 195, 65);

        Wheels [] wheels = new Wheels[]{wheel1, wheel2, wheel3, wheel4};

        Engine engine = new Engine(170, 10.5);

        Car mazda = new Car("Mazda", 35.5, wheels, engine, 0.0);

        System.out.println("Start condition:\n " + mazda.toString());

        mazda.Drive(100);
        System.out.println("The car went 100 km:\n " + mazda.toString());

        Wheels newWeel =new Wheels(16,205,65);
        mazda.changeWheel(0, newWeel);
        System.out.println("We changed the wheel:\n "+mazda.toString());

        mazda.refuel(10);
        System.out.println("We refueled our car:\n "+mazda.toString());

        mazda.printModel();

    }
}
