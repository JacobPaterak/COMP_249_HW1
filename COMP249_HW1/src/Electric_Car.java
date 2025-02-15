
public class Electric_Car extends Cars
{
	private double Max_Autonomy_Range;
	
	public Electric_Car()
	{
		super();	
		this.Max_Autonomy_Range = 15.0;
		
	}
	public Electric_Car(String Make, String Model, int YOP,int Max_People ,double Max_Range)
	{
		super(Make,Model,YOP,Max_People);
		this.Max_Autonomy_Range = Max_Range;
	}
	public void setMax_Range(double Max_Range)
	{
		this.Max_Autonomy_Range = Max_Range;
	}
	public double setMax_People()
	{
		return this.Max_Autonomy_Range;
	}
}
