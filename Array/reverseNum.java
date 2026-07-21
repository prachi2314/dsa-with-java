public class reverseNum {

    public static void main(String[] args) {
        int[] arr = {10, 14, 20, 26, 34};
        revNum(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }

    public static void revNum(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    
}