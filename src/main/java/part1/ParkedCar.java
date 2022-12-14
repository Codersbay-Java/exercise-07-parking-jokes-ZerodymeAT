package part1;

public class ParkedCar {


    public String brand;
    public String model;
    public String colour;
    public String licenseNumber;
    public int minutesParked = 0;
    public ParkedCar(String brand, String model, String colour, String licenseNumber, int minutesParked) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }
}
