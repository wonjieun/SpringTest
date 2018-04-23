package web.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public interface PersonDao {
	
	public List selectAll();
}
