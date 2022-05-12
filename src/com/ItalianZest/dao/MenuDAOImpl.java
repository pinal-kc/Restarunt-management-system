package com.ItalianZest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ItalianZest.entity.Menu;


@Repository
public class MenuDAOImpl implements MenuDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	
// Get All menu item from Restarunt menu
	@Override
	public List<Menu> getDishes() {
		
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
						
		// create query to fetch data from database.
		Query<Menu> theQuery = currentSession.createQuery("from Menu order by category",Menu.class);
				
		// execute query and get result list
		List<Menu> dishes = theQuery.getResultList();
			
						
		// return the results		
		return dishes;
				
	}

	@Override
	public void saveDishes(Menu thedish) {
		
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// save/upate the Dishes ... 
				currentSession.saveOrUpdate(thedish);
	}

	@Override
	public Menu getDish(int theDishId) {
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// now retrieve/read from database using the primary key
				Menu theDish = currentSession.get(Menu.class, theDishId);
				
				return theDish;
	}

	@Override
	public void deleteDish(int theDishId) {
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// delete object with primary key
				
				Query theQuery = 
						currentSession.createQuery("delete from Menu where DishID=:dishId");
				theQuery.setParameter("dishId", theDishId);
				
				theQuery.executeUpdate();		
		
	}

	@Override
	public List<Menu> getDishByCategory(String category) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<Menu> theQuery = 
				currentSession.createQuery("from Menu where category =:category",
											Menu.class);
		theQuery.setParameter("category", category);
		// execute query and get result list
		List<Menu> dishes = theQuery.getResultList();
	
				
		// return the results		
		return dishes;
	}
	
	
	@Override
	public List<Menu> searchDishes(String theSearchName) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = null;
		
		//
		// only search by name if theSearchName is not empty
		//
		if (theSearchName != null && theSearchName.trim().length() > 0) {

			// search for firstName or lastName ... case insensitive
			theQuery =currentSession.createQuery("from Menu where lower(category) like :theName ", Menu.class);
			theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");

		}
		else {
			// theSearchName is empty ... so just get all customers
			theQuery =currentSession.createQuery("from Menu", Menu.class);			
		}
		
		// execute query and get result list
		List<Menu> dishes = theQuery.getResultList();
				
		// return the results		
		return dishes;
		
	}

}











