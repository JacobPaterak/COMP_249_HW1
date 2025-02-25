package Driver;

import java.util.Scanner;
import Client.*;
import Vehicle.*;

public class Driver {

	// Static variables to keep track of vehicle count and maximum size
	public static int vehicleCount = 0;
	public static final int MAX_SIZE = 100;
	public static Vehicles[] all_Vehicles = new Vehicles[MAX_SIZE];




	public static void main(String[] args) {
		//Creating scanner
		Scanner kb = new Scanner(System.in);
		//initializing variables and arrays
		int choice = 0;
		int choice2;
		Clients[] All_Clients = new Clients[100];
		String name;
		String Changes_Name;
		int counter = 0;
		int index = 0;

		//Predefined Scenario
		//Creating arrays
		Gasoline_Car[] g1 = new Gasoline_Car[10];
		Electric_Car[] e1 = new Electric_Car[10];
		Diesel_Truck[] d1 = new Diesel_Truck[10];
		Electric_Truck[] t1 = new Electric_Truck[10];
		//Creating 3 objects of each type
		g1[0] = new Gasoline_Car("Honda", "Civic", 2015, 10);
		g1[1] = new Gasoline_Car("Toyota", "Corolla", 2015, 10);
		g1[2] = new Gasoline_Car("Ford", "Mustang", 2015, 10);
		e1[0] = new Electric_Car("Honda", "Civic", 2015, 10, 100);
		e1[1] = new Electric_Car("Toyota", "Corolla", 2015, 10, 100);
		e1[2] = new Electric_Car("Ford", "Mustang", 2015, 10, 100);
		d1[0] = new Diesel_Truck("Mack", "Anthem", 2018, 5000, 300);
		d1[1] = new Diesel_Truck("Peterbilt", "579", 2020, 6000, 350);
		d1[2] = new Diesel_Truck("Kenworth", "T680", 2021, 5500, 320);
		t1[0] = new Electric_Truck("Tesla", "Semi", 2023, 8000, 500);
		t1[1] = new Electric_Truck("Freightliner", "eCascadia", 2022, 7500, 400);
		t1[2] = new Electric_Truck("Volvo", "VNR Electric", 2021, 7000, 350);


		//Welcome method
		System.out.println("Welcome to Royal Rentals");
		//Asks if user wants menu or scenario
		System.out.println("Would you like to use (1) Menu or (2) Predefined Scenario? ");
		int scenario = kb.nextInt();
		if(scenario == 1) {
			do {

				// Display main menu options
				System.out.println("Please choose an option");
				System.out.println("\t (1) Vehicle Management");
				System.out.println("\t (2) Client Management");
				System.out.println("\t (3) Leasing Operations");
				System.out.println("\t (4) Additional Operations");
				System.out.println("\t (5) Quit");
				choice = kb.nextInt();
				kb.nextLine();

				switch (choice) {
					case 1:
						// Vehicle Management menu
						System.out.println("(1) Add a vehicle");
						System.out.println("(2) Delete a vehicle");
						System.out.println("(3) Update a vehicle information");
						System.out.println("(4) List all vehicles by category");
						System.out.println("(5) Exit");
						choice2 = kb.nextInt();
						kb.nextLine();

						switch (choice2) {
							case 1:
								//System.out.println("Test add");
								addVehicle(kb);
								break;
							case 2:
								//System.out.println("Test delete");
								deleteVehicle(kb);
								break;
							case 3:
								//System.out.println("Test update");
								updateVehicle(kb);
								break;
							case 4:
								//System.out.println("Test List");
								listAllVehicles(kb);
								break;
							case 5:
								System.out.println("Returning to menu");
								break;
							default:
								System.out.println("Invalid choice. Please try again.");
								break;
						}
						break;
					case 2:
						// Client Management menu
						System.out.println("(1) Add a client");
						System.out.println("(2) Edit a client");
						System.out.println("(3) Delete a client");
						System.out.println("(4) Exit");
						choice2 = kb.nextInt();
						kb.nextLine();

						switch (choice2) {
							case 1:
								System.out.println("Please enter the client's name");
								name = kb.nextLine();
								addClient(name, All_Clients, counter);
								break;
							case 2:
								System.out.println("Please enter the client's name you wish to edit");
								name = kb.nextLine();
								System.out.println("Please enter the client's new name");
								Changes_Name = kb.nextLine();
								editClient(All_Clients, name, Changes_Name);
								break;
							case 3:
								System.out.println("Please enter the client's name you wish to delete");
								name = kb.nextLine();
								deleteClient(All_Clients, name);
								break;
							case 4:
								break;
							default:
								System.out.println("Invalid choice. Please try again.");
								break;
						}
						break;
					case 3:
						// Leasing Operations menu
						System.out.println("(1) Lease a vehicle to a client");
						System.out.println("(2) Return a vehicle from a client");
						System.out.println("(3) Show all vehicles leased by a client");
						System.out.println("(4) Show all leased vehicles");
						System.out.println("(5) Exit");
						choice2 = kb.nextInt();
						kb.nextLine();

						switch (choice2) {
							case 1:
								// Lease a vehicle to a client
								System.out.println("To which client are we adding a vehicle to? ");
								name = kb.nextLine();
								for (int i = 0; i < All_Clients.length; i++) {
									//checks if array is not null
									if (All_Clients[i] != null) {
										//makes sure there is a name that is equal
										if (All_Clients[i].getName().equals(name)) {
											for (int j = 0; j < All_Clients.length; j++) {
												if (All_Clients[j] != null) {
													if (All_Clients[j].getName().equals(name))
														index = j;
													System.out.print("Enter the plate number of the vehicle you wish to lease ");
													String plate_number = kb.nextLine();
													leaseVehicle(index, plate_number, All_Clients, all_Vehicles);
												}
											}
										}
									} else {
										System.out.println("Client not found");
									}
								}
								break;
							case 2:
								// Return a vehicle from a client
								System.out.println("To which client are we removing a vehicle from? ");
								name = kb.nextLine();
								for (int i = 0; i < All_Clients.length; i++) {
									if (All_Clients[i] != null) {
										if (All_Clients[i].getName().equals(name)) {
											for (int j = 0; j < All_Clients.length; j++) {
												if (All_Clients[j] != null) {
													if (All_Clients[j].getName().equals(name))
														index = j;
													System.out.print("Enter the plate number of the vehicle you wish to return ");
													String plate_number = kb.nextLine();
													returnVehicle(index, plate_number, All_Clients, all_Vehicles);
												}
											}
										}
									}
								}
								break;
							case 3:
								// Show all vehicles leased by a client
								System.out.println("Which client would you like to see the vehicles leased by? ");
								name = kb.next();
								for (int i = 0; i < All_Clients.length; i++) {
									if (All_Clients[i] != null) {
										if (All_Clients[i].getName().equals(name)) {
											for (int j = 0; j < All_Clients.length; j++) {
												if (All_Clients[j] != null) {
													if (All_Clients[j].getName().equals(name))
														index = j;
													allLeasedVehicles(All_Clients, index);
												}
											}
										}
									}
								}
								break;
							case 4:
								// Show all leased vehicles
								displayVehicles();
								break;
							default:
								System.out.println("Invalid choice. Please try again.");
								break;
						}
						break;
					case 4:
						// Additional Operations menu
						System.out.println("(1) Display the truck with the largest capacity");
						System.out.println("(2) Create a copy of the electric trucks array");
						System.out.println("(3) Exit");
						choice2 = kb.nextInt();
						kb.nextLine();

						switch (choice2) {
							case 1:
								// Display the truck with the largest capacity
								Diesel_Truck largestTruck = getLargestTruck(all_Vehicles);
								if (largestTruck != null) {
									System.out.println("The truck with the largest capacity is: " + largestTruck);
								}
								break;
							case 2:
								// Create a copy of the electric trucks array
								copyVehicles(t1);
								break;
							default:
								System.out.println("Invalid choice. Please try again.");
								break;
						}
						break;
					default:
						System.out.println("Invalid choice. Please try again.");
						break;
				}

				{


				}

			} while (choice != 5);
		}
		//to string of predefines scenario
		for (int i = 0; i < 3; i++) {
			System.out.println(g1[i].toString());
			System.out.println(e1[i].toString());
			System.out.println(d1[i].toString());
			System.out.println(t1[i].toString());
		}
			System.out.println("Gasoline_Car vs Electric_Car: " + g1[0].equals(e1[0]));
			System.out.println("Diesel_Truck vs Electric_Car: " + d1[0].equals(e1[0]));

			System.out.println("Gasoline_Car g1[0] vs g1[1]: " + g1[0].equals(g1[1]));
			System.out.println("Diesel_Truck d1[0] vs d1[1]: " + d1[0].equals(d1[1]));


			Gasoline_Car tempGasolineCar = new Gasoline_Car("Honda", "Civic", 2015, 10);
			Diesel_Truck tempDieselTruck = new Diesel_Truck("Kenworth", "T680", 2021, 5500, 320);
			System.out.println("Gasoline_Car g1[0] vs tempGasolineCar: " + g1[0].equals(tempGasolineCar));
			System.out.println("Diesel_Truck d2[0] vs tempDieselTruck: " + d1[2].equals(tempDieselTruck));
			System.out.println(getLargestTruck(d1));
			copyVehicles(t1);



		if (choice == 5) {
			System.out.println("Thank you for using RoyalRentals");
		}


	}


