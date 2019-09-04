package day1;

import static org.junit.Assert.*;

import org.junit.Test;

import day1.HelloWorld;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld hwt=new HelloWorld();
		String actualString=hwt.GetString();
		String expectedString="hello world!!!";
		assertEquals(actualString,expectedString);
	}

}
