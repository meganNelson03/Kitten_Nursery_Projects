package com.project.kitten;


public class Kitten {
	private String name;
	private String intakeDate;
	private String animalID;
	private String addressFound;
	private String attributes;
	private String transferFrom;
	
	public Kitten() {
		
	}
	
	// Kitten object
	public Kitten(String name, String addressFound) {
		super();
		this.name = name;
		this.intakeDate = intakeDate;
		this.animalID = animalID;
		this.addressFound = addressFound;
		this.attributes = attributes;
		this.transferFrom = transferFrom;
	}
	
	//getters and setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIntakeDate() {
		return intakeDate;
	}
	
	public void setIntakeDate(String intakeDate) {
		this.intakeDate = intakeDate;
	}
	
	public String getAnimalID() {
		return animalID;
	}
	
	public void setAnimalID(String animalID) {
		this.animalID = animalID;
	}
	
	public String getAddress() {
		return addressFound;
	}
	
	public void setAddress(String addressFound) {
		this.addressFound = addressFound;
		
	}
	
	public String getAttributes() {
		return attributes;
	}
	
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	
	public String getTransfer() {
		return transferFrom;
	}
	
	public void setTransfer(String transferFrom) {
		this.transferFrom = transferFrom;
	}
	
	
	
	
}
