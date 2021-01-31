package com.bank.service;

import com.bank.dao.UserDAO;
import com.bank.model.User;

public interface UserService {
	//User Data Access Object where we keep password hidden from 
	
	UserDAO getUserDAO(User user);
	
	UserDAO getUserDAOByName(String userName);

}
