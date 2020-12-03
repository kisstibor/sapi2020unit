package ro.sapientia.test1.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {

	@Test
	public void test1() {
		// 3+7 = 10
		int result = Math.add(3,7);
		assertEquals(10, result);		
	}

	@Test
	public void test2() {
		// 1+2 = 3
		int result = Math.add(1,2);
		assertEquals(3, result);		
	}

	@Test
	public void test3() {
		// 0+0 = 0
		int result = Math.add(0,0);
		assertEquals(0, result);		
	}
	
}
