package task2;

public class Bus extends Vehicle {
    public Bus(String make, Integer year) {
        this.make = make;
        this.year = year;
    }

    @Override
    void start() {
        System.out.println(make + " " + year + " is starting");
    }

    @Override
    void stop() {
        System.out.println(make + " " + year + " is stopping");
    }
}

