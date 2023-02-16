public class Client {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
        Vehicle maruti = new Car(4, "Petrol");
        Vehicle heroHonda = new Bike(100, 2);
//        maruti.getEngineType(maruti);
        String carDescription = maruti.getDescription();
        String bikeDescription = heroHonda.getDescription();
//        System.out.println(carDescription);
//        System.out.println(bikeDescription);
        maruti.dataEntryMethod();
        heroHonda.dataEntryMethod();
        maruti.getEngineType();
        heroHonda.getEngineType();
    }
}
/*
Problem 4: Write a dataEntryMethod() in Vehicle class that will allow you to store the engine information in a data structure.
Problem 5: ReCode the getEngineType(Vehicle Obj) to return the Engine Value from the above data Structure.
 */