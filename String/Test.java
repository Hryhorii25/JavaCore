package String;

public class Test {
    public static void main(String[] args) {
        String str = "ada";
    }
        private static boolean isPalindrome(String str) {
            if (str == null)
                return false;
            StringBuilder strBuilder = new StringBuilder(str);
            strBuilder.reverse();
            return strBuilder.toString().equals(str);
    }

}
