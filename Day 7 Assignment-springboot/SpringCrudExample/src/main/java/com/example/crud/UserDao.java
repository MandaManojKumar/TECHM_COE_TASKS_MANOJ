package com.example.crud;


import org.springframework.jdbc.core.JdbcTemplate;
//DAO class means that it contains all the Curd operations
//These Curd operations can be done using JDBCTemplate

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
   //insert the row/s into the table.
	public int saveUser(User e){
		String query="insert into users values('"+e.getId()+"','"+e.getName()+"','"+e.getEmail()+"')";
		return jdbcTemplate.update(query);
	}
	//update a row/s into the table.
	public int updateUser(User e){
		String query="update users set name='"+e.getName()+"',Email='"+e.getEmail()+"' where id='"+e.getId()+"' ";
		return jdbcTemplate.update(query);
	}
	//deletion of row/s into the table
	public int deleteUser(User e){
		String query="delete from users where id='"+e.getId()+"' ";
		return jdbcTemplate.update(query);
	}
}