	// Method to get the largest truck by capacity
	public static Diesel_Truck getLargestTruck(Vehicles[] all_Vehicles) {
		if (vehicleCount == 0) {
			System.out.println("No Vehicles in the system");
			return null;
		}

		Diesel_Truck largestTruck = null;

		for (int i = 0; i < vehicleCount; i++) {
			if (all_Vehicles[i] instanceof Diesel_Truck) {
				Diesel_Truck truck = (Diesel_Truck) all_Vehicles[i];
				if (largestTruck == null || truck.getMaxWeightCapacity() > largestTruck.getMaxWeightCapacity()) {
					largestTruck = truck;
				}
			}
		}

		return largestTruck;
	}

	// Method to copy vehicles
	public static Electric_Truck[] copyVehicles(Electric_Truck[] originalArray) {
		// Check if the array is null or empty
		if (originalArray == null) {
			return null;
		}
		// Create a new array with the same length as the original array
		Electric_Truck[] copiedArray = new Electric_Truck[originalArray.length];

		// Iterate through the original array to create copies of each object
		for (int i = 0; i < originalArray.length; i++) {
			if (originalArray[i] != null) {
				// Create a deep copy of each Electric_Truck object
				copiedArray[i] = new Electric_Truck(originalArray[i].getMake(), originalArray[i].getModel(), originalArray[i].getYear_of_Production(), originalArray[i].getMaxWeightCapacity(), originalArray[i].getMaxAutonomyRange());
			}
			else {
				copiedArray[i] = null;
			}
		}
		//Returned copied array
		return copiedArray;
	}


