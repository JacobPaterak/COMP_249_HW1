package Driver;

import java.util.Scanner;
import Client.*;
import Vehicle.*;

public class Driver {

	public static int vehicleCount = 0;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int choice = 0;
		int Choice2 = 0;
		Clients[] All_Clients = new Clients[1];
		String name;
		String Changes_Name;
		int counter = 0;
		int type = 0;
		int index = 0;
		Vehicles[] all_Vehicles = new Vehicles[10];
		all_Vehicles[0] = new Gasoline_Car();


		do {
			System.out.println("Please choose");
			System.out.println("\t (1) Vehicle Management");
			System.out.println("\t (2) Client Management");
			System.out.println("\t (3) Leasing Operations");
			System.out.println("\t (4) Additional Operations");
			System.out.println("\t (5) Quit");
			choice = kb.nextInt();
			switch (choice) {
				case 1:
					System.out.println("(1) Add a vehicle");
					System.out.println("(2) Delete a vehicle");
					System.out.println("(3) Update a vehicle information");
					System.out.println("(4) List all vehicles by category");
					System.out.println("(5) Exit");
					Choice2 = kb.nextInt();
					switch (Choice2) {
						case 1:
							addVehicle(kb);
							break;
						case 2:
							deleteVehicle(kb, all_Vehicles);
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
					switch (Choice2) {
						case 1:
							System.out.println("Please enter the client's name");
							name = kb.next();
							addClient(name, All_Clients, counter);
							break;
						case 2:
							System.out.println("Please enter the client's name you wish to edit");
							name = kb.next();
							System.out.println("Please enter the client's new name");
							Changes_Name = kb.next();
							editClient(All_Clients, name, Changes_Name);
							break;
						case 3:
							System.out.println("Please enter the client's name you wish to delete");
							name = kb.next();
							deleteClient(All_Clients, name);
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
					switch (Choice2) {
						case 1:
							//Plate number
							//Make sure vehicles is not already leased
							System.out.println("To which client are we adding a vehicle to? ");
							name = kb.next();
							for (int i = 0; i < All_Clients.length; i++) {
								if (All_Clients[i].getName().equals(name)) {
									for (int j = 0; j < All_Clients.length; j++) {
										if (All_Clients[j] != null) {
											if (All_Clients[j].getName().equals(name))
												index = j;
										}
									}
								} else {
									System.out.println("Client not found");
								}
							}
							System.out.print("Enter the plate number of the vehicle you wish to lease");
							String plate_number = kb.next();
							leaseVehicle(index, plate_number, All_Clients, all_Vehicles);

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
					switch (Choice2) {
						case 1:
						case 2:
						case 3:
							break;
					}
			}
		}
		while (choice != 5);
		if (choice == 5) {
			System.out.println("Thank you for using RoyalRentals");
		}
	}

	public static void addClient(String name, Clients[] All_Clients, int counter) {
		All_Clients[counter] = new Clients(name);
		counter++;
		System.out.println("Client added");
	}

	public static void editClient(Clients[] All_Clients, String name, String Changes_Name) {
		for (int i = 0; i < All_Clients.length; i++)
			if (All_Clients[i] != null) {
				if (All_Clients[i].getName().equals(Changes_Name))
					All_Clients[i].setName(name);

			}
	}

	public static void deleteClient(Clients[] All_Clients, String name) {
		int delete_index = 0;
		for (int i = 0; i < All_Clients.length; i++) {
			if (All_Clients[i] != null) {
				if (All_Clients[i].getName().equals(name)) {
					delete_index = i;
					All_Clients[i] = null;
					System.out.println("Client deleted");
				}
			}
		}
		for (int i = delete_index; i < All_Clients.length - 1; i++)
			All_Clients[i] = All_Clients[i + 1];
	}

	public static void leaseVehicle(int index, String plate_number, Clients[] All_Clients, Vehicles[] All_Vehicles) {
		for (int i = 0; i < All_Vehicles.length; i++) {
			if (All_Vehicles[i].getPlate_Number().equals(plate_number) && All_Vehicles[i].getLeased() == false) {
				All_Clients[index].setVehicles(All_Vehicles[i]);
				All_Vehicles[i].setLeased(true);
				System.out.println("Vehicle leased");
				break;
			}
		}
	}
	public static void returnVehicle(int index, String plate_number, Clients[] All_Clients, Vehicles[] All_Vehicles)
	{

	}

	public static void getLargestTruck() 
	{
		

	}

	public static void copyVehicles() 
	{

	}


	public static void addVehicle(Scanner kb) {
		System.out.println("Select a vehicle type:");
		System.out.println("1. Electric Car");
		System.out.println("2. Gasoline Car");
		System.out.println("3. Diesel Truck");
		System.out.println("4. Electric Truck");

		int choice = kb.nextInt();

		System.out.println("Enter make:");
		String make = kb.nextLine();
		kb.nextLine();

		System.out.println("Enter model:");
		String model = kb.nextLine();
		kb.nextLine();

		System.out.println("Enter year of production:");
		int yop = kb.nextInt();
		kb.nextLine();

		switch (choice) {
			case 1:
				System.out.println("Enter the maximum number of passengers");
				int electricCarMaxPassengers = kb.nextInt();
				kb.nextLine();

				System.out.println("Enter the maximum autonomy range");
				int electricCarMaxAutonomyRange = kb.nextInt();
				kb.nextLine();

				Electric_Car newElectric_Car = new Electric_Car(make, model, yop, electricCarMaxPassengers, electricCarMaxAutonomyRange);
				break;
			case 2:
				System.out.println("Enter the maximum number of passengers");
				int gasolineCarMaxPassengers = kb.nextInt();

				Gasoline_Car newGasoline_Car = new Gasoline_Car(make, model, yop, gasolineCarMaxPassengers);
				break;
			case 3:
				System.out.println("Enter max weight capacity:");
				int dieselTruckWeight = kb.nextInt();

				System.out.println("Enter max fuel capacity:");
				int dieselTruckFuelCapacity = kb.nextInt();

				Diesel_Truck newDiesel_Truck = new Diesel_Truck(make, model, yop, dieselTruckWeight, dieselTruckFuelCapacity);
				break;
			case 4:
				System.out.println("Enter max weight capacity:");
				int electricTruckWeight = kb.nextInt();

				System.out.println("Enter max fuel capacity:");
				int electricTruckFuelCapacity = kb.nextInt();

				Electric_Truck newElectric_Truck = new Electric_Truck(make, model, yop, electricTruckWeight, electricTruckFuelCapacity);
				break;
			default:
				System.out.println("Invalid choice. Returning to main menu");
				break;

		}
	}

	public static void deleteVehicle(Scanner kb, Vehicles[] All_Vehicles) {
		System.out.println("Enter the plate number of the vehicle you wish to delete");
		String plate_number = kb.nextLine();

		int index = -1;

		for (int i = 0; i < vehicleCount; i++) {
			if (All_Vehicles[i].getPlate_Number().equals(plate_number)) {
				index = i;
				break;
			}

			// If vehicle is found, delete it
			if (index != -1) {
				System.out.println("Vehicle found: " + All_Vehicles[index]);
				System.out.println("Deleting vehicle...");

				// Shift remaining elements to fill the gap
				for (int j = index; j < vehicleCount - 1; j++) {
					All_Vehicles[j] = All_Vehicles[j + 1];
				}

				// Nullify the last element and update count
				All_Vehicles[vehicleCount - 1] = null;
				vehicleCount--;

				System.out.println("Vehicle deleted successfully.");
			} else {
				System.out.println("Vehicle with plate number " + plate_number + " not found.");
			}

		}

	}

	public static void updateVehicle(Scanner kb) {}
}