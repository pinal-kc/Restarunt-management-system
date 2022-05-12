package com.ItalianZest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.ItalianZest.dao.MenuDAO;
import com.ItalianZest.dao.ReservationDAO;
import com.ItalianZest.entity.Menu;
import com.ItalianZest.entity.Reservation;

@Service
public class ReservationServiceImpl implements ReservationService {

	// need to inject customer dao
	@Autowired
	private ReservationDAO reservationDAO;

	@Override
	@Transactional
	public List<Reservation> getAllReservation(){
		// TODO Auto-generated method stub
		return reservationDAO.getAllReservation();
	}

	@Override
	@Transactional
	public void saveReservation(Reservation theReservation) {
		// TODO Auto-generated method stub
		reservationDAO.saveReservation(theReservation);
	}
	
	@Override
	@Transactional
	public void deleteReservation(int theId) {
		reservationDAO.deleteReservation(theId);
		
	}
	
}





