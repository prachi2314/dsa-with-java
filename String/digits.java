public class digits {
    public static void main(String[] args) {
        String s = "Java2027";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                count++;
            }
        }
        System.out.println(count);
    }
}
