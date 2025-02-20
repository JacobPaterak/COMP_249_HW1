public class Truck extends Vehicles{

    private double max_weight_capacity;

    public Truck(){
        super();
    }

    public Truck(String Make, String Model, int Year_of_Production, double max_weight_capacity){
        super(Make, Model, Year_of_Production);
        this.max_weight_capacity = max_weight_capacity;
    }

    public void setMax_weight_capacity(double max_weight_capacity){
        this.max_weight_capacity = max_weight_capacity;
    }

    public double getMax_weight_capacity(){
        return max_weight_capacity;
    }

    public String toString(){
        return super.toString() + this.max_weight_capacity;
    }

    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Truck)){
            return false;
        }
        Truck obj2 = (Truck) obj;
        return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMax_weight_capacity() == obj2.getMax_weight_capacity();
    }

}
