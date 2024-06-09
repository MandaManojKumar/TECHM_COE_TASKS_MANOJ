package com.example.manokmockito;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.example.manokmockito.*;

public class RunnerTesting {
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(MathApplicationTester.class);
	      
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      
	      System.out.println(result.wasSuccessful());
	   }
}
