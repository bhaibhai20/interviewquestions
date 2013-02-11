public final class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("abaa"));
    }

    static boolean isPalindrome(String s) {
        for (int a = 0; a < s.length() / 2; a++)
            if (s.charAt(a) != s.charAt(s.length() - 1 - a))
                return false;
        return true;
    }
}
