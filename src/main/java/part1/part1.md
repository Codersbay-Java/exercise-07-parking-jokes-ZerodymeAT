# Parkautomat

Im folgenden Projekt soll eine Parksituation von einem gebührenpflichtigen Parkplatz simuliert werden.
Ein Auto parkt und ein Polizist kontrolliert es. Dafür soll es die folgenden vier Klassen geben:

## ParkedCar
### Felder
- brand : String
- model : String
- colour : String
- licenseNumber : String
- minutesParked : int

### Konstruktoren
- ParkedCar(< alle Felder von oben >)

## ParkingMeter
### Felder
- minutesPurchased : int
- model : String
- colour : String
- licenseNumber : String
- minutesParked : int

### Konstruktor
- ParkingMeter(minutes : int)

## PoliceOfficer
Diese Klasse soll den Polizisten simulieren. Die einzige Aufgabe von ihr ist es, die Anzahl der bestellten Parkminuten 
zu ermitteln. Mit der Methode `patrol()` wird überprüft, seit wie vielen Minuten das Auto schon geparkt ist, und für wie 
viele Minuten überhaupt bezahlt worden sind. Ist für weniger Minuten bezahlt worden, wird ein `ParkingTicket` Objekt 
zurückgegeben, andernfalls `null`.
### Felder
- name : String
- badgeNumber : String
- colour : String
- ### Konstruktoren
- PoliceOfficer(< alle Felder von oben >)

### ParkingTicket
Hier wird das Ticket simuliert, diese Klasse verwendet `ParkedCar` und `PoliceOfficer`.
Der Konstruktoren und die jeweiligen Felder sollen selbst angelegt werden.
Sie muss jedoch folgendes enthalten:

1. das jeweilige Auto des Falschparkers
2. den Polizisten der das Ticket ausstellt
3. und das Falschparkticket selbst, dass 25$ für die erste Stunde und 10 $ für jede weitere Stunde kostet.

# Test
Teste deine Implementierung mit folgender Main-Methode

~~~java
public class Application {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("Audi", "2015", "Black", "L12345A", 125);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Max Mustermann", "4788");
        ParkingTicket ticket = officer.patrol(car, meter);

        // Did the officer issue a ticket?
        if (ticket != null) {
            System.out.println(ticket);
        }
        else {
            System.out.println("No crimes committed!");
        }
    }
}
~~~
