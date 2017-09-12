package org.lanqiao.service;

import java.util.List;

import org.lanqiao.entity.User;

public interface ShowUserService {

	public int getMaxPage(int pageSize);
    
	public List<User> getList(int pageNum, int pageSize);
}
