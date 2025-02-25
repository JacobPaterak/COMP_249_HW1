package Vehicle;

/**
 * Assignment 1
 * Question: Vehicle Management System
 * Written by: Augustin Redon 40240986 - Jacob 
 * 
 * This class represents a generic vehicle with attributes such as plate number, make,
 * model, year of production, and lease status. It includes constructors, getter and
 * setter methods, a toString method for displaying vehicle details, and an equals
 * method for comparison.
 */

public class Vehicles {
    private String Plate_Number; 
    private String Make; 
    private String Model; 
    private int Year_of_Production; 
    private boolean is_Leased; 

    
    //Default constructor initializing default values.
    public Vehicles() {
        this.Make = "Yes";
        this.Model = "No";
        this.Year_of_Production = 1996;
    }


     //Parameterized constructor to initialize a vehicle with given make, model, and year of production.
    public Vehicles(String Make, String Model, int YOP) {
        this.Make = Make;
        this.Model = Model;
        this.Year_of_Production = YOP;
    }


    //Copy constructor to create a new vehicle object as a copy of another vehicle.
    public Vehicles(Vehicles obj) {
        this.Make = obj.getMake();
        this.Model = obj.getModel();
        this.Year_of_Production = obj.getYear_of_Production();
    }

    //Getter for Plate Number
    public String getPlate_Number() {
        return this.Plate_Number;
    }


    //Setter for Plate Number
    public void setPlate_Number(String Plate_Num) {
        this.Plate_Number = Plate_Num;
    }


    //Getter for Make
    public String getMake() {
        return this.Make;
    }


    //Setter for Make
    public void setMake(String Make) {
        this.Make = Make;
    }

    
    //Getter for Model
    public String getModel() {
        return this.Model;
    }


    //Setter for Model
    public void setModel(String Model) {
        this.Model = Model;
    }

    //Getter for Year of Production
    public int getYear_of_Production() {
        return this.Year_of_Production;
    }


    //Setter for Year of Production
    public void setYear_Of_Production(int Year_of_Production) {
        this.Year_of_Production = Year_of_Production;
    }

    //Getter for Lease status
    public boolean getLeased() {
        return this.is_Leased;
    }

    //Setter for Lease status
    public void setLeased(boolean is_Leased) {
        this.is_Leased = is_Leased;
    }

    //Overrides the toString method to return a formatted string representing the vehicle.
    @Override
    public String toString() {
        return "Make: " + this.Make + ", Model: " + this.Model + ", Year of Production: " + this.Year_of_Production;
    }

 
    //Overrides the equals method to compare two vehicle objects based on their attributes.
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Vehicles))
            return false;
        Vehicles obj2 = (Vehicles) obj;
        return this.Make.equals(obj2.Make) && this.Model.equals(obj2.Model) && this.Year_of_Production == obj2.Year_of_Production;
    }
}
