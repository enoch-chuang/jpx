package com.chuang;

public class Truck implements Vehicle {

	private int doors;
	private int clearance;
	
	public Truck(int doors) {
		this.doors = doors;
	}
	
	public void start() {
		System.out.println("The engine is starting...");
	}
	
	public void stop() {
		System.out.println("The engine is stopping...");
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getClearance() {
		return clearance;
	}

	public void setClearance(int clearance) {
		this.clearance = clearance;
	}
	
}