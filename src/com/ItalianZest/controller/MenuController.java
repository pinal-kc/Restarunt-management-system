package com.ItalianZest.controller;

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

import com.ItalianZest.service.MenuService;


@Controller
@RequestMapping("/dish")
public class MenuController {

	// need to inject our customer service <% response.sendRedirect("dish/list"); %>
	@Autowired
	private MenuService menuService;
	
	// showing menu for admin
	@GetMapping("/list")
	public String showAdminMenu(Model theModel) {
		
		// get alldishes in the menu from the service
		List<Menu> theDishes = menuService.getDishes();
		
				
		// add the dish to the model
		theModel.addAttribute("dishes", theDishes );
		
		return "admintlistmenu";
	}
	
	@GetMapping("/booktable")
      public String booktable(Model theModel) {
		
		
		
		return "booktable";
	}
	
	
	//showing menu for customer
	@GetMapping("/showmenuforcustomer")
	public String showCustomerMenu(Model theModel) {
		
		// get all Menu items in the menu from the service
		List<Menu> theDishes = menuService.getDishes();
		
				
		// add the dish to the model object
		theModel.addAttribute("dishes", theDishes );
		
		// send string of customerlistmenu to invoke customerlistmenu.jsp
		return "customerlistmenu";
	}
	
	@GetMapping("/showmenubycategory")
	public String showMenuByCategrory(@RequestParam("category") String thecategory,
			Model theModel) {
		
		// get alldishes in the menu from the service
		List<Menu> theDishes = menuService.getDishByCategory(thecategory);
		
				
		// add the dish to the model
		theModel.addAttribute("dishes", theDishes );
		
		return "redirect:/dish/showmenuforcustomer";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		
		Menu theMenu = new Menu();
		
		theModel.addAttribute("dish", theMenu);
		
		
		
		return "addDish";
	}
	
	@PostMapping("/saveDish")
	public String saveDish(@Valid @ModelAttribute("dish") Menu theDish,BindingResult result) {
		
		if(result.hasErrors()) {
			return "addDish";
		}
		// save the dish using our service
		menuService.saveDish(theDish);
		
		return "redirect:/dish/list";
	}
	
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("dishID") int theId,
									Model theModel) {
		
		// get the dish from our service
		
		Menu thedish = menuService.getDish(theId);
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("dish", thedish);
		
		// send over to our form		
		return "updateDish";
		
		
		
		
		
		
	}
	
	@GetMapping("/delete")
	public String deleteDish(@RequestParam("dishID") int theId) {
		
		// delete the dish
		
		menuService.deleteDish(theId);
;		
		return "redirect:/dish/list";
	}
	
	
	
	@GetMapping("/search")
	public String searchdish(@RequestParam("theSearchName") String theSearchName,
									Model theModel) {

		// search customers from the service
		List<Menu> thedish = menuService.getDishByCategory(theSearchName);
				
		// add the customers to the model
		theModel.addAttribute("theSearchName", thedish);

		return "customerlistmenu";		
	}
	
	
	@GetMapping("/aboutus") 
	public String abpitus() { 
		
		return "aboutus"; }
}










