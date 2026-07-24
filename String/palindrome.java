public class palindrome {
    public static void main(String[] args) {
        String s = "racecar";

        if (isPalindrome(s) == true) {
            System.out.println("String is palindrome");
        } else{
            System.out.println("String is not palindrome");
        }
    }

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while (left<right) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
