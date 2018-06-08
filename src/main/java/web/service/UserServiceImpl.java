package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired UserDao userDao;
	
	@Override
	public void insert(User user) {
		userDao.insert(user);
	}
	
	@Override
	public User selectUser(User user) {
		return userDao.selectUser(user);
	}
}
