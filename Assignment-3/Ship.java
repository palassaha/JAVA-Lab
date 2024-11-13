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
