public class nameFi {
    
    public static void main(String[] args) {
        String s = "Prachi";
        System.out.println("My name is " + s);
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));

        // System.out.println(s.charAt(s.length()));

        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}
