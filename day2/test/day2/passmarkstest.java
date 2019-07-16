package day2;

import static org.junit.Assert.*;

import org.junit.Test;

public class passmarkstest {

	//to test markGrade
	@Test
	public void test() {
		passmarks ps=new passmarks();
		String actual=ps.markGrade(78);
		String expect="B";
		assertEquals(actual,expect);
	
	}
	//to test markGrade fail case
		@Test
		public void test_2() {
			passmarks ps=new passmarks();
			String actual=ps.markGrade(98);
			String expect="B";
			assertEquals(actual,expect);
		
		}
	//to test is pass
	@Test
	public void testispass() {
		passmarks ps=new passmarks();
		boolean actual=ps.ispass(78);
		boolean expect=true;
		assertEquals(actual,expect);
	
	}
	// fail case
	@Test
	public void testispasss() {
		passmarks ps=new passmarks();
		boolean actual=ps.ispass(30);
		boolean expect=true;
		assertEquals(actual,expect);
	
	}
}
