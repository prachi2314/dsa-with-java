public class maxNum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 50, 30};
        
        int result = maxNumber(arr);

        System.out.println("Maximum no :" + result);
    }

    public static int maxNumber(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
