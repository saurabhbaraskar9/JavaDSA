
public class removeDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 4, 5};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }

        }

        return j;
    }
}
