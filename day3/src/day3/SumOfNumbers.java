package day3;
import java.util.*;

public class SumOfNumbers {
	int sumOfEvenNumbers(int start, int end)
	{
		int i;
		int sum=0;
		for (i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		return sum; 
	}
	
	int sumOfOddNumbers( int start, int end)
	{
		int j;
		int sum=0;
		for (j=start;j<=end;j++)
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
		int sumeven=sn.sumOfEvenNumbers(1,10);
		System.out.println("sum of even numbers is "+sumeven);
		int sumodd=sn.sumOfOddNumbers(1,10);
		System.out.println("sum of odd numbers is "+sumodd);
		

	}

}
