package Vehicle;

/*
 * Assignment 1
 * Question: Vehicle Management System - Truck Class
 * Written by: Augustin Redon 40240986 - Jacob
 *
 * This class represents a Truck, which is a subclass of Vehicles.
 * It includes attributes, constructors, and methods specific to trucks,
 * such as max weight capacity. 
 */

public class Truck extends Vehicles{

    private double maxWeightCapacity;

    /*
     * Default Constructor
     * Initializes a Truck object with default values.
     */
    public Truck(){
        super();
        double maxWeightCapacity = 0.0;
    }

    /**
     * Parameterized Constructor
     * Initializes a Truck object with provided values.
     */
    public Truck(String Make, String Model, int Year_of_Production, double maxWeightCapacity){
        super(Make, Model, Year_of_Production);
        this.maxWeightCapacity = maxWeightCapacity;
    }

    /**
     * Copy Constructor
     * Creates a new Truck object by copying the attributes of an existing Truck object.
     */
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

    //Overridden toString method to provide a string representation of the Truck object.
    @Override
    public String toString(){
        return super.toString() + ", Max Weight Capacity: " + this.maxWeightCapacity + "kg";
    }

    //Overridden equals method to compare two Truck objects.
    @Override
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Truck)){
            return false;
        }
        Truck obj2 = (Truck) obj;
        return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMaxWeightCapacity() == obj2.getMaxWeightCapacity();
    }

}
