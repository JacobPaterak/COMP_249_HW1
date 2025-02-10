
public class Vehicles 
{
private String Plate_Number;
private String Make;
private String Model;
private int Year_of_Production;

public Vehicles()
{
	
}
public Vehicles(String Make, String Model, int YOP)
{
	
}
public String getPlate_Number()
{
	return this.Plate_Number;
}
public String getMake()
{
	return this.Make;
}

public String getModel()
{
	return this.Model;
}

public int getYear_of_Production()
{
	return this.Year_of_Production;
}
public void setPlate_Number(String Plate_Num)
{
	this.Plate_Number = Plate_Num;
}
public void setMake(String Make) 
{
this.Make = Make;	
}
public void setModel(String Model)
{
	this.Model = Model;
}
public void setYear_Of_Production(int Year_of_Production)
{
	this.Year_of_Production = Year_of_Production;
}
public void Copy(Vehicles obj)
{
	this.Make = obj.getMake();
	this.Model = obj.getModel();
	this.Year_of_Production = obj.getYear_of_Production();
}
public String toString()
{
	return "The model is " + this.Model + " the make is " +  this.Make + " the year of production is " + this.Year_of_Production;
}


}
