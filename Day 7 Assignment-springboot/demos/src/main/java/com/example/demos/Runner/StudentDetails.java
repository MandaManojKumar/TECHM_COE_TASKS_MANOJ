package com.example.demos.Runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentDetails implements CommandLineRunner{
	
	@Value(value = "${my.info.Student.id}")
	private int id;
	
	@Value(value = "${my.info.Student.name}")
	private String name;
	
	@Value(value = "${my.info.Student.year}")
	private int year;
	
	@Value(value = "${my.info.Student.branch}")
	private String branch;
	
	@Override
	public String toString()
	{
		return id+ " " +name +" "+ year +" "+branch;
	}

	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);	}
	

}