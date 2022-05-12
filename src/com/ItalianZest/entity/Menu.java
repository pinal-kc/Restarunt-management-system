package com.ItalianZest.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="menu")
public class Menu {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DishID")
	
	private int dishID;
	
	 @NotBlank(message = "Dishname is required")
	@Column(name="DishName")
	private String dishName;
	
	 @NotBlank(message = "Description is required")
	@Column(name="Description")
	private String description;
	
	 @NotBlank(message = "Category is required")
	@Column(name="Category")
	private String category;
	
	 @NotNull(message = "Please enter price")
	@Column(name="Price")
	private float price;
	
	public Menu() {
		
	}

	public int getDishID() {
		return dishID;
	}

	

	public void setDishID(int dishID) {
		this.dishID = dishID;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [dishID=" + dishID + ", dishName=" + dishName + ", description=" + description + ", category="
				+ category + ", price=" + price + "]";
	}

	
	
		
}





