package day3;
import java.util.*;

public class SumOfNumbers {
	int SumOfEvenNumbers(int firstNumber, int secondNumber)
	{
		int i;
		int sum=0;
		for (i=firstNumber;i<=secondNumber;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		return sum; 
	}
	
	int SumOfOddNumbers( int firstNumber, int secondNumber)
	{
		int j;
		int sum=0;
		for (j=firstNumber;j<=secondNumber;j++)
		{
			if(j%2!=0)
			{
				sum=sum+j;
			}
		}
		return sum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumbers sn=new SumOfNumbers();
		int sumEven=sn.SumOfEvenNumbers(1,10);
		System.out.println("sum of even numbers is "+sumEven);
		int sumOdd=sn.SumOfOddNumbers(1,10);
		System.out.println("sum of odd numbers is "+sumOdd);
		

	}

}
