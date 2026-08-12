public class FirstUnique {

    public static void main(String[] args) {
        String s = "banana";
        int result = unique(s);
        System.out.println("Non- repeating first character is " + result);
    }

    public static char firstUnique(String s){
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        return '#';

    }

    public static int unique(String s){
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;

    }
    
}