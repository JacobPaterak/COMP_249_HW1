package Vehicle;
//assignment 1
//Jacob Paterak 40268958
//Vehicle managment
//this class represents an electric car with getters, setters,copy contructor, toString and equals methods
public class Electric_Car extends Cars
{
	//variables
	private double Max_Autonomy_Range;
	private String plate_number;
	private static int plate_counter = 1001;
	private static int counter;
	//default constructor
	public Electric_Car(){
		super();	
		this.Max_Autonomy_Range = 15.0;
		this.plate_number = "EC" + plate_counter++;
	}
	//parameterized constructor
	public Electric_Car(String Make, String Model, int YOP,int Max_People ,double Max_Range){
		super(Make,Model,YOP,Max_People);
		this.Max_Autonomy_Range = Max_Range;
		this.plate_number = "EC" + plate_counter++;
	}
	//setter
	public void setMax_Range(double Max_Range){
		this.Max_Autonomy_Range = Max_Range;
	}
	//getter
	public double getMax_Autonomy_Range(){
		return this.Max_Autonomy_Range;
	}
	//to String
	@Override
	public String toString(){
		return super.toString() + ", Max Autonomy Range: " +  this.Max_Autonomy_Range + ", Plate Number: "+ this.plate_number;

	}
	//Copy constructor
	public Electric_Car(Electric_Car obj){
		super(obj);
		this.Max_Autonomy_Range = obj.getMax_Autonomy_Range();
		this.plate_number = "GC" + plate_counter++;
	}
	//getter
	public String getPlate_Num(){
		return this.plate_number;
	}

	@Override
	//equals
	public boolean equals(Object obj){
		//checkis if object is an instance of wanted class and not null
		if(obj == null || !(obj instanceof Electric_Car))
			return false;
		//changes object to electric cars
		Electric_Car obj2 = (Electric_Car) obj;
		return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.getMaxPassengers() == obj2.getMaxPassengers() && this.Max_Autonomy_Range == obj2.Max_Autonomy_Range;
		
	}
	
}

