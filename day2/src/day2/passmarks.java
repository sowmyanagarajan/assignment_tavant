package day2;
import java.util.*;
import java.util.Scanner;


public class passmarks {
boolean ispass(int marks)
{
	if(marks>=40)
	return true;
	else 
		return false;
}
public String markGrade(int mark)
{
	if(ispass(mark))
	{
	if (mark>=90&& mark<=100)
		return "A";
	else if (mark>75&& mark<=89)
	return "B";
	else if (mark>60 && mark<=74)
		return "C";
	else 
		return "D";
	}
	else 
		return "FAIL";
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		passmarks ps=new passmarks();
		int ma;
		String result;
		System.out.println("enter the marks");
		ma=sc.nextInt();
		result=ps.markGrade(ma);
		System.out.println("the result is Grade "+result);
		
		
		
		
		

	}

}
