
import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void testOperationPlus() {
		assertEquals("+", Operation.PLUS.toString());
	}
	
	@Test
	public void testOperationMinus() {
		assertEquals("-", Operation.MOINS.toString());
	}
	
	@Test 
	public void testComputePlus() {
		assertEquals(5, Operation.PLUS.compute(2, 3), 0.1);
	}
	
	@Test 
	public void testComputeCombo() {
		assertEquals(9, Operation.PLUS.compute(Operation.FOIS.compute(2, 3), 3), 0.1);
	}

}
