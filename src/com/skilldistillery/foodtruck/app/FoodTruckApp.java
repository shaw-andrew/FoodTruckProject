package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private final int MAX_TRUCKS = 5;
	private FoodTruck[] trucks = new FoodTruck[MAX_TRUCKS];
	private int numTrucks = 0;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		FoodTruckApp foodTruckApp = new FoodTruckApp();

		FoodTruck foodTruck = null;

		for (int i = 0; i < 5; i++) {
			// Create new truck and add truckID and increment.
			foodTruck = new FoodTruck(0, null, null, 0);
			foodTruck.setCounter(i);
			foodTruck.setTruckId(foodTruck.getCounter());

			// Name the truck and add it to the array if user doesn't quit.
			System.out.println("Please provide the name of a food truck.");
			String input = kb.nextLine();
			if (input.equals("quit")) {
				break;
			}
			foodTruckApp.addTruck(foodTruck);

			// Define the type of food served at this truck.
			foodTruck.setTruckName(input);
			System.out.println("Please provide the type of food served at this truck.");
			foodTruck.setFoodType(kb.nextLine());

			// Set the rating of the truck.
			System.out.println("Please provide the rating of this truck on a 1 - 5 scale with 5 being the highest.");
			foodTruck.setRating(kb.nextDouble());
			// Entering a next line so the double doensn't kick over.
			kb.nextLine();
		}

		// Call the menu.
		foodTruckApp.displayMenu();

		while (true) {

			switch (kb.nextInt()) {

			case 1:

				// Display all trucks
				foodTruckApp.displayAllTrucks();
				break;

			case 2:
				// Display average truck rating.
				foodTruckApp.displayAverageRating();
				break;

			case 3:
				// Display highest rated truck.
				foodTruckApp.displayHighestRatedTruck();
				break;

			case 4:
				// Exit
				System.out.println("You chose to exit. Enjoy your food.");
				kb.close();
				System.exit(0);
				break;

			// Statement for invalid selection.
			default:
				System.out.println("Invalid selection, please select another option.");
			}

		}

	}

	public void addTruck(FoodTruck t) {
		trucks[numTrucks] = t;
		numTrucks++;
	}

	public FoodTruck[] getTrucks() {
		FoodTruck[] trucksCopy;
		trucksCopy = new FoodTruck[numTrucks];
		for (int i = 0; i < numTrucks; i++) {
			trucksCopy[i] = trucks[i];
		}
		return trucksCopy;
	}

	void displayMenu() {
		System.out.println(" ---------------------------------- ");
		System.out.println(" |             MENU               | ");
		System.out.println(" |                                | ");
		System.out.println(" | 1: List all trucks             | ");
		System.out.println(" | 2: Display average rating      | ");
		System.out.println(" | 3: Display highest rated Truck | ");
		System.out.println(" | 4: Quit                        | ");
		System.out.println(" |                                | ");
		System.out.println(" ---------------------------------- ");
	}

	public void displayAllTrucks() {
		for (FoodTruck truck : getTrucks()) {
			System.out.println(truck.toString());
		}
	}

	public void displayAverageRating() {
		FoodTruck[] trucksCopy = getTrucks();
		double avgRating = 0.0;
		for (FoodTruck truck : trucksCopy) {
			avgRating += truck.getRating();
		}
		System.out.println(avgRating / trucksCopy.length);
	}

	public void displayHighestRatedTruck() {
		FoodTruck[] trucksCopy1 = getTrucks();
		FoodTruck highestRatedTruck = null;
		for (FoodTruck truck : trucksCopy1) {
			if (highestRatedTruck == null) {
				highestRatedTruck = truck;
			}
			if (truck.getRating() > highestRatedTruck.getRating()) {
				highestRatedTruck = truck;
			}
		}
		if (highestRatedTruck == null) {
			System.out.println("There are no trucks to display.");
		} else {
			highestRatedTruck.displayTruck();
		}

	}

}
