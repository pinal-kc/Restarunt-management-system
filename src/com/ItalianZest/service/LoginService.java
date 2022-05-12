package com.ItalianZest.service;

import java.util.List;

import com.ItalianZest.entity.Login;
import com.ItalianZest.entity.Menu;

public interface LoginService {

	public boolean isValidUser(String username, String password);
	
}
