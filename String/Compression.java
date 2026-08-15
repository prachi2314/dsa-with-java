class Compression{
    public static void main(String[] args) {

        String s = "aaaabbbcccdbb";
        System.out.println(compress(s));
        
    }

    public static String compress(String s) {
        
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            int count = 0;
            char current = s.charAt(i);
            while (i<s.length() && s.charAt(i) == current) {
                count++;
                i++;
            }
            result.append(current);
            result.append(count);
        }
        return result.toString();
    }
}