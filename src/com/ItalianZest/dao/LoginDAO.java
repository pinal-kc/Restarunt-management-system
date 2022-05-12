package com.ItalianZest.dao;

import com.ItalianZest.entity.Login;

public interface LoginDAO {
	
	public boolean isValidUser(String username, String password);

}
