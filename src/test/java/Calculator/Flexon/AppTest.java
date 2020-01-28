package Calculator.Flexon;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class AppTest {

	public void testSum() {
		System.out.println("sum");
		int x = 15;
		int y = 15;
		int expResult = 30;
		int result = Calculator.sum(x, y);
		assertEquals(expResult, result);

	}
}