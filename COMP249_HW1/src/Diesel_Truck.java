
public class Diesel_Truck extends Truck{
    
    private static int dieselTruckCounter = 1000;
    private double fuel_capacity;
    private String Plate_Number;

    public Diesel_Truck(){
        super();
    }

    public Diesel_Truck(String Make, String Model, int Year_of_Production, double max_weight_capacity, double fuel_capacity){
        super(Make, Model, Year_of_Production, max_weight_capacity);
        this.fuel_capacity = fuel_capacity;
        this.Plate_Number = "DT" + dieselTruckCounter++;
    }



    

}
