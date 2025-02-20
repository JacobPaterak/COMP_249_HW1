
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

    public void setFuel_capacity(double fuel_capacity){
        this.fuel_capacity  = fuel_capacity;
    }

    public double getFuel_capacity(){
        return fuel_capacity;
    }

    public String toString(){
        return super.toString() + this.fuel_capacity;
    }

    public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Diesel_Truck)){
            return false;
        }
		Diesel_Truck obj2 = (Diesel_Truck) obj;
		return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMax_weight_capacity() == obj2.getMax_weight_capacity() && this.getFuel_capacity() == obj2.getFuel_capacity();
		
	}

    

}
