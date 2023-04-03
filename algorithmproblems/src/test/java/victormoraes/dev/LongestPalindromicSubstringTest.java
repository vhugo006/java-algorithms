package victormoraes.dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringTest {

    @Test
    public void givenAStringReturnTheLongestPalindromicSubstring(){

        Assertions.assertEquals("bab",
                LongestPalindromicSubstring.longestPalindrome("babad"));

    }
}