package com.ItalianZest.JUnitDAO;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ItalianZest.dao.MenuDAO;
import com.ItalianZest.entity.Menu;
import com.ItalianZest.service.MenuService;




 class TestMenuDAO {

	
	@Autowired
	private MenuService service;

	
	
	@Test
	public void testGetDishName() {
		
		assertEquals("Bruschetta", service.getDish(1).getDishName());
		
	}

	@Test
	public void testGetDishID() {
		
		assertEquals(1, service.getDish(1));
		
	}
	
	
		 
	}
	
