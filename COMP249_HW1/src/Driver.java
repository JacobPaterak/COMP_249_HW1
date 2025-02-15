import java.util.Scanner;
public class Driver {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		Vehicles v1 = new Vehicles();
		Cars c1 = new Cars();
		int choice=0;
		int Choice2 = 0;
		
		
		
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
			System.out.println("(1) Add a vehicle");
			System.out.println("(2) Delete a vehicle");
			System.out.println("(3) Update a vehicle information");
			System.out.println("(4) List all vehicles by category");
			System.out.println("(5) Exit");
			switch(Choice2)
			{
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					return;
			}
			case 2:
			case 3:
			case 4:
			case 5:
		}
		}
		while(choice!=5);
		
		
		
		
	}

}
