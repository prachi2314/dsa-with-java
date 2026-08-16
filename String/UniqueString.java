public class UniqueString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestUnique(s));
    }

    public static int longestUnique(String s){
        boolean[] seen = new boolean[26];
        int left = 0;
        int max = 0;
        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);
            int index = ch - 'a';
            

            while(seen[index]){
                seen[s.charAt(left) - 'a'] = false;
                left++;
            }
            seen[index] = true;

            int current = right-left+1;
            if(current > max){
                max = current;
            }
        }
        return max;
    }
}
