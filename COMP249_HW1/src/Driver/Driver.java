package Driver;

import java.util.Scanner;
import Client.*;
import Vehicle.*;

public class Driver {

	public static int vehicleCount = 0;
	public static final int MAX_SIZE = 100;
	public static Vehicles[] all_Vehicles = new Vehicles[MAX_SIZE];

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
		//Vehicles[] all_Vehicles = new Vehicles[10];
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
							System.out.println("Test add");
							addVehicle(kb);
							break;
						case 2:
							System.out.println("Test delete");
							deleteVehicle(kb);
							break;
						case 3:
							System.out.println("Test update");
							updateVehicle(kb);
							break;
						case 4:
							System.out.println("Test List");
							listAllVehicles(kb);
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



	public static void getLargestTruck() 
	{
		

	}

	public static void copyVehicles() 
	{

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


	public static void returnVehicle(int index, String plate_number, Clients[] All_Clients, Vehicles[] All_Vehicles){

	}



	public static void addVehicle(Scanner kb) {
		if(vehicleCount >= MAX_SIZE){
			System.out.println("Vehicle storage is full");
			return;
		}

		Vehicles newVehicles = null;

		System.out.println("Select a vehicle type:");
		System.out.println("1. Electric Car");
		System.out.println("2. Gasoline Car");
		System.out.println("3. Diesel Truck");
		System.out.println("4. Electric Truck");

		int choice = kb.nextInt();
		kb.nextLine();

		System.out.println("Enter make:");
		String make = kb.nextLine();

		System.out.println("Enter model:");
		String model = kb.nextLine();

		System.out.println("Enter year of production:");
		int yop = kb.nextInt();
		kb.nextLine();

		switch (choice){
			case 1:
				System.out.println("Enter the maximum number of passengers");
				int electricCarMaxPassengers = kb.nextInt();

				System.out.println("Enter the maximum autonomy range");
				int electricCarMaxAutonomyRange = kb.nextInt();

				newVehicles = new Electric_Car(make, model, yop, electricCarMaxPassengers, electricCarMaxAutonomyRange);
				break;
			case 2:
				System.out.println("Enter the maximum number of passengers");
				int gasolineCarMaxPassengers = kb.nextInt();

				newVehicles = new Gasoline_Car(make, model, yop, gasolineCarMaxPassengers);
				break;
			case 3:
				System.out.println("Enter max weight capacity:");
				int dieselTruckWeight = kb.nextInt();

				System.out.println("Enter max fuel capacity:");
				int dieselTruckFuelCapacity = kb.nextInt();
				kb.nextLine();

				newVehicles = new Diesel_Truck(make, model, yop, dieselTruckWeight, dieselTruckFuelCapacity);
				break;
			case 4:
				System.out.println("Enter max weight capacity:");
				int electricTruckWeight = kb.nextInt();

				System.out.println("Enter maximum autonomy range:");
				int electricTruckMaxAutonomyRange = kb.nextInt();
				kb.nextLine();

				newVehicles = new Electric_Truck(make, model, yop, electricTruckWeight, electricTruckMaxAutonomyRange);
				break;
			default:
				System.out.println("Invalid choice. Returning to main menu");
				return;

		}

		//Stores the Vehicle to the array
		if(newVehicles != null){
			all_Vehicles[vehicleCount] = newVehicles;
			vehicleCount++;
			System.out.println("Vehicle successfully added!");
		}

	}

	public static void deleteVehicle(Scanner kb) {
		System.out.println("Enter the plate number of the vehicle you wish to delete");
		String plate_number = kb.nextLine();

		int index = -1;

		for (int i = 0; i < vehicleCount; i++) {
			if (all_Vehicles[i].getPlate_Number().equals(plate_number)) {
				index = i;
				break;
			}

			// If vehicle is found, delete it
			if (index != -1) {
				System.out.println("Vehicle found: " + all_Vehicles[index]);
				System.out.println("Deleting vehicle...");

				// Shift remaining elements to fill the gap
				for (int j = index; j < vehicleCount - 1; j++) {
					all_Vehicles[j] = all_Vehicles[j + 1];
				}

				// Nullify the last element and update count
				all_Vehicles[vehicleCount - 1] = null;
				vehicleCount--;

				System.out.println("Vehicle deleted successfully.");
			} else {
				System.out.println("Vehicle with plate number " + plate_number + " not found.");
			}

		}

	}

	public static void updateVehicle(Scanner kb) {
		if(vehicleCount == 0){
			System.out.println("No vehicles in the system");
			return;
		}

		System.out.println("Enter the plate number of the vehicle that you would like to update");
		String plateNumber = kb.nextLine();

		Vehicles vehicleToUpdate = null;
		int index = -1;

		for(int i = 0; i < vehicleCount; i++){
			if(all_Vehicles[i].getPlate_Number().equals(plateNumber)){
				vehicleToUpdate = all_Vehicles[i];
				index = i;
				break;
			}
		}

		if(vehicleToUpdate == null){
			System.out.println("Vehicle with plate number " + plateNumber + " not found");
			return;
		}

		System.out.println("Vehicle found: "+ vehicleToUpdate);
		System.out.println("Select which attribute to update");
		System.out.println("\t (1) Make");
		System.out.println("\t (2) Model");
		System.out.println("\t (3) Year of Production");

		if(vehicleToUpdate instanceof Cars){
			System.out.println("\t (4) Max Passengers");
		} else if (vehicleToUpdate instanceof Truck){
			System.out.println("\t (4) Max Weight Capcity");
		}

		if(vehicleToUpdate instanceof Electric_Car || vehicleToUpdate instanceof Electric_Truck){
			System.out.println("\t (5) Max Autonomy Range");
		} else if (vehicleToUpdate instanceof Diesel_Truck){
			System.out.println("\t (5) Fuel Tank Capacity");
		}

		int choice = kb.nextInt();

		switch (choice) {
			case 1:
				System.out.println("Enter new make:");
				all_Vehicles[index].setMake(kb.nextLine());
				break;
			case 2:
				System.out.println("Enter new model:");
				all_Vehicles[index].setModel(kb.nextLine());
				break;
			case 3:
				System.out.println("Enter new year of production:");
				all_Vehicles[index].setYear_Of_Production(kb.nextInt());
				kb.nextLine();
				break;
			case 4:
				if(vehicleToUpdate instanceof Cars){
					System.out.println("Enter new maximum passengers");
					((Cars) all_Vehicles[index]).setMaxPassengers(kb.nextInt());
				} else if(vehicleToUpdate instanceof Truck){
					System.out.println("Enter new max weigh capacity:");
					((Truck) all_Vehicles[index]).setMaxWeightCapacity(kb.nextInt());
				}
				kb.nextLine();
				break;
			case 5:
				if(vehicleToUpdate instanceof Electric_Car){
					System.out.println("Enter new max autonomy range:");
					((Electric_Car) all_Vehicles[index]).setMax_Range(kb.nextInt());
				} else if(vehicleToUpdate instanceof Electric_Truck){
					System.out.println("Enter new max autonomy range:");
					((Electric_Truck) all_Vehicles[index]).setMaxAutonomyRange(kb.nextInt());
				} else if(vehicleToUpdate instanceof Diesel_Truck){
					System.out.println("Enter new max fuel capacity:");
					((Diesel_Truck) all_Vehicles[index]).setfuelCapacity(kb.nextDouble());
				}
				kb.nextLine();
				break;
			default:
				System.out.println("Not a valid input, returning to main menu");
				return;
		}

		System.out.println("Vehicle successfully updated");

	}

	public static void listAllVehicles(Scanner kb) {
		if(vehicleCount == 0){
			System.out.println("No Vehicles in the system");
			return;
		} 

		System.out.println("Electric Cars: ");
		for(int i = 0; i < vehicleCount; i++){
			if(all_Vehicles[i] instanceof Electric_Car){
				System.out.println(all_Vehicles[i]);
			}
		}

		System.out.println("Gasoline Cars: ");
		for(int i = 0; i < vehicleCount; i++){
			if(all_Vehicles[i] instanceof Gasoline_Car){
				System.out.println(all_Vehicles[i]);
			}
		}

		System.out.println("Electric Trucks: ");
		for(int i = 0; i < vehicleCount; i++){
			if(all_Vehicles[i] instanceof Electric_Truck){
				System.out.println(all_Vehicles[i]);
			}
		}

		System.out.println("Diesel Trucks: ");
		for(int i = 0; i < vehicleCount; i++){
			if(all_Vehicles[i] instanceof Diesel_Truck){
				System.out.println(all_Vehicles[i]);
			}
		}
	}


}