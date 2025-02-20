public class Truck extends Vehicles{

    private double maxWeightCapacity;

    //Default Constructor
    public Truck(){
        super();
        double maxWeightCapacity = 0.0;
    }

    //Parameterized Constructor
    public Truck(String Make, String Model, int Year_of_Production, double maxWeightCapacity){
        super(Make, Model, Year_of_Production);
        this.maxWeightCapacity = maxWeightCapacity;
    }

    //Copy Constructor
    public Truck(Truck obj){
        super(obj);
        this.maxWeightCapacity = obj.getMaxWeightCapacity();
    }

    //Setter
    public void setMaxWeightCapacity(double maxWeightCapacity){
        this.maxWeightCapacity = maxWeightCapacity;
    }

    //Getter
    public double getMaxWeightCapacity(){
        return maxWeightCapacity;
    }

    @Override
    public String toString(){
        return super.toString() + ", Max Weight Capacity: " + this.maxWeightCapacity + "kg";
    }

    
    @Override
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Truck)){
            return false;
        }
        Truck obj2 = (Truck) obj;
        return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMaxWeightCapacity() == obj2.getMaxWeightCapacity();
    }

}
