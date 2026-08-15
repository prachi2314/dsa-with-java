public class Duplicates {
    public static void main(String[] args) {

        String s = "programming";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        boolean[] seen = new boolean[26];
        StringBuilder result = new StringBuilder();
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            int index = ch - 'a';
            if(!seen[index]){
                seen[index] = true;
                result.append(ch);
            }
        }
        return result.toString();
    }
}
