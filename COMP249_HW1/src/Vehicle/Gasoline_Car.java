package Vehicle;

public class Gasoline_Car extends Cars 
{
	//variables
	private String plate_number;
	private static int plate_counter = 1001;
	//default contructor
	public Gasoline_Car(){
		super();
		this.plate_number = "GC" + this.plate_counter++;

	}
	//parameterized constructor
	public Gasoline_Car(String Make, String Model,int YOP, int Max_People){
		super(Make,Model,YOP,Max_People);
		this.plate_number = "GC"+ this.plate_counter++;
	}
	//to string
	public String toString(){
		return super.toString() + " The plate number is "+ this.plate_number;
	}
	//Copy contructor
	public Gasoline_Car(Gasoline_Car obj)
	{
		super(obj);
		this.plate_number = obj.plate_number;
	}
	//getter
	public String getPlate_Number(){

		return this.plate_number;
	}
	//checks if equals
	public boolean equals(Object obj){
		//checkis if object is an instance of wanted class and not null
		if(obj == null || !(obj instanceof Gasoline_Car))
			return false;
		Gasoline_Car obj2 = (Gasoline_Car)obj;
		return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMaxPassengers() == obj2.getMaxPassengers();
		
	}
	
}
