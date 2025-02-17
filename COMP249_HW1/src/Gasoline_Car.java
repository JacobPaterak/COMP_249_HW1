
public class Gasoline_Car extends Cars 
{
	public Gasoline_Car()
	{
		super();
	}
	public Gasoline_Car(String Make, String Model,int YOP, int Max_People)
	{
		super(Make,Model,YOP,Max_People);
	}
	public String toString()
	{
		return super.toString();
	}
	public boolean equals(Object obj)
	{
		if(obj == null || !(obj instanceof Gasoline_Car))
			return false;
		Gasoline_Car obj2 = (Gasoline_Car)obj;
		return this.Make.equals(obj2.Make) && this.Model.equals(obj2.Model) && this.Year_of_Production == obj2.Year_of_Production && this.Max_people == obj2.Max_people;
		
	}
	
}
