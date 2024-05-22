public class largestNum {

    public static void main(String[] args) {
        
        int[] arr = {10,92,23,25,45};
        
        System.out.println(largest(arr));

        
    }
    
    public static int largest(int arr[])
    {
     
    int max = Integer.MIN_VALUE;
    
    for (int i=0; i<arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    
    return max;
     
     
        
    }
}
