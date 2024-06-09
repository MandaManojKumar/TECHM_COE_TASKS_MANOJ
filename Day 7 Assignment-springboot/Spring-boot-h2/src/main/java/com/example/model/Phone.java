package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String model;
	private String version;
	private double cost;
	
	public Phone()
	{
		
	}
	public Phone(int id)
	{
		this.id=id;
	}
	
	public Phone(String name, String model, String version, double cost)
	{
		this.name=name;
		this.model=model;
		this.version=version;
		this.cost=cost;
	}
	
	public Phone(int id, String name, String model, String version, double cost)
	{
		this.id=id;
		this.name=name;
		this.model=model;
		this.version=version;
		this.cost=cost;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setModel(String model)
	{
		this.model=model;
	}
	
	public void setVersion(String version)
	{
		this.version=version;
	}
	
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getModel()
	{
		return model;
	}
	public String getVersion()
	{
		return version;
	}
	public double getCost()
	{
		return cost;
	}
	public int getId()
	{
		return id;
	}
	
	@Override
	public String toString()
	{
		return "id" + id+ "name" +name+ " Model " +model + " Version " + version + " Cost " + cost;
	}

}
