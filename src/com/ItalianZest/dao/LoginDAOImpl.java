package com.ItalianZest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ItalianZest.entity.Login;
import com.ItalianZest.entity.Menu;

@Repository
public class LoginDAOImpl implements LoginDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	

	
	@Override
	public boolean isValidUser(String username, String password) {
		
		 Session currentSession = sessionFactory.getCurrentSession();
         
	        
			
			// create a query  ... sort by last name
		 Query<Login> theQuery = 
					currentSession.createQuery("Select * from Login where UserName=:username and Password=:password",
												Login.class);
			
			
			theQuery.setParameter("username", username);
			theQuery.setParameter("password", password);
			
			// execute query and get result list
			List<Login>  user= theQuery.getResultList(); 
			
		
			 if(user.size()>0)
		            return true;
		        else
		           return false;
	}

}











