
public class getSecondHighest {

    public static void main(String[] args) {
        int a[] = new int[5];
        getSecondOrderElements(5, a);
    }

    public static void getSecondOrderElements(int n, int[] a) {
        // Write your code here.

        int max = a[0];
        int sm = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                sm = max;
                max = a[i];
            }

            if (a[i] < max && a[i] > sm) {
                sm = a[i];
            }
        }

        System.out.println(sm);

        int min = Integer.MAX_VALUE;
        int smin = a[0];

        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                smin = min;
                min = a[i];
            }

            if (a[i] > min && a[i] < smin) {
                smin = a[i];
            }
        }

        System.out.println(smin);

    }
}
