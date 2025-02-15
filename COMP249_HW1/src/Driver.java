import java.util.Scanner;
public class Driver {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		Vehicles v1 = new Vehicles();
		Cars c1 = new Cars();
		int choice=0;
		Gasoline_Car gc1 = new Gasoline_Car();
		
		
		
		do {
			
		System.out.println("Please choose");
		System.out.println("\t (1) Vehicle Management");
		System.out.println("\t (2) Client Management");
		System.out.println("\t (3) Leasing Operations");
		System.out.println("\t (4) Additional Operations");
		System.out.println("\t (5) Quit");
		choice = kb.nextInt();
		switch(choice)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
		}
		}
		while(choice!=5);
		
		
		
		
	}

}
