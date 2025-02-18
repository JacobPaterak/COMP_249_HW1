import java.util.Scanner;
public class Driver {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		Vehicles v1 = new Vehicles();
		Cars c1 = new Cars();
		int choice=0;
		int Choice2 = 0;
		Gasoline_Car gc1 = new Gasoline_Car();
		Gasoline_Car gc2 = new Gasoline_Car();
		System.out.println(gc1.getPlate_Num());
		System.out.println(gc2.getPlate_Num());
		Gasoline_Car[] gc = new Gasoline_Car[5];
		Electric_Car[] ec = new Electric_Car[5];
		
		
		
		
		
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
						CLients josh = new CLients();
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
