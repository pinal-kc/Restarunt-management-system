package com.ItalianZest.service;

import java.util.List;


import com.ItalianZest.entity.Menu;
import com.ItalianZest.entity.Reservation;

public interface ReservationService {

	public List<Reservation> getAllReservation();

	public void saveReservation(Reservation theReservation);

	
	public void deleteReservation(int theId);
}
