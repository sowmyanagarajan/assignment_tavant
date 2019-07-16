package temp;

import java.util.*;

public class Temperature {
	public double convertToFarenheit(double celsius)
	{
		double res=((celsius*9)/5)+32;
		return res;
	}
	public double convertToCelsius(double faren)
	{
		double ress=(faren-32)/1.8;
		return ress;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cel=90;
		Temperature tem=new Temperature();
		double res1,res2;
		double far=103;
		res1=tem.convertToFarenheit(cel);
		res2=tem.convertToCelsius(far);
		System.out.println("celsius to farenheit"+res1);
		System.out.println("farenheit to celsius"+res2);

	}

}
