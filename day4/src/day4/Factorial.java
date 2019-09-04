package day4;
import java.util.*;
public class Factorial {
	int calculateFactorial(int number)
	{
		int factorial=1;
		while(number!=0)
		{
			factorial=factorial*number;
			number=number-1;
		}
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorial ft=new Factorial();
Scanner scanner=new Scanner(System.in);
int result;
System.out.println("enter the number");
int number=scanner.nextInt();
result=ft.calculateFactorial(number);
System.out.println("factorial of given number is "+result);


	}

}
