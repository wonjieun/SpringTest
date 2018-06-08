package web.service;

import web.dto.User;

public interface UserService {
	
	public void insert(User user);
	
	public User selectUser(User user);
	
}
