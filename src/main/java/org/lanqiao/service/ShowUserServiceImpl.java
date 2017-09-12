package org.lanqiao.service;

import java.util.List;

import org.lanqiao.dao.UserDao;
import org.lanqiao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowUserServiceImpl implements ShowUserService {
	@Autowired
	UserDao userDao;

	@Override
	public int getMaxPage(int pageSize) {
		int count = userDao.getCount();
		return count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
	}

	@Override
	public List<User> getList(int pageNum, int pageSize) {
		return userDao.getList(pageSize * (pageNum - 1), pageSize);
	}

}
