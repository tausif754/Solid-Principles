// LiskovSubstitutionPrinciple demonstration in Java 
import java.util.Scanner;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is riding");
    }
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle (car/bike): ");
        String vehicleType = scanner.nextLine().toLowerCase();

        Vehicle vehicle;

        if (vehicleType.equals("car")) {
            vehicle = new Car();
        } else if (vehicleType.equals("bike")) {
            vehicle = new Bike();
        } else {
            vehicle = new Vehicle();
        }

        vehicle.move();
    }
}
