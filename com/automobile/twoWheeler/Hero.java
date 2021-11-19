package com.automobile.twoWheeler;
import com.automobile.Vehicle;
import java.util.Scanner;
public class Hero extends Vehicle
{
	String modelName, registrationNumber, ownerName;
	int speed;
	Hero(String modelName, String registrationNumber, String ownerName, int speed)
	{
		this.modelName=modelName;
		this.ownerName=ownerName;
		this.registrationNumber=registrationNumber;
		this.speed=speed;
	}
	public void getModelName()
	{
		System.out.println("modelNames: " + modelName);
	}
	public void getRegistrationNumber()
	{
		System.out.println("registrationNumber: " + registrationNumber);
	}
	public void getOwnerName()
	{
		System.out.println("ownerName: " + ownerName);
	}
	public int getSpeed()
	{
		return speed;
	}
	public void radio()
	{
		System.out.println("Accessing the radio");
	}
}
