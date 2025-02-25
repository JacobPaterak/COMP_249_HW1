package Vehicle;

public class Electric_Truck extends Truck{

    private double maxAutonomyRange;
    private static int electricTruckCounter = 1001;
    private String plateNumber;

    //Default Constructor
    public Electric_Truck(){
        super();
        this.maxAutonomyRange = 0.0;
        this.plateNumber = "ET" + electricTruckCounter++;
    }

    //Parameterized Constructor
    public Electric_Truck(String Make, String Model, int Year_of_Production, double maxWeightCapacity, double maxAutonomyRange){
        super(Make, Model, Year_of_Production, maxWeightCapacity);
        this.maxAutonomyRange = maxAutonomyRange;
        this.plateNumber= "ET" + electricTruckCounter++;
    }

    //Copy Constructor
    public Electric_Truck(Electric_Truck obj){
        super(obj);
        this.maxAutonomyRange = obj.getMaxAutonomyRange();
        this.plateNumber = "ET" + electricTruckCounter++;

    }

    //Setter
    public void setMaxAutonomyRange(double maxAutonomyRange){
        this.maxAutonomyRange = maxAutonomyRange;
    }

    //Getter
    public double getMaxAutonomyRange(){
        return maxAutonomyRange;
    }


    @Override
    public String toString(){
        return super.toString() + ", Max Autonomy Range: " + this.maxAutonomyRange + "km, Plate Number: " + plateNumber;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Electric_Truck)){
            return false;
        }
        Electric_Truck obj2 = (Electric_Truck) obj;
        return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMaxWeightCapacity() == obj2.getMaxWeightCapacity() && this.getMaxAutonomyRange() == obj2.getMaxAutonomyRange();

    }


}
