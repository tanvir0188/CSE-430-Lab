package testingProject;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCalculator {
	Calculator calc = new Calculator();
	
	@Test
	public void testAddpositiveIntegers(){
		assertEquals(19, calc.add(9, 10));
	}

	@Test
	public void testAddNegativeIntegers(){
		assertEquals(-19, calc.add(-9, -10));
	}
	
	@Test
	public void testAddNegativeAndPositiveIntegers(){
		assertEquals(1, calc.add(-9, 10));
	}
	
	@Test
	public void testAddBiggerNegativeIntegers(){
		assertEquals(-2, calc.add(-12, 10));
	}
	
	@Test
	public void testMultPositiveIntegers(){
		assertEquals(25, calc.multiply(5, 5));
	}
	
	@Test
	public void testMultOneNegativeIntegers(){
		assertEquals(-25, calc.multiply(-5, 5));
	}
	
	@Test
	public void testMultTwoNegativeIntegers(){
		assertEquals(25, calc.multiply(-5, -5));
	}
	@Test
	public void testMultOneZero(){
		assertEquals(0, calc.multiply(-5, 0));
	}
	//divide testing
	@Test
	public void testDivisionBestCase(){
		assertEquals(2, calc.divide(24, 12));
	}
	
	@Test
	public void testDivisionDividedByBiggerInteger(){
		assertEquals(0, calc.divide(2, 12));
	}
	
	@Test
	public void testDivisionDividedBySmallerInteger(){
		assertEquals(2, calc.divide(27, 12));
	}
	
	@Test
	public void testDivisionDividedByZero(){
		assertTrue(Double.isInfinite(calc.divide(-27, 0)));
	}

	
}
