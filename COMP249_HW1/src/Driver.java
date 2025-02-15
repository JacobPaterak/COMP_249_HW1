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
			Choice2 = kb.nextInt();
			switch(Choice2)
			{
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					return;
			}
			Choice2 = 0;
			case 2:
				System.out.println("(1) Add a client");
				System.out.println("(2) Edit a client");
				System.out.println("(3) Delete a client");
				System.out.println("(4) Exit");
				Choice2 = kb.nextInt();
				switch(Choice2)
				{
					case 1:
					case 2:
					case 3:
					case 4:
						return;
				}
			case 3:
				System.out.println("(1) Lease a vehicle to a client");
				System.out.println("(2) Return a vehicle from a client");
				System.out.println("(3) Show all vehicles leased by a client");
				System.out.println("(4) Show all leased vehicles");
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
			case 4:
				System.out.println("(1) Display the truck with the largest capacity");
				System.out.println("(2) Create a copy of the electric trucks array");
				System.out.println("(3) Exit");
				switch(Choice2)
				{
					case 1:
					case 2:
					case 3:
						return;
				}
		}
		}
		while(choice!=5);
		if(choice == 5)
			System.out.println("Thank you for using RoyalRentals");
		
		
		
		
	}
	public static void getLargestTruck()
	{
		
	}
	public static void copyVehicles()
	{
		
	}

}
