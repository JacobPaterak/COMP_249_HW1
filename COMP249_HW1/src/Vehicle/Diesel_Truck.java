package Vehicle;

/**
 * Assignment 1
 * Question: Vehicle Management System - Diesel Truck Class
 * Written by: Augustin Redon 40240986
 * 
 * This class represents a Diesel Truck, which is a specific type of truck. It includes
 * attributes such as fuel capacity and an automatically assigned plate number. The class
 * provides constructors, getter and setter methods, a toString method for displaying truck details,
 * and an equals method for object comparison.
 */

public class Diesel_Truck extends Truck{
    
    private static int dieselTruckCounter = 1001;
    private double fuelCapacity;
    private String plateNumber;

    //Default constructor initializing default values and assigning a unique plate number.
    public Diesel_Truck(){
        super();
        this.fuelCapacity = 0.0;
        this.plateNumber = "DT" + dieselTruckCounter++;
    }

    
    //Parameterized constructor to initialize a diesel truck with specified attributes.
    public Diesel_Truck(String Make, String Model, int Year_of_Production, double maxWeightCapacity, double fuelCapacity){
        super(Make, Model, Year_of_Production, maxWeightCapacity);
        this.fuelCapacity = fuelCapacity;
        this.plateNumber = "DT" + dieselTruckCounter++;
    }

    //Copy constructor to create a new Diesel Truck object as a copy of another Diesel Truck.
    public Diesel_Truck(Diesel_Truck obj){
        super(obj);
        this.fuelCapacity = obj.getfuelCapacity();
        this.plateNumber = "DT" + dieselTruckCounter++;
    }

    //Setter for fuel capacity
    public void setfuelCapacity(double fuelCapacity){
        this.fuelCapacity  = fuelCapacity;
    }

    //Getter for fuel capacity
    public double getfuelCapacity(){
        return fuelCapacity;
    }

    //Overrides the toString method to return a formatted string representing the diesel truck.
    @Override
    public String toString(){
        return super.toString() + ", Fuel Tank Capacity: " + this.fuelCapacity + "L, Plate Number: " + plateNumber;
    }

    //Overrides the equals method to compare two Diesel Truck objects based on their attributes.
    @Override
    public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Diesel_Truck)){
            return false;
        }
		Diesel_Truck obj2 = (Diesel_Truck) obj;
		return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMaxWeightCapacity() == obj2.getMaxWeightCapacity() && this.getfuelCapacity() == obj2.getfuelCapacity();
		
	}

    

}
