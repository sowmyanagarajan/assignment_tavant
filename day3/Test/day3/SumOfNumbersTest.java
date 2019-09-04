package day3;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	@Test
	public void test() {
		SumOfNumbers snn=new SumOfNumbers();
		 int actual= snn.SumOfEvenNumbers(1,10);
		 int expected=30;
		 assertEquals(actual,expected);
		 
	}
	//fail case for even number
	@Test
	public void testeven() {
		SumOfNumbers snn=new SumOfNumbers();
		 int actual= snn.SumOfEvenNumbers(1,10);
		 int expected=45;
		 assertEquals(actual,expected);
		 
	}
	//pass case for odd number
	@Test
	public void testodd() {
		SumOfNumbers snn=new SumOfNumbers();
		 int actual= snn.SumOfOddNumbers(1,10);
		 int expected=25;
		 assertEquals(actual,expected);
		 
	}
	
	//fail case
	@Test
	public void testoddfail() {
	SumOfNumbers snn=new SumOfNumbers();
		int actual= snn.SumOfOddNumbers(1,10);
		 int expected=15;
		 assertEquals(actual,expected);
		 
	}
	
}
