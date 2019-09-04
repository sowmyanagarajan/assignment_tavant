package day4;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
//pass case1
	@Test
	public void test() {
		Factorial ft=new Factorial();
		int actual=ft.calculateFactorial(10);
		int expected=3628800;
		assertEquals(actual,expected);
		
	}
	//pass case2
	@Test
	public void test_2() {
		Factorial ft=new Factorial();
		int actual=ft.calculateFactorial(0);
		int expected=1;
		assertEquals(actual,expected);
		
	}
	@Test
	//fail case
	public void test_3() {
		Factorial ft=new Factorial();
		int actual=ft.calculateFactorial(20);
		int expected=1990;
		assertEquals(actual,expected);
		
	}
}
