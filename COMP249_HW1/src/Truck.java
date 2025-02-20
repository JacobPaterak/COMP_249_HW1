public class Truck extends Vehicles{

    private double max_weight_capacity;

    //Default Constructor
    public Truck(){
        super();
        double max_weight_capacity = 0.0;
    }

    //Parameterized Constructor
    public Truck(String Make, String Model, int Year_of_Production, double max_weight_capacity){
        super(Make, Model, Year_of_Production);
        this.max_weight_capacity = max_weight_capacity;
    }

    //Copy Constructor
    public Truck(Truck obj){
        super(obj);
        this.max_weight_capacity = obj.getMax_weight_capacity();
    }

    //Setter
    public void setMax_weight_capacity(double max_weight_capacity){
        this.max_weight_capacity = max_weight_capacity;
    }

    //Getter
    public double getMax_weight_capacity(){
        return max_weight_capacity;
    }

    @Override
    public String toString(){
        return super.toString() + ", Max Weight Capacity: " + this.max_weight_capacity + "kg";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Truck)){
            return false;
        }
        Truck obj2 = (Truck) obj;
        return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMax_weight_capacity() == obj2.getMax_weight_capacity();
    }

}
