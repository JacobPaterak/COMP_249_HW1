package Vehicle;

public class Gasoline_Car extends Cars 
{
	private String plate_number = "GC";
	private int plate_counter = 1001;
	private static int counter;
	public Gasoline_Car(){
		super();
		this.plate_number = this.plate_number + this.plate_counter++;

	}

	public Gasoline_Car(String Make, String Model,int YOP, int Max_People){
		super(Make,Model,YOP,Max_People);
		this.plate_number = this.plate_number + this.plate_counter++;
	}

	@Override
	public String toString(){
		return super.toString() + ", Plate Number: "+ this.plate_number;
	}


	public String getPlate_Number(){
		return this.plate_number;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Gasoline_Car))
			return false;
		Gasoline_Car obj2 = (Gasoline_Car)obj;
		return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMaxPassengers() == obj2.getMaxPassengers();
		
	}
	
}
