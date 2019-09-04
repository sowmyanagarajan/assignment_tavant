package temp;

import java.util.*;

public class Temperature {
	public double convertToFarenheit(double celsius)
	{
		double result=((celsius*9)/5)+32;
		return result;
	}
	public double convertToCelsius(double faren)
	{
		double result=(faren-32)/1.8;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius=90;
		Temperature tem=new Temperature();
		double resultCelsius,resultFarenheit;
		double farenheit=103;
		resultCelsius=tem.convertToFarenheit(celsius);
		resultFarenheit=tem.convertToCelsius(farenheit);
		System.out.println("celsius to farenheit"+resultCelsius);
		System.out.println("farenheit to celsius"+resultFarenheit);

	}

}
