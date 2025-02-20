package Client;
public class Clients
{
    private String name;
    private  int id;
    private Vehicles[] vehicles = new Vehicles[1];
    private int counter = 0;

    public Clients()
    {
        this.name = "";
        id++;
    }
    public Clients(String name)
    {
        this.name = name;
        id++;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public int getId()
    {
        return this.id;
    }
    public void setId()
    {

    }
    public Vehicles[] getArray()
    {
        return this.vehicles;
    }
    public void setVehicles(int a,Vehicles veh)
    {
        this.vehicles[a] = veh;
    }
    public String toString()
    {
        return this.name + " " + this.id;
    }
    public Vehicles getVehicles(int index)
    {
        if (this.vehicles[index] instanceof Cars)
        {
            if (this.vehicles[index] instanceof Electric_Car)
            {
                Electric_Car obj = (Electric_Car) this.vehicles[index];
                return this.vehicles[index];
            }
            else
            {
                Gasoline_Car obj = (Gasoline_Car) this.vehicles[index];
                return this.vehicles[index];
            }

        }
        return null;
    }
}
