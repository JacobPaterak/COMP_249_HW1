
public class Diesel_Truck extends Truck{
    
    private static int dieselTruckCounter = 1000;
    private double fuelCapacity;
    private String plateNumber;

    //Default Constructor
    public Diesel_Truck(){
        super();
        this.fuelCapacity = 0.0;
        this.plateNumber = "DT" + dieselTruckCounter++;
    }

    //Parameterized Constructor
    public Diesel_Truck(String Make, String Model, int Year_of_Production, double max_weight_capacity, double fuelCapacity){
        super(Make, Model, Year_of_Production, max_weight_capacity);
        this.fuelCapacity = fuelCapacity;
        this.plateNumber = "DT" + dieselTruckCounter++;
    }

    //Copy Constructor
    public Diesel_Truck(Diesel_Truck obj){
        super(obj);
        this.fuelCapacity = obj.getfuelCapacity();
        this.plateNumber = "DT" + dieselTruckCounter++;
    }

    //Setter
    public void setfuelCapacity(double fuelCapacity){
        this.fuelCapacity  = fuelCapacity;
    }

    //Getter
    public double getfuelCapacity(){
        return fuelCapacity;
    }

    @Override
    public String toString(){
        return super.toString() + ", Fuel Tank Capacity: " + this.fuelCapacity + "L, Plate Number: " + plateNumber;
    }

    @Override
    public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Diesel_Truck)){
            return false;
        }
		Diesel_Truck obj2 = (Diesel_Truck) obj;
		return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMax_weight_capacity() == obj2.getMax_weight_capacity() && this.getfuelCapacity() == obj2.getfuelCapacity();
		
	}

    

}
