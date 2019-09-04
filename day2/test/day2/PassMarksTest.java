package day2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassMarksTest {

	//to test markGrade
	@Test
	public void test() {
		PassMarks ps=new PassMarks();
		String actual=ps.markGrade(78);
		String expect="B";
		assertEquals(actual,expect);
	
	}
	//to test markGrade fail case
		@Test
		public void test_2() {
			PassMarks ps=new PassMarks();
			String actual=ps.markGrade(98);
			String expect="B";
			assertEquals(actual,expect);
		
		}
	//to test is pass
	@Test
	public void testispass() {
		PassMarks ps=new PassMarks();
		boolean actual=ps.ispass(78);
		boolean expect=true;
		assertEquals(actual,expect);
	
	}
	// fail case
	@Test
	public void testispasss() {
		PassMarks ps=new PassMarks();
		boolean actual=ps.ispass(30);
		boolean expect=true;
		assertEquals(actual,expect);
	
	}
}
