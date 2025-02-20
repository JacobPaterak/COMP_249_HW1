public class Truck extends Vehicles{

    private double max_weight_capacity;

    public Truck(){
        super();
    }

    public Truck(String Make, String Model, int Year_of_Production, double max_weight_capacity){
        super(Make, Model, Year_of_Production);
        this.max_weight_capacity = max_weight_capacity;
    }

}
