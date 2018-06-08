package web.dao;

import web.dto.User;

public interface UserDao {

	//삽입
	public void insert(User user);
	
	//조회
	public User selectUser(User user);

}
