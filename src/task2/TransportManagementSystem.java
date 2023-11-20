package task2;

public class TransportManagementSystem {
    public static void main(String[] args) {


        Car car = new Car("BMW", 2022);
        Bike bike = new Bike("Ducati", 2016);
        Bus bus = new Bus("Mercedes-Benz", 1999);

        car.start();
        car.stop();

        bike.start();
        bike.stop();

        bus.start();
        bus.stop();
    }
}
