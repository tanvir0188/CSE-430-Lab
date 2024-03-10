package manipulatorPackage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringManipulatorTestingClass {
	
	StringManipulatorClass1 stringManipulator = new StringManipulatorClass1();
	StringManipulatorClass2 stringManipulator2 = new StringManipulatorClass2();
	StringManipulatorClass3 stringManipulator3 = new StringManipulatorClass3();
	
	@Test
	public void testcalculateStringLength(){
		assertEquals(5, stringManipulator.calculateStringLength("Arnob"));
	}
	
	@Test
	public void testcalculateStringLengthNullString(){
		assertEquals(0, stringManipulator.calculateStringLength(""));
	}
	
	@Test
	public void testReverseString(){
		assertEquals("bonrA", stringManipulator.reverseString("Arnob"));
	}
	
	@Test
	public void testReverseStringWithSpace(){
		assertEquals("rivnaT bonrA", stringManipulator.reverseString("Arnob Tanvir"));
	}
	
	@Test
	public void testToLowerCase(){
		assertEquals("arnob", stringManipulator.toLowerCase("ARNOB"));
	}
	
	@Test
	public void testToLowerCaseNumber(){
		assertEquals("arnob6", stringManipulator.toLowerCase("ARnob6"));
	}

	@Test
	public void testCountOccurrences(){
		
		assertEquals(3, stringManipulator.countOccurrences("Farhan Tanvir", 'a'));
	}
	
	@Test
	public void testCountOccurrencesZero(){
		
		assertEquals(0, stringManipulator.countOccurrences("Farhan Tanvir", 'x'));
	}
	
	@Test
	public void testCapitalizeWords(){
		
		assertEquals("Doing The Lab Of Cse430", stringManipulator2.capitalizeWords("doing the lab of cse430"));
	}
	
	@Test
	public void testCapitalizeWordsNull(){
		
		assertEquals("", stringManipulator2.capitalizeWords(""));
	}
	
	@Test
	public void testRemoveNonAlphabetic(){
		
		assertEquals("asdfjal", stringManipulator2.removeNonAlphabetic("12asdfj13@a#l"));
	}
	
	@Test
	public void testContainsSubstringTrue(){
		assertEquals(true, stringManipulator2.containsSubstring("It's Arnob", "rn"));
	}
	
	@Test
	public void testContainsSubstringFalse(){
		assertEquals(false, stringManipulator2.containsSubstring("It's Arnob", "  Arnob"));
	}
	@Test
	public void testContainsSubstringBiggerThanMainString(){
		assertEquals(false, stringManipulator2.containsSubstring("Arnob", "  Arnob"));
	}
	
	@Test
	public void testContainsSubstringBiggerSameString(){
		assertEquals(true, stringManipulator2.containsSubstring("Arnob", "Arnob"));
	}
	
	@Test
	public void testMergeString(){
		assertEquals("doing Lab CSE430", stringManipulator2.MergeStrings("doing", " Lab CSE430"));
	}
	
	@Test
	public void testReverseWords(){
		assertEquals("Arnob. am I", stringManipulator2.reverseWords("I am Arnob."));
	}
	@Test
	public void testReverseWordsNull(){
		assertEquals("", stringManipulator2.reverseWords(""));
	}
	
	@Test
	public void testIsPalindromeFalse(){
		assertEquals(false, stringManipulator3.isPalindrome("I am Arnob."));
	}
	
	@Test
	public void testIsPalindromeTrue(){
		assertEquals(true, stringManipulator3.isPalindrome("madam"));
	}
	
	@Test
	public void testIsPalindromeTrueIgnoreCase(){
		assertEquals(true, stringManipulator3.isPalindrome("mAdAm"));
	}
	
	@Test
	public void testRemoveExtraSpace(){
		assertEquals("Currently doing lab", stringManipulator3.removeExtraSpaces("Currently   doing lab        "));
	}
	
	@Test
	public void testRemoveExtraSpaceWithPunctuations(){
		assertEquals("Currently, doing lab .", stringManipulator3.removeExtraSpaces("Currently,   doing lab   .     "));
	}
	
	
	

}
