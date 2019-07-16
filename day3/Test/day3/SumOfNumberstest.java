package day3;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumberstest {

	@Test
	public void test() {
		SumOfNumbers snn=new SumOfNumbers();
		 int actual= snn.sumOfEvenNumbers(1,10);
		 int expected=30;
		 assertEquals(actual,expected);
		 
	}
	@Test
	public void testodd() {
		SumOfNumbers snn=new SumOfNumbers();
		 int actual= snn.sumOfOddNumbers(1,10);
		 int expected=25;
		 assertEquals(actual,expected);
		 
	}
	
	//fail case
	@Test
	public void testoddfail() {
	SumOfNumbers snn=new SumOfNumbers();
		int actual= snn.sumOfOddNumbers(1,10);
		 int expected=15;
		 assertEquals(actual,expected);
		 
	}
	
}
