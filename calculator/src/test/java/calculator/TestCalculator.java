package calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {
	
	private static Calculator calculator;
	
	@Test  
	public void testFindMax(){  
		assertEquals(4,calculator.findMax(2,5,7));  
		assertEquals(-1,calculator.findMax(-2,-5,-7));  
	} 
	
	@Test  
	public void testSquare1(){  
		assertEquals(4,calculator.square(2));  
	}
	
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare2(){  
		calculator.square(-1);  
	}
	
	@Test  
	public void testCube(){  
		assertEquals(8,calculator.cube(2));  
	}
	
}
