// Design a Ship class that the following members:
// ● A field for the name of the ship (a string).
// ● A field for the year that the ship was built (a string).
// ● A constructor and appropriate accessors and mutators.
// ● A toString method that displays the ship’s name and the year it was
// built.

// Design a CruiseShip class that extends the Ship class. 
// The CruiseShip class should have the following members:
// ● A field for the maximum number of passengers (an int )
// ● A constructor and appropriate accessors and mutators
// ● A toString method that overrides the toString method in the base class.
// The CruiseShip class’s toString method should display only the ship’s name and the maximum number of passengers.

// Design a CargoShip class that extends the Ship class. 
// The CargoShip class should have the following members:
// ● A field for the cargo capacity in tonnage (an int )
// ● A constructor and appropriate accessors and mutators
// ● A toString method that overrides the toString method in the base class.
// The CargoShip class’s toString method should display only the ship’s name and the ship’s cargo capacity.

// Demonstrate the classes in a program that has a Ship array. 
// Assign various Ship , CruiseShip , and CargoShip objects to the array elements. 
// The program should then step through the array, calling each object’s toString method.

public class Ship {
    public String name;
    public String yearBuilt;

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String toString() {
        return "Ship Name: " + name + ", Year Built: " + yearBuilt;
    }
}

class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public String toString() {
        return "Cruise Ship Name: " + name + ", Maximum Passengers: " + maxPassengers;
    }
}

class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public String toString() {
        return "Cargo Ship Name: " + name + ", Cargo Capacity: " + cargoCapacity;
    }
}

class Main5 {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Titanic", "1912");
        ships[1] = new CruiseShip("Symphony", "1912", 6680);
        ships[2] = new CargoShip("Ever Green", "1912", 20000);

        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }
    }
}
