package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		Calculator cal=new Calculator();
		int result=cal.add(2,3);
		assertEquals(5,result);
	}
	
	@Test
	public void testMultiply() {
		Calculator cal=new Calculator();
		int result=cal.multiply(2,3);
		assertEquals(6,result);
	}
	
	@Test
	public void testSubstract() {
		Calculator cal=new Calculator();
		int result=cal.substract(2,3);
		assertEquals(-1,result);
	}
	
	@Test
	public void testDivide() {
		Calculator cal=new Calculator();
		int result=cal.divide(4,2);
		assertEquals(2,result);
	}
	
	@Test
	public void testRevert1() {
		Calculator cal=new Calculator();
		int result=cal.revert1(4);
		assertEquals(-4,result);
	}

}
