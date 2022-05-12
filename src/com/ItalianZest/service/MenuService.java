package com.ItalianZest.service;

import java.util.List;


import com.ItalianZest.entity.Menu;

public interface MenuService {

	public List<Menu> getDishes();

	public void saveDish(Menu theDish);

	public Menu getDish(int thedishId);

	public void deleteDish(int thedishId);
	
	public List<Menu> getDishByCategory(String category);
	
	public List<Menu> searchCustomers(String theSearchName);
	
}
