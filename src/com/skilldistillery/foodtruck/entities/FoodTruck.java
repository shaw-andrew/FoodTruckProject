package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private int truckId = 0;
	private String truckName = "";
	private String foodType = "";
	private double rating = 0.0;
	static int counter = 0;

	public FoodTruck(int truckId, String truckName, String foodType, double rating) {
		this.truckId = truckId;
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		FoodTruck.counter = counter;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String toString() {
		return "Truck ID: " + truckId + ", Truck Name: " + truckName + ", Food Type: " + foodType + ", rating: "
				+ rating;
	}

	public void displayTruck() {
		String truckData = toString();
		System.out.println(truckData);
	}

	// constructors
	// truck id static
	// setters and getters
	// tostring
	// singluar food truck stuff here
}
