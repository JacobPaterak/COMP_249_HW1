
public class Cars extends Vehicles
{
public int Max_people;

public Cars()
{
	super();
	this.Max_people = 5;
	
}
public Cars(String Make , String Model, int YOP,int max_peaople) 
{
	super(Make,Model,YOP);
	this.Max_people = Max_people;
}
public void setMax_People(int max_people)
{
	this.Max_people = max_people;
}
public int getMax_People()
{
	return this.Max_people;
}
public void Copy(Cars obj)
{
	this.Make = obj.getMake();
	this.Model = obj.getModel();
	this.Year_of_Production = obj.getYear_of_Production();
	this.Max_people = obj.getMax_People();
}


}
