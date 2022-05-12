package com.ItalianZest.dao;

import java.util.List;


import com.ItalianZest.entity.Menu;

public interface MenuDAO {

	public List<Menu> getDishes();

	public void saveDishes(Menu thedish);

	public Menu getDish(int theDishId);

	public void deleteDish(int theDishId);
	
	public List<Menu> getDishByCategory(String category);
	public List<Menu> searchDishes(String theSearchName);
	
}
