package com.example.manokmockito;
import com.example.manokmockito.ManojCalculatorService;

public class ManojApplication {
	private ManojCalculatorService calcService;

	   public void setCalculatorService(ManojCalculatorService calcService){
	      this.calcService = calcService;
	   }
	   
	   public double add(double input1, double input2){
	      return calcService.add(input1, input2);
	   }
	   
	   public double subtract(double input1, double input2){
	      return calcService.subtract(input1, input2);
	   }
	   
	   public double multiply(double input1, double input2){
	      return calcService.multiply(input1, input2);
	   }
	   
	   public double divide(double input1, double input2){
	      return calcService.divide(input1, input2);
	   }


}
