package part1;

public class PoliceOfficer {
    public String name;
    public String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public int patrol(ParkedCar car, ParkingMeter meter) {
        int parkedTime = car.minutesParked;
        int purchasedTime = meter.minutesPurchased;
        int feeStart = 25;
        int bonusMoney = ((parkedTime-purchasedTime)-60)%10;
        int feeExtenderByTenMin = 10;
        int feeSum = 0;

        if (purchasedTime>parkedTime){
            return 0;
        } else if ((parkedTime - purchasedTime) <= 60) {
            feeSum = feeStart;
            return  feeSum;
        } else {
            feeSum = feeStart + (feeExtenderByTenMin * bonusMoney);
        } return feeSum;
    }


}
