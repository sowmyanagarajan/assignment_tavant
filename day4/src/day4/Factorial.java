package day4;
import java.util.*;
public class Factorial {
	int calculateFactorial(int number)
	{
		int fact=1;
		while(number!=0)
		{
			fact=fact*number;
			number=number-1;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorial ft=new Factorial();
Scanner sc=new Scanner(System.in);
int res;
System.out.println("enter the number");
int num=sc.nextInt();
res=ft.calculateFactorial(num);
System.out.println("factorial of given number is "+res);


	}

}
