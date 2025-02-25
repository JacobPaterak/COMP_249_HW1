package Vehicle;

/**
 * Assignment 1
 * Question: Vehicle Management System
 * Written by: Augustin Redon 40240986
 * 
 * This class represents an Electric Truck, which is a specific type of truck. It includes
 * attributes such as maximum autonomy range and an automatically assigned plate number. The class
 * provides constructors, getter and setter methods, a toString method for displaying truck details,
 * and an equals method for object comparison.
 */

public class Electric_Truck extends Truck{

    private double maxAutonomyRange;
    private static int electricTruckCounter = 1000;
    private String plateNumber;

    // Default constructor initializing default values and assigning a unique plate number.
    public Electric_Truck(){
        super();
        this.maxAutonomyRange = 0.0;
        this.plateNumber = "ET" + electricTruckCounter++;
    }

    //Parameterized constructor to initialize an electric truck with specified attributes.
    public Electric_Truck(String Make, String Model, int Year_of_Production, double maxWeightCapacity, double maxAutonomyRange){
        super(Make, Model, Year_of_Production, maxWeightCapacity);
        this.maxAutonomyRange = maxAutonomyRange;
        this.plateNumber= "ET" + electricTruckCounter++;
    }

    //Copy constructor to create a new Electric Truck object as a copy of another Electric Truck.
    public Electric_Truck(Electric_Truck obj){
        super(obj);
        this.maxAutonomyRange = obj.getMaxAutonomyRange();
        this.plateNumber = "ET" + electricTruckCounter++;

    }

    //Setter for maximum autonomy range.
    public void setMaxAutonomyRange(double maxAutonomyRange){
        this.maxAutonomyRange = maxAutonomyRange;
    }

    //Getter for maximum autonomy range.
    public double getMaxAutonomyRange(){
        return maxAutonomyRange;
    }

    //Overrides the toString method to return a formatted string representing the electric truck.
    @Override
    public String toString(){
        return super.toString() + ", Max Autonomy Range: " + this.maxAutonomyRange + "km, Plate Number: " + plateNumber;
    }

    //Overrides the equals method to compare two Electric Truck objects based on their attributes.
    @Override
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Electric_Truck)){
            return false;
        }
        Electric_Truck obj2 = (Electric_Truck) obj;
        return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMaxWeightCapacity() == obj2.getMaxWeightCapacity() && this.getMaxAutonomyRange() == obj2.getMaxAutonomyRange();

    }


}
