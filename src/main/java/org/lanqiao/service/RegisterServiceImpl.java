package org.lanqiao.service;

import org.lanqiao.dao.UserDao;
import org.lanqiao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	UserDao userDao;

	@Override
	public int insertUser(User user) {
		return userDao.insertSelective(user);
	}

	@Override
	public User checkUser(String username) {
		return userDao.checkUser(username);
	}

}
