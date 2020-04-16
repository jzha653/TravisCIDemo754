import org.junit.Test;
import static org.junit.Assert.*;

public class StringCheckTest {
    private StringCheck stringCheck = new StringCheck();

    @Test
    public void testIsPalindrome() {
        assertFalse(stringCheck.isPalindrome("aabb"));
        assertFalse(stringCheck.isPalindrome(null));
        assertFalse(stringCheck.isPalindrome("NotEvenClose"));
        assertTrue(stringCheck.isPalindrome(""));
        assertTrue(stringCheck.isPalindrome("abba"));
        assertTrue(stringCheck.isPalindrome("tattarrattat"));
    }

    /**
     * TBD:
     * - Create tests for the other methods you create in the StringCheck Class
     */
}
