package Driver;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int choice=0;
		int Choice2 = 0;
		Clients[] All_Clients = new Clients[1];
		String name;
		String Changes_Name;
		int counter = 0;
		int delete_index = 0;
		int type = 0;
		int index = 0;



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
							System.out.println("To which client are we adding a vehicle to? ");
							name = kb.next();
							for(int i = 0; i < All_Clients.length; i++) {
								if(All_Clients[i].getName().equals(name))
								{
									for (int j = 0; j < All_Clients.length; j++)
									{
										if (All_Clients[j] != null) {
											if (All_Clients[j].getName().equals(name))
												index = j;
										}
									}
									System.out.println("Select the vehicle type");
									System.out.println("(1) Gasoline Car");
									System.out.println("(2) Electric Car");
									System.out.println("(3) Electric Truck");
									System.out.println("(4) Diesel Truck");
									type = kb.nextInt();
								}

							}

							switch(type)
							{
								case 1:
									System.out.println("Please enter the vehicle's make");
									String make = kb.next();
									System.out.println("Please enter the vehicle's model");
									String model = kb.next();
									System.out.println("Please enter the vehicle's year of production");
									int YOP = kb.nextInt();
									System.out.println("Please enter the vehicle's maximum number of people");
									int Max_People = kb.nextInt();
									System.out.println(index);
									All_Clients[index].setVehicles(index,new Gasoline_Car(make,model,YOP,Max_People));
									index++;
									break;
								case 2:
									System.out.println("Please enter the vehicle's make");
									make = kb.next();
									System.out.println("Please enter the vehicle's model");
									model = kb.next();
									System.out.println("Please enter the vehicle's year of production");
									YOP = kb.nextInt();
									System.out.println("Please enter the vehicle's maximum number of people");
									Max_People = kb.nextInt();
									System.out.println("Please enter the vehicle's maximum range");
									double Max_Range = kb.nextDouble();
									All_Clients[index].setVehicles(index,new Electric_Car(make,model,YOP,Max_People,Max_Range));
									index++;
									break;
								case 3:

									break;
								case 4:
									break;
								default:
									System.out.println("Invalid input");
									break;
							}


							break;
						case 2:

							for(int i = 0; i < All_Clients.length; i++)
								for(int f = 0; f < All_Clients[i].getArray().length; f++)
									if (All_Clients[i] != null)
									{
										System.out.println(All_Clients[i].getVehicles(f));
									}


							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
					}

					Choice2 = 0;
					break;
				case 2:
					System.out.println("(1) Add a client");
					System.out.println("(2) Edit a client");
					System.out.println("(3) Delete a client");
					System.out.println("(4) Exit");
					Choice2 = kb.nextInt();
					switch(Choice2)
					{
						case 1:
							System.out.println("Please enter the client's name");
							name = kb.next();
							All_Clients[counter] = new Clients(name);
							counter++;
							System.out.println("Client added");
							break;
						case 2:
							System.out.println("Please enter the client's name you wish to edit");
							name = kb.next();
							System.out.println("Please enter the client's new name");
							Changes_Name = kb.next();
							for(int i = 0; i < All_Clients.length; i++)
								if(All_Clients[i] != null) {
									if(All_Clients[i].getName().equals(Changes_Name))
										All_Clients[i].setName(name);
								}
							break;
						case 3:
							System.out.println("Please enter the client's name you wish to delete");
							name = kb.next();
							for(int i = 0; i < All_Clients.length; i++)
							{
								if(All_Clients[i] != null) {
									if (All_Clients[i].getName().equals(name)) {
										delete_index = i;
										All_Clients[i] = null;
										System.out.println("Client deleted");
									}
								}
							}
							for(int i = delete_index; i < All_Clients.length-1; i++)
								All_Clients[i] = All_Clients[i+1];


							break;
						case 4:
							break;
					}
					break;
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
							break;
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
							break;
					}
			}
		}
		while(choice!=5);
		if(choice == 5)
			System.out.println("Thank you for using RoyalRentals");




	}






	public static void getLargestTruck(){
		
	}
	public static void copyVehicles()
	{

	}


	public static void addVehicle(Scanner scanner){
		System.out.println("Select a vehicle type:");
		System.out.println("1. Electric Car");
		System.out.println("2. Gasoline Car");
		System.out.println("3. Diesel Truck");
		System.out.println("4. Electric Truck");

		int choice = scanner.nextInt();

		System.out.println("Enter make:");
		String make = scanner.nextLine();

		System.out.println("Enter model:");
		String model = scanner.nextLine();

		System.out.println("Enter year of production:");
		int yop = scanner.nextInt();

		switch(choice){
			case 1:
				System.out.println("Enter the maximum number of passengers");
				int electricCarMaxPassengers = scanner.nextInt();

				System.out.println("Enter the maximum autonomy range");
				int electricCarMaxAutonomyRange = scanner.nextInt();

				Electric_Car newElectric_Car = new Electric_Car(make, model, yop, electricCarMaxPassengers, electricCarMaxAutonomyRange);

			case 2:
				System.out.println("Enter the maximum number of passengers");
				int gasolineCarMaxPassengers = scanner.nextInt();

				Gasoline_Car newGasoline_Car = new Gasoline_Car(make, model, yop, gasolineCarMaxPassengers);

			case 3:
				System.out.println("Enter max weight capacity:");
				int dieselTruckWeight = scanner.nextInt();
				
				System.out.println("Enter max fuel capacity:");
				int dieselTruckFuelCapacity = scanner.nextInt();

				Diesel_Truck newDiesel_Truck = new Diesel_Truck(make, model, yop, dieselTruckWeight, dieselTruckFuelCapacity);

			case 4:
				System.out.println("Enter max weight capacity:");
				int electricTruckWeight = scanner.nextInt();
				
				System.out.println("Enter max fuel capacity:");
				int electricTruckFuelCapacity = scanner.nextInt();

				Electric_Truck newElectric_Truck = new Electric_Truck(make, model, yop, electricTruckWeight, electricTruckFuelCapacity);

		}
	}




	public static void addVehicle(Scanner scanner){
		System.out.println("Select a vehicle type:");
		System.out.println("1. Electric Car");
		System.out.println("2. Gasoline Car");
		System.out.println("3. Diesel Truck");
		System.out.println("4. Electric Truck");

		int choice = scanner.nextInt();

		System.out.println("Enter make:");
		String make = scanner.nextLine();

		System.out.println("Enter model:");
		String model = scanner.nextLine();

		System.out.println("Enter year of production:");
		int yop = scanner.nextInt();

		switch(choice){
			case 1:
				System.out.println("Enter the maximum number of passengers");
				int electricCarMaxPassengers = scanner.nextInt();

				System.out.println("Enter the maximum autonomy range");
				int electricCarMaxAutonomyRange = scanner.nextInt();

				Electric_Car newElectric_Car = new Electric_Car(make, model, yop, electricCarMaxPassengers, electricCarMaxAutonomyRange);

			case 2:
				System.out.println("Enter the maximum number of passengers");
				int gasolineCarMaxPassengers = scanner.nextInt();

				Gasoline_Car newGasoline_Car = new Gasoline_Car(make, model, yop, gasolineCarMaxPassengers);

			case 3:
				System.out.println("Enter max weight capacity:");
				int dieselTruckWeight = scanner.nextInt();
				
				System.out.println("Enter max fuel capacity:");
				int dieselTruckFuelCapacity = scanner.nextInt();

				Diesel_Truck newDiesel_Truck = new Diesel_Truck(make, model, yop, dieselTruckWeight, dieselTruckFuelCapacity);

			case 4:
				System.out.println("Enter max weight capacity:");
				int electricTruckWeight = scanner.nextInt();
				
				System.out.println("Enter max fuel capacity:");
				int electricTruckFuelCapacity = scanner.nextInt();

				Electric_Truck newElectric_Truck = new Electric_Truck(make, model, yop, electricTruckWeight, electricTruckFuelCapacity);

		}
	}



}
