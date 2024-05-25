
public class rotateElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

    }

    public void rotate(int[] arr, int k) {
            for(int i=9; i<=k; i++){
                int temp= arr[i];
               arr[i]= arr[k+i];
               arr[k+i] = temp;

            }

            
    }
}