	// Method to add a client
	public static void addClient(String name, Clients[] All_Clients, int counter) {
		All_Clients[counter] = new Clients(name);
		counter++;
		System.out.println("Client added");
	}

	// Method to edit a client's name
	public static void editClient(Clients[] All_Clients, String name, String Changes_Name) {
		for (int i = 0; i < All_Clients.length; i++)
			if (All_Clients[i] != null) {
				if (All_Clients[i].getName().equals(Changes_Name))
					All_Clients[i].setName(name);
			}
	}

	// Method to delete a client
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

	// Method to lease a vehicle to a client
	public static void leaseVehicle(int index, String plate_number, Clients[] All_Clients, Vehicles[] All_Vehicles) {
		for (int i = 0; i < All_Vehicles.length; i++) {
			if (All_Vehicles[i] != null) {
				if (All_Vehicles[i].getPlate_Number().equals(plate_number) && !All_Vehicles[i].getLeased()) {
					All_Clients[index].setVehicles(All_Vehicles[i]);
					All_Vehicles[i].setLeased(true);
					System.out.println("Vehicle leased");
					break;
				} else {
					System.out.println("Vehicle not found or already leased");
				}
			}
		}
	}

	// Method to return a leased vehicle from a client
	public static void returnVehicle(int index, String plate_number, Clients[] All_Clients, Vehicles[] All_Vehicles) {
		for (int i = 0; i < All_Vehicles.length; i++) {
			if (All_Vehicles[i] != null) {
				if (All_Vehicles[i].getPlate_Number().equals(plate_number) && All_Vehicles[i].getLeased()) {
					All_Clients[index].setVehicles(null);
					All_Vehicles[i].setLeased(false);
					System.out.println("Vehicle returned");
					break;
				} else {
					System.out.println("Vehicle not found or not leased");
				}
			}
		}
	}

