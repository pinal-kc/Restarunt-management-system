package com.ItalianZest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.ItalianZest.entity.Menu;
import com.ItalianZest.entity.Reservation;
import com.ItalianZest.service.MenuService;
import com.ItalianZest.service.ReservationService;


@Controller
@RequestMapping("/reservation")
public class ReservationController {

	// need to inject our customer service <% response.sendRedirect("dish/list"); %>
	@Autowired
	
	
	
	
	private ReservationService reservationService;
	// showing menu for admin
	@GetMapping("/list")
	public String showAdminMenu(Model theModel) {
		
		// get alldishes in the menu from the service
		List<Reservation> theDishes = reservationService.getAllReservation();
		
				
		// add the dish to the model
		theModel.addAttribute("reservations", theDishes );
		
		return "admintlReservation";
	}
	
	
	
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		
	
		Reservation newReservation = new Reservation();
		
		theModel.addAttribute("newReservation", newReservation);
		
		
		return "booktable";
	}
	
	
	
	@PostMapping("/saveReservation")
	public String saveDish(@Valid @ModelAttribute("newReservation") Reservation newReservation,BindingResult result) {
		
		
		
		// save the dish using our service
      
		if(result.hasErrors()) {
			return "booktable";
		}
		reservationService.saveReservation(newReservation);
		
		return "redirect:/";
	}
	
	

	
	@GetMapping("/delete")
	public String deleteReservation(@RequestParam("reservationID") int theId) {
		
		// delete the dish
		
		reservationService.deleteReservation(theId);
;		
		return "redirect:/reservation/list";
	}

	
	
	
	@RequestMapping("/index")
	public String homepage(Model theModel) {
		
		return "index";
	}
	
	
	
	
}










