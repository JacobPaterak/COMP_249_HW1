package Client;

/**
 * Assignment 1
 * Question: Client Management System
 * Written by: Jacob Paterak 40268958 - Augustin Redon 40240986
 * 
 * The Clients class represents a client in the Royal Rentals system.
 * Each client has a name, an ID, and a list of vehicles they have leased.
 */

import Vehicle.*;


public class Clients{
    private String name;
    private  int id;
    private Vehicles[] vehicles = new Vehicles[10];
    private int counter = 0;

    //Default constructor initializes the client with an empty name and increments the ID.
    public Clients(){
      this.name = "";
      id++;
    }

    //Parameterized constructor initializes the client with a specified name and increments the ID.
    public Clients(String name){
        this.name = name;
        id++;
    }

    //Setter for the client's name.
    public void setName(String name){
        this.name = name;
    }

    //Getter for the client's name.
    public String getName(){
        return this.name;
    }

    //Getter for the client's ID.
    public int getId(){
        return this.id;
    }



    public Vehicles[] getArray(){
        return this.vehicles;
    }

    public void setVehicles(Vehicles vehicles){
        this.vehicles[counter] = vehicles;
        counter++;
    }
    public void removeVehicles(Vehicles vehicle) {
        // Find the index of the vehicle to remove
        int removeIndex = -1;
        for (int i = 0; i <= counter; i++) {
            if (this.vehicles[i] == vehicle) {
                removeIndex = i;
                break;
            }
        }

        // If the vehicle wasn't found, notify and exit
        if (removeIndex == -1) {
            System.out.println("Vehicle not found. Unable to remove.");
            return;
        }

        // Shift all elements after the removed vehicle to the left
        for (int i = removeIndex; i < counter; i++) {
            this.vehicles[i] = this.vehicles[i + 1];
        }

        // Nullify the last element (to avoid leaving a duplicate reference)
        this.vehicles[counter] = null;

        // Decrement the counter to reflect the removal
        counter--;
        System.out.println("Vehicle removed successfully.");
    }

    @Override
    public String toString(){
        return this.name + " " + this.id;
    }

    public Vehicles getVehicles(int index){
        if (this.vehicles[index] instanceof Cars){
            if (this.vehicles[index] instanceof Electric_Car){
                Electric_Car obj = (Electric_Car) this.vehicles[index];
                return this.vehicles[index];
            } else {
                Gasoline_Car obj = (Gasoline_Car) this.vehicles[index];
                return this.vehicles[index];
            }
        }
        return null;
    }
}