	// Method to display all leased vehicles for a client
	public static void allLeasedVehicles(Clients[] All_Clients, int index) {
		System.out.println("All the leased vehicles for client " + All_Clients[index].getName() + " are: ");
		Vehicles[] leasedVehicles = All_Clients[index].getArray();
		for (int i = 0; i < leasedVehicles.length; i++) {
			if (leasedVehicles[i] != null)
				System.out.println(leasedVehicles[i].toString());
		}
	}

	// Method to display all leased vehicles
	public static void displayVehicles() {
		System.out.println("All the vehicles are: ");
		for (int i = 0; i < all_Vehicles.length; i++) {
			if (all_Vehicles[i] != null && all_Vehicles[i].getLeased()) {
				System.out.println(all_Vehicles[i].toString());
			}
		}
	}

	// Method to add a vehicle
	public static void addVehicle(Scanner kb) {
		if (vehicleCount >= MAX_SIZE) {
			System.out.println("Vehicle storage is full");
			return;
		}

		Vehicles newVehicles = null;

		System.out.println("Enter make:");
		String make = kb.nextLine();

		System.out.println("Enter model:");
		String model = kb.nextLine();

		System.out.println("Enter year of production:");
		int yop = kb.nextInt();
		kb.nextLine();

		System.out.println("Select a vehicle type:");
		System.out.println("1. Electric Car");
		System.out.println("2. Gasoline Car");
		System.out.println("3. Diesel Truck");
		System.out.println("4. Electric Truck");

		int addVehicleChoice = kb.nextInt();
		kb.nextLine();

		switch (addVehicleChoice) {
			case 1:
				//System.out.println("Entered Case 1: electric car");
				System.out.println("Enter the maximum number of passengers");
				int electricCarMaxPassengers = kb.nextInt();
				kb.nextLine();

				System.out.println("Enter the maximum autonomy range");
				int electricCarMaxAutonomyRange = kb.nextInt();
				kb.nextLine();

				newVehicles = new Electric_Car(make, model, yop, electricCarMaxPassengers, electricCarMaxAutonomyRange);
				break;
			case 2:
				//System.out.println("Entered Case 2: gas car");
				System.out.println("Enter the maximum number of passengers");
				int gasolineCarMaxPassengers = kb.nextInt();
				kb.nextLine();

				newVehicles = new Gasoline_Car(make, model, yop, gasolineCarMaxPassengers);
				break;
			case 3:
				//System.out.println("Entered Case 3: diesel truck");
				System.out.println("Enter max weight capacity:");
				int dieselTruckWeight = kb.nextInt();
				kb.nextLine();

				System.out.println("Enter max fuel capacity:");
				int dieselTruckFuelCapacity = kb.nextInt();
				kb.nextLine();

				newVehicles = new Diesel_Truck(make, model, yop, dieselTruckWeight, dieselTruckFuelCapacity);
				break;
			case 4:
				//System.out.println("Entered Case 4: electric truck");
				System.out.println("Enter max weight capacity:");
				int electricTruckWeight = kb.nextInt();
				kb.nextLine();

				System.out.println("Enter maximum autonomy range:");
				int electricTruckMaxAutonomyRange = kb.nextInt();
				kb.nextLine();

				newVehicles = new Electric_Truck(make, model, yop, electricTruckWeight, electricTruckMaxAutonomyRange);
				break;
			default:
				System.out.println("Invalid choice. Returning to main menu");
				break;
		}

		// Stores the Vehicle to the array
		if (newVehicles != null) {
			//System.out.println("DEBUG: Vehicle object created -> " + newVehicles);
			all_Vehicles[vehicleCount] = newVehicles;
			vehicleCount++;
			System.out.println("Vehicle successfully added!");
		} else {
			System.out.println("An error occured, new vehicle not added.");
		}
	}

