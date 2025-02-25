package Vehicle;

public class Cars extends Vehicles{
	
	private int maxPassengers;

	public Cars(){
		super();
		this.maxPassengers = 0;	
	}

	public Cars(String Make , String Model, int YOP,int maxPassengers){
		super(Make,Model,YOP);
		this.maxPassengers = maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers){
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers(){
		return this.maxPassengers;
	}

	public Cars(Cars obj){
		super(obj);
		this.maxPassengers = obj.getMaxPassengers();
	}

	@Override
	public String toString(){
		return super.toString() + ", Max Passengers: "+ this.maxPassengers;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Cars))
			return false;
		Cars obj2 = (Cars) obj;
		
		return this.getMake().equals(obj2.getMake()) && this.getModel().equals(obj2.getModel()) && this.getYear_of_Production() == obj2.getYear_of_Production() && this.maxPassengers == obj2.maxPassengers;
		
	}

	public void Plate_Number(){
		
	}


}
