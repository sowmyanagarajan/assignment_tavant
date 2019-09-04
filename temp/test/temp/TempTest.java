package temp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TempTest {
//pass case
	@Test
	public void testcelsius() {
		Temperature temperature=new Temperature();
		double actual=temperature.convertToCelsius(150);
		double expected=65.5556;
		assertEquals(actual,expected,0.0002);
		
	}
	@Test
	public void testfarenheit(){
		Temperature temperature=new Temperature();
		double actual=temperature.convertToFarenheit(100);
		double expected=212;
		assertEquals(actual,expected,0.0002);
	}
//fail case
	@Test
	public void testfarenheitfail(){
		Temperature temperature=new Temperature();
		double actual=temperature.convertToFarenheit(100);
		double expected=202;
		assertEquals(actual,expected,0.0002);
	}
}
