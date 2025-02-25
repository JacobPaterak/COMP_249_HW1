package Vehicle;

public class Electric_Car extends Cars
{
	private double Max_Autonomy_Range;
	private int plate_number;
	private static int counter;
	
	public Electric_Car(){
		super();	
		this.Max_Autonomy_Range = 15.0;
		this.plate_number = 1000 + counter;
		counter++;
	}

	public Electric_Car(String Make, String Model, int YOP,int Max_People ,double Max_Range){
		super(Make,Model,YOP,Max_People);
		this.Max_Autonomy_Range = Max_Range;
		this.plate_number = 1000 + counter;
		counter++;
	}

	public void setMax_Range(double Max_Range){
		this.Max_Autonomy_Range = Max_Range;
	}
	public double getMax_Autonomy_Range(){
		return this.Max_Autonomy_Range;
	}

	@Override
	public String toString(){
		return super.toString() + ", Max Autonomy Range: " +  this.Max_Autonomy_Range + ", Plate Number: "+ this.plate_number;

	}
	public Electric_Car(Electric_Car obj){
		super(obj);
		this.Max_Autonomy_Range = obj.getMax_Autonomy_Range();
		this.plate_number = 1000 + counter;
		counter++;
	}

	public String getPlate_Num(){
		return "EC" + this.plate_number;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Electric_Car))
			return false;
		Electric_Car obj2 = (Electric_Car) obj;
		return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMaxPassengers() == obj2.getMaxPassengers() && this.Max_Autonomy_Range == obj2.Max_Autonomy_Range;
		
	}
	
}

