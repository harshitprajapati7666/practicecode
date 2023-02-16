import java.util.ArrayList;

public class Vehicle {
    public String getDescription() {
        return "";
    }

    public ArrayList<String> dataEntryMethod() {
        var data = new ArrayList<String>();
        data.add(getDescription());
//        System.out.println(data);
        return data;
    }

    public void getEngineType() {
        System.out.println(dataEntryMethod().get(0));
    }
//    public String getEngineType(Vehicle obj) {
//        if (obj instanceof Car) {
//            Car car = (Car) obj;
//            return car.getDescription();
//        } else {
//            Bike bike = (Bike) obj;
//            return bike.getDescription();
//        }
//    }
}

class Car extends Vehicle {
    private int noOfCylinders;
    private String fuelType;
    private String description;

    public void operateDoor() {

    }

    public Car(int noOfCylinders, String fuelType) {
        this.noOfCylinders = noOfCylinders;
        this.fuelType = fuelType;
        this.description = "Car engine - " + noOfCylinders + " - " + fuelType;
    }
/*
a.	 “Car engine – 4 cylinder - petrol ”, “Car engine – 2 cylinder - petrol ”, “Car engine – 6 cylinder  - diesel”
b.	“Bike engine – 2 stroke 100 ”, “Bike engine – 4 stroke 100 cc”

 */

    public String getDescription() {
        return description;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

class Bike extends Vehicle {
    private int engineSize;
    private int noOfStrokes;
    private String description;

    public Bike(int engineSize, int noOfStrokes) {
        this.engineSize = engineSize;
        this.noOfStrokes = noOfStrokes;
        this.description = "Bike engine " + noOfStrokes + " strokes " + engineSize + " cc";
    }

    public String getDescription() {
        return description;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getNoOfStrokes() {
        return noOfStrokes;
    }

    public void setNoOfStrokes(int noOfStrokes) {
        this.noOfStrokes = noOfStrokes;
    }
}