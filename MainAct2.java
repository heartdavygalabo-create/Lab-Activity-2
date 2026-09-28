public class Main{

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 2020);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2020);
        Vehicle vehicle3 = new Vehicle("Nissan", "Navarra", 1998);

        System.out.println("VEHICLE 1");
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge() + " years");
        System.out.println("Is Vintage? " + vehicle1.isVintage());
        System.out.println();

        System.out.println("VEHICLE 2");
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge() + " years");
        System.out.println("Is Vintage? " + vehicle2.isVintage());
        System.out.println();

        System.out.println("VEHICLE 3");
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge() + " years");
        System.out.println("Is Vintage? " + vehicle3.isVintage());
    }
}
