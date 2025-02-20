
public class Electric_Truck extends Truck{

    private double max_autonomy_range;
    private static int electricTruckCounter = 1000;
    private String plateNumber;

    public Electric_Truck(){
        super();
    }

    public Electric_Truck(String Make, String Model, int Year_of_Production, double max_weight_capacity, double max_autonomy_range){
        super(Make, Model, Year_of_Production, max_weight_capacity);
        this.max_autonomy_range = max_autonomy_range;
        this.plateNumber= "EC" + electricTruckCounter++;
    }

    public void setMax_autonomy_range(double max_autonomy_range){
        this.max_autonomy_range = max_autonomy_range;
    }

    public double getMax_autonomy_range(){
        return max_autonomy_range;
    }

    public String toString(){
        return super.toString() + this.max_autonomy_range;
    }

    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Electric_Truck)){
            return false;
        }
        Electric_Truck obj2 = (Electric_Truck) obj;
        return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMax_weight_capacity() == obj2.getMax_weight_capacity() && this.getMax_autonomy_range() == obj2.getMax_autonomy_range();

    }


}
