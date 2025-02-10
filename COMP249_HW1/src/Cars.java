
public class Cars extends Vehicles
{
public int Max_people;

public Cars()
{
	this.Plate_Number = "yes";
	this.Make = "Yes";
	this.Model = " yes";
	this.Year_of_Production = 1990;
	this.Max_people = 5;
	
}
public Cars(String Make , String Model, int YOP,int max_peaople) 
{
	this.Make = Make;
	this.Model = Model;
	this.Year_of_Production = YOP;
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
