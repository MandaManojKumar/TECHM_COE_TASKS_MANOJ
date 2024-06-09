package com.example.crud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String args[]) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
	
	UserDao dao=(UserDao)ctx.getBean("usao");
	int status=dao.saveUser(new User(107,"Sandeep","sandeep@gmail.com"));
	System.out.println("Row Inserted Successfully" +status);
  }
}