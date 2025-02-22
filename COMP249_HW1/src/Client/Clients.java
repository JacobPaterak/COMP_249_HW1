package Client;

import Vehicle.*;


public class Clients
{
    private String name;
    private  int id;
    private Vehicles[] vehicles = new Vehicles[10];
    private int counter = 0;
    //Create client objeccts nnand store vehicles arrays inside
//Ex Client josh = new CLient()
//this.vehicles[] and we can put the adddition and subtraction of array size in here too
//
    public Clients(){
      this.name = "";
      id++;
    }

    public Clients(String name){
        this.name = name;
        id++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public void setId(){

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
