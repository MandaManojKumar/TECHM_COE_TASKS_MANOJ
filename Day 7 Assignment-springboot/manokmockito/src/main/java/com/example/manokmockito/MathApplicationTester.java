package com.example.manokmockito;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.example.manokmockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
	   @InjectMocks 
	   ManojApplication mathApplication = new ManojApplication();

	   @Mock
	   ManojCalculatorService calcService;

	   @Test
	   public void testAdd(){

	      when(calcService.add(10.0,20.0)).thenReturn(40.00);
	  
	      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	   }
}

