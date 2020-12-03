package ro.sapientia.test1.unittest;

import static org.mockito.Mockito.mock;
import org.junit.Test;
import org.mockito.Mockito;

public class AlmaTest {
	
	@Test
	public void test1() {
		Collect collect = mock(Collect.class);
		Mockito.spy(collect);
		Alma alma = new Alma(collect);
		alma.collect2Apples();

		Mockito.verify(collect).add(2);
	}

	@Test
	public void test2() {
		Collect collect = mock(Collect.class);
		Mockito.when(collect.getSum(Mockito.anyInt())).thenReturn(Integer.valueOf(5));
		Mockito.spy(collect);
		Alma alma = new Alma(collect);
		alma.collect3Apples();

		Mockito.verify(collect).add(8);
	}
	
}
