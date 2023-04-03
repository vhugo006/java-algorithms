package victormoraes.dev;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {


    }

    /*
     * Solution 1
     * */
    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int end = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                boolean currentCharsMatch = s.charAt(i) == s.charAt(j);

                if (j - i <= 2) {
                    dp[i][j] = currentCharsMatch;
                } else {
                    dp[i][j] = currentCharsMatch && dp[i+1][j-1];
                }

                if (dp[i][j] && j - i > end - start) {
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }
}