
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
public Cars(Cars obj)
{
	super(obj);
	this.Max_people = obj.getMax_People();
}

public String toString()
{
	return super.toString() + this.Max_people;

}
public boolean equals(Object obj)
{
	if(obj == null || !(obj instanceof Cars))
		return false;
	Cars obj2 = (Cars) obj;
	return this.Make.equals(obj2.Make) && this.Model.equals(obj2.Model) && this.Year_of_Production == obj2.Year_of_Production && this.Max_people == obj2.Max_people;
	
}


}
