package com.ItalianZest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ItalianZest.entity.Menu;
import com.ItalianZest.entity.Reservation;

@Repository
public class ReservationDAOImpl implements ReservationDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			

	@Override
	public List<Reservation> getAllReservation() {

		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// create a query  .
				Query<Reservation> theQuery = 
						currentSession.createQuery("from Reservation order by ReservationDate",
													Reservation.class);
				
				// execute query and get result list
				List<Reservation> reservations = theQuery.getResultList();
			
						
				// return the results		
				return reservations;
		// TODO Auto-generated method stub
	}

	@Override
	public void saveReservation(Reservation thereservation) {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the Dishes ... 
		currentSession.saveOrUpdate(thereservation);
	}
	
	
	@Override
	public void deleteReservation(int theId){
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// delete object with primary key
				
				Query theQuery = 
						currentSession.createQuery("delete from Reservation where ReservationID=:reservationID");
				theQuery.setParameter("reservationID", theId);
				
				theQuery.executeUpdate();		
		
	}

}











