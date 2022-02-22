package Day02;

public class Task05 {

// 5) Vehicle
// Create a base class of a Vehicle,
// then create a Car class which inherits from Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

    public static class Vehicle {
        short numberOfWheels;
        int numberOfSeats;
        double weight;
        String maker;
        String model;

        public Vehicle(){

        }

        public Vehicle(short numberOfWheels, int numberOfSeats, double weight, String maker, String model) {
            this.numberOfWheels = numberOfWheels;
            this.numberOfSeats = numberOfSeats;
            this.weight = weight;
            this.maker = maker;
            this.model = model;
        }

        void steer(){
            System.out.println("Generic steering invoked");
        }

        void brake(){
            System.out.println("Generic braking invoked");
        }

        void gearboxEngaged(){
            System.out.println("Some type of gearbox is present");
        }
    }

    public static class Car extends Vehicle {
        boolean isHybrid;

        public Car(){
            super();
        }

        public Car(boolean isHybrid) {
            this.isHybrid = isHybrid;
        }

        @Override
        void steer() {
            System.out.println("Steering with the steering wheel");
        }

        @Override
        void brake() {
            System.out.println("Braking with all four wheels");
        }

        @Override
        void gearboxEngaged() {
            super.gearboxEngaged();
            System.out.println("It can be manual or automatic");
        }
    }

    public static class Hybrid extends Car {
        String type;

        public Hybrid(){
            super();
        }

        public Hybrid(boolean isHybrid, String type) {
            super(isHybrid);
            this.type = type;
        }

        void recharge() {
            System.out.println("This hybrid is recharging");
        }

        @Override
        void brake() {
            System.out.println("Braking also recharges the battery");
        }

        @Override
        void gearboxEngaged() {
            System.out.println("Can have only automatic transmission");
        }
    }

    public static void main(String[] args) {

        System.out.println("Hybrid");
        Hybrid hybrid01 = new Hybrid();
        hybrid01.recharge();
        hybrid01.brake();

        System.out.println("\nAnoher hybrid");
        Hybrid hybrid02 = new Hybrid(true, "MildHybrid");
        hybrid02.gearboxEngaged();
        hybrid02.steer();

        System.out.println("\nCar");
        Car car = new Car();
        car.steer();
        car.gearboxEngaged();
        car.brake();

        System.out.println("\nVehicle");
        Vehicle vehicle01 = new Vehicle();
        Vehicle vehicle02 = new Vehicle((short) 4, 5, 1920, "BMW", "640i");
        vehicle01.steer();
        vehicle02.brake();
    }
}
