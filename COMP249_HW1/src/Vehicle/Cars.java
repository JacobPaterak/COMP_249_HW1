package Vehicle;

public class Cars extends Vehicles{
	//variables
	private int maxPassengers;
	//default contructor
	public Cars(){
		super();
		this.maxPassengers = 0;	
	}
//Parameterized constructor
	public Cars(String Make , String Model, int YOP,int maxPassengers){
		super(Make,Model,YOP);
		this.maxPassengers = maxPassengers;
	}
	//setter
	public void setMaxPassengers(int maxPassengers){
		this.maxPassengers = maxPassengers;
	}
	//getter
	public int getMaxPassengers(){
		return this.maxPassengers;
	}
	//copy constructor
	public Cars(Cars obj){
		super(obj);
		this.maxPassengers = obj.getMaxPassengers();
	}
	//to string
	@Override
	public String toString(){
		return super.toString() + ", Max Passengers: "+ this.maxPassengers;
	}
	//equals
	@Override
	public boolean equals(Object obj){
		//checkis if object is an instance of wanted class and not null
		if(obj == null || !(obj instanceof Cars))
			return false;
		//changes object to type cars
		Cars obj2 = (Cars) obj;
		
		return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.maxPassengers == obj2.maxPassengers;
		
	}




}
