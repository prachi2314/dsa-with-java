public class vowels {

    public static void main(String[] args) {
        String s = "Umbrella";
        int count = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                count++;
            }
        }
        System.out.println(count);
    }
    
}