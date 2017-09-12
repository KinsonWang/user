package org.lanqiao.service;

import org.lanqiao.entity.User;

public interface RegisterService {
	
	public int insertUser(User user);
	
	public User checkUser(String username);
}
