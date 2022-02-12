
abstract class Vehicle {
    public abstract int getWheel();

    public String toString() {
        return "Wheel: " + this.getWheel();
    }
}

class Car extends Vehicle {
    int wheel;

    Car(int wheel) {
        this.wheel = wheel;

    }

    @Override
    public int getWheel() {
        System.out.println("Car class method is called");
        return this.wheel;

    }
}

class Bike extends Vehicle {
    int wheel;

    Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        System.out.println("Bike class method is called");
        return this.wheel;
    }
}

class VehicleFactory {
    public static Vehicle getInstance(String type, int wheel) {
        if(type == "car") {
            return new Car(wheel);
        } else if(type == "bike") {
            return new Bike(wheel);
        }

        return null;
    }
}

public class FactoryPatternExample {

    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getInstance("car", 4);
        System.out.println(v1);

        Vehicle v2 = VehicleFactory.getInstance("bike", 2);
        System.out.println(v2);
    }

}