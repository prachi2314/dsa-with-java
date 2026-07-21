class counting {
    public static void main(String[] args) {
        String s = "Prachi2026AI";
        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
         for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                uppercase++;
            }else if(ch>='a' && ch<='z'){
                lowercase++;
            }else{
                digit++;
            }
        }
        System.out.println(uppercase);
        System.out.println(lowercase);
        System.out.println(digit);
    }
    
}