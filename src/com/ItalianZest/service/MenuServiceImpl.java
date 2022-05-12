package com.ItalianZest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.ItalianZest.dao.MenuDAO;
import com.ItalianZest.dao.MenuDAOImpl;
import com.ItalianZest.entity.Menu;

@Service
public class MenuServiceImpl implements MenuService {

	// need to inject customer dao
	@Autowired
	private MenuDAO menuDAO;
	
	
	@Override
	@Transactional
	public List<Menu> getDishes() {
		// get All MenuItems form menu
		return menuDAO.getDishes();
	}

	@Override
	@Transactional
	public void saveDish(Menu theDish) {
		
		menuDAO.saveDishes(theDish);
	}

	@Override
	@Transactional
	public Menu getDish(int thedishId) {
		
		return menuDAO.getDish(thedishId);
	}

	@Override
	@Transactional
	public void deleteDish(int thedishId) {
		menuDAO.deleteDish(thedishId);
		
	}

	@Override
	@Transactional
	public List<Menu> getDishByCategory(String category) {
		// TODO Auto-generated method stub
		return menuDAO.getDishByCategory(category);
	}
	@Override
	@Transactional
	public List<Menu> searchCustomers(String theSearchName){
		return menuDAO.searchDishes(theSearchName);
	}
}





