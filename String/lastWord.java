public class lastWord{
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }

    public static int lengthOfLastWord(String s){
        int i = s.length()-1;

        while (i>=0 && s.charAt(i)==' ') {
            i--;
        }

        int count = 0;
        while (i>=0 && s.charAt(i)!=' ') {
            i--;
            count++;
        }
        return count;
    }
}