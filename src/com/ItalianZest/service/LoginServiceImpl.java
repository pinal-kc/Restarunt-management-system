package com.ItalianZest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ItalianZest.dao.LoginDAO;
import com.ItalianZest.dao.MenuDAO;
import com.ItalianZest.entity.Login;
import com.ItalianZest.entity.Menu;

@Service
public class LoginServiceImpl implements LoginService {

	// need to inject customer dao
	@Autowired
	private LoginDAO loginDAO;
	
	
	

	@Override
	@Transactional
	public boolean isValidUser(String username, String password) {
		// TODO Auto-generated method stub
		return loginDAO.isValidUser(username, password);
	}
}





