package com.example.SpringCommandLine.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyInputRunner implements CommandLineRunner {
	public void run(String...args)throws Exception {
		System.out.println("Hello command line runner");
		System.out.println(args[1]);
		System.out.println(Arrays.asList(args));
		System.out.println("End of CommandLine runner");
		
	}

}

