public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,10, 5 ,1, 15, 30};
        System.out.println(secondLargest(arr));
        
        
        
    }

    public static  int secondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=1; i<arr.length; i++){
            if (arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return  secondLargest;
    }
    
}