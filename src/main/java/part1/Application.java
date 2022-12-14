package part1;

public class Application {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("Audi", "2015", "Black", "L12345A", 125);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Max Mustermann", "4788");
        int feesum = officer.patrol(car, meter);

        // Did the officer issue a ticket?
        if (feesum != 0) {
            System.out.println("You are a criminal! U have to pay a fee of:" + feesum + " $");
        }
        else {
            System.out.println("No crimes committed!");
        }

    }

}