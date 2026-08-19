public class Rotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cbda";
        System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1+s1).contains(s2);
        
    }
}
