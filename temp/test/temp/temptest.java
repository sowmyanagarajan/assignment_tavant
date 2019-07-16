package temp;

import static org.junit.Assert.*;

import org.junit.Test;

public class temptest {

	@Test
	public void test() {
		Temperature temm=new Temperature();
		double actual=temm.convertToCelsius(150);
		double expected=65.5556;
		assertEquals(actual,expected,0.0002);
		
	}
	@Test
	public void testfaren(){
		Temperature temm=new Temperature();
		double actual=temm.convertToFarenheit(100);
		double expected=212;
		assertEquals(actual,expected,0.0002);
	}

}
