package com.colin.controller.service;

import java.util.List;

import com.colin.controller.dao.IUserDAO;
import com.colin.controller.entity.User;

/**
 * 
 * @author Colin
 * @date 2015年5月12日下午3:39:17
 */
public class UserManager implements IUserManager{
	private  IUserDAO userDao;
	
	
	
	public IUserDAO getUserDao() {
		return userDao;
	}
	public void setUserDao(IUserDAO userDao) {
		this.userDao = userDao;
	}
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.addUser(user);
	}
	public boolean delUser(String id) {
		// TODO Auto-generated method stub
		return userDao.delUser(id);
	}
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}
}
