package com.ItalianZest.dao;

import java.util.List;


import com.ItalianZest.entity.Menu;
import com.ItalianZest.entity.Reservation;

public interface ReservationDAO {

	public List<Reservation> getAllReservation();

	public void saveReservation(Reservation thereservation);

	public void deleteReservation(int theId);
	
}
