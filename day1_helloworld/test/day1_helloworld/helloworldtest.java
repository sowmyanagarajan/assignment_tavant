package day1_helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class helloworldtest {

	@Test
	public void test() {
		helloworld hwt=new helloworld();
		String actual=hwt.getstring();
		String expected="hello world!!!";
		assertEquals(actual,expected);
		
		
	}

}