	// Method to delete a vehicle
	public static void deleteVehicle(Scanner kb) {
		System.out.println("Enter the plate number of the vehicle you wish to delete");
		String plate_number = kb.nextLine();

		int index = -1;

		//Find the vehicle with a given plate number
		for (int i = 0; i < vehicleCount; i++) {
			if (all_Vehicles[i] != null && all_Vehicles[i].getPlate_Number().equals(plate_number)) {
				index = i;
				break;
			}
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

	// Method to update a vehicle's information
	public static void updateVehicle(Scanner kb) {
		if (vehicleCount == 0) {
			System.out.println("No vehicles in the system");
			return;
		}

		System.out.println("Enter the plate number of the vehicle that you would like to update");
		String plateNumber = kb.nextLine();

		Vehicles vehicleToUpdate = null;
		int index = -1;

		for (int i = 0; i < vehicleCount; i++) {
			if (all_Vehicles[i].getPlate_Number().equals(plateNumber)) {
				vehicleToUpdate = all_Vehicles[i];
				index = i;
				break;
			}
		}

		if (vehicleToUpdate == null) {
			System.out.println("Vehicle with plate number " + plateNumber + " not found");
			return;
		}

		System.out.println("Vehicle found: " + vehicleToUpdate);
		System.out.println("Select which attribute to update");
		System.out.println("\t (1) Make");
		System.out.println("\t (2) Model");
		System.out.println("\t (3) Year of Production");

		if (vehicleToUpdate instanceof Cars) {
			System.out.println("\t (4) Max Passengers");
		} else if (vehicleToUpdate instanceof Truck) {
			System.out.println("\t (4) Max Weight Capacity");
		}

		if (vehicleToUpdate instanceof Electric_Car || vehicleToUpdate instanceof Electric_Truck) {
			System.out.println("\t (5) Max Autonomy Range");
		} else if (vehicleToUpdate instanceof Diesel_Truck) {
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
				if (vehicleToUpdate instanceof Cars) {
					System.out.println("Enter new maximum passengers");
					((Cars) all_Vehicles[index]).setMaxPassengers(kb.nextInt());
				} else if (vehicleToUpdate instanceof Truck) {
					System.out.println("Enter new max weight capacity:");
					((Truck) all_Vehicles[index]).setMaxWeightCapacity(kb.nextInt());
				}
				kb.nextLine();
				break;
			case 5:
				if (vehicleToUpdate instanceof Electric_Car) {
					System.out.println("Enter new max autonomy range:");
					((Electric_Car) all_Vehicles[index]).setMax_Range(kb.nextInt());
				} else if (vehicleToUpdate instanceof Electric_Truck) {
					System.out.println("Enter new max autonomy range:");
					((Electric_Truck) all_Vehicles[index]).setMaxAutonomyRange(kb.nextInt());
				} else if (vehicleToUpdate instanceof Diesel_Truck) {
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