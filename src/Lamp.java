public class Lamp {

    protected String type;
    protected int size;
    protected String color;
    protected String material;
    protected int weight;
    protected String model;

    public void turnOn() {
        System.out.println("Lamp is turned on.");
    }

    public void turnOff() {
        System.out.println("Lamp is turned off.");
    }

    public Lamp() {
    }

    public Lamp(String type, int size, String color, String material, int weight) {
        this.type = type;
        this.size = size;
        this.color = color;
        this.material = material;
        this.weight = weight;
        this.model = color + " " + type + " Lamp with " + material + " of " + weight + " grams.";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}

class LEDLamp extends Lamp {

    @Override
    public void turnOn() {
        System.out.println("LED lamp is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("LED lamp is turned off.");
    }

    public void turnOn(int flashes) {
        for (int i = 1; i <= flashes; i++) {
            turnOn();
            turnOff();
            turnOn();
        }
    }

    public LEDLamp() {
    }

    public LEDLamp(String type, int size, String color, String material, int weight) {
        super(type, size, color, material, weight);
        this.model = color + " " + type + " Lamp with " + material + " of " + weight + " grams.";
    }
}

class User {

    public static void main(String[] args) {
        Lamp lamp = new Lamp("Normal", 5, "White", "Plastic Body", 50);
        Lamp lampNoConstructor = new Lamp();
        System.out.println(lampNoConstructor);
        System.out.println(lamp.getModel());
        lamp.turnOn();
        lamp.turnOff();
        LEDLamp ledlamp = new LEDLamp("LED", 10, "Red", "Plastic Body", 100);
        LEDLamp ledLampNoConstructor = new LEDLamp();
        System.out.println(ledLampNoConstructor);
        System.out.println(ledlamp.getModel());
        ledlamp.turnOn(2);
        ledlamp.turnOff();
    }
}