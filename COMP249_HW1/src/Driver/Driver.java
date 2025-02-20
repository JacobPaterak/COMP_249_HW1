package Driver;
import java.util.Scanner;

import Vehicle.*;
import Client.*;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
		//Electric_Truck
		
		
		
		
		do {
			System.out.println("Welcome to RoyalRentals, Please choose one of the following options:");
			System.out.println("\t (1) Vehicle Management");
			System.out.println("\t (2) Client Management");
			System.out.println("\t (3) Leasing Operations");
			System.out.println("\t (4) Additional Operations");
			System.out.println("\t (5) Quit");

			choice = scanner.nextInt();

			switch(choice){
				case 1: 
					System.out.println("(1) Add a vehicle");
					System.out.println("(2) Delete a vehicle");
					System.out.println("(3) Update a vehicle information");
					System.out.println("(4) List all vehicles by category");
					System.out.println("(5) Exit");

				Choice2 = scanner.nextInt();

				switch(Choice2){ //Vehicle Management
					case 1: 
					case 2:
					case 3:
					case 4:
					case 5:
						return;
				}


				case 2:
					System.out.println("(1) Add a client");
					System.out.println("(2) Edit a client");
					System.out.println("(3) Delete a client");
					System.out.println("(4) Exit");

					Choice2 = scanner.nextInt();

					switch(Choice2){ // Client Management
						case 1:
						//	CLients josh = new CLients();
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

					switch(Choice2){
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

					switch(Choice2){
						case 1:
						case 2:
						case 3:
						return;
					}
			}
		} while(choice!=5);

		if(choice == 5){
			System.out.println("Thank you for using RoyalRentals");
			System.exit(0);
		}
		
		
		
	}






	public static void getLargestTruck(){
		
	}

	public static void copyVehicles(){
		
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
