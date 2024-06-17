package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shirt {
	
	@Id
	private int id;
	
	private String color;
	private String brand;
	private String size;
	
	public Shirt()
	{
		
	}
	
	public Shirt(int id, String color, String brand, String size)
	{
		this.id=id;
		this.color=color;
		this.brand=brand;
		this.size=size;
	}
	
	// Getter for id
		public int getId() {
			return id;
		}

		// Setter for id
		public void setId(int id) {
			this.id = id;
		}

		// Getter for color
		public String getColor() {
			return color;
		}

		// Setter for color
		public void setColor(String color) {
			this.color = color;
		}

		// Getter for brand
		public String getBrand() {
			return brand;
		}

		// Setter for brand
		public void setBrand(String brand) {
			this.brand = brand;
		}

		// Getter for size
		public String getSize() {
			return size;
		}

		// Setter for size
		public void setSize(String size) {
			this.size = size;
		}
}
