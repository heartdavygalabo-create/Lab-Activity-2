public class Motorcycle extends Vehicle {
    private String enginetype;

    public Motorcycle(String brand, String model, int year, String EngineType) {
        super(brand, model, year);
        this.enginetype = enginetype;
    }

    @Override 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + enginetype + "\n");
    }
}