package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.User;

//we can also use component scan
@Repository  //this is used for database related class that is why we use repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveUser(User user)
	{
		String sql="insert into user(name,email,password,image) values(?,?,?,?)";
		
		int i=jdbcTemplate.update(sql,user.getFullname(),user.getemail(),user.getPassword(),user.getImage());
		
		return i;
		
		
	}
}
