public class MainAct.Java {
   
   public static void main(String[] args){
   
         Vehicle vehicle1 = new Vehicle();
         vehicle1.brand = "Toyota";
         vehicle1.model = "Corolla";
         vehicle1.year = 2020;

         Vehicle vehicle2 = new Vehicle();
         vehicle2.brand = "Honda";
         vehicle2.model = "Civic";
         vehicle2.year = 2020;
         
         Vehicle vehicle3 = new Vehicle();
         vehicle3.brand = "Nissan";
         vehicle3.model = "Navarra";
         vehicle3.year = 1998;

   System.out.println( " VEHICLE 1 ");
   vehicle1.displayInfo();
   System.out.println(" Age: "+ vehicle1.calculateAge() + " years");
   System.out.println(" Is Vintage? " + vehicle1.isVintage());
   System.out.println();
   
   System.out.println( " VEHICLE 2 ");
   vehicle2.displayInfo();
   System.out.println(" Age: "+ vehicle2.calculateAge() + " years");
   System.out.println(" Is Vintage? " + vehicle2.isVintage());
   System.out.println();
   
   System.out.println( " VEHICLE 3 ");
   vehicle3.displayInfo();
   System.out.println(" Age: "+ vehicle3.calculateAge() + " years");
   System.out.println(" Is Vintage? " + vehicle3.isVintage());
        

   }

}