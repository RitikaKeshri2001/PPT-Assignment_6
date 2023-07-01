import java.util.Arrays;

public class Q5_MinimizedProductSum {
    public static int minProductSum(int[] nums1, int[] nums2) {
        // Sort both arrays in ascending order
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Initialize the product sum to zero
        int productSum = 0;

        // Traverse the arrays and multiply the minimum element of nums1 with the maximum element of nums2
        for (int i = 0; i < nums1.length; i++) {
            productSum += nums1[i] * nums2[nums1.length - i - 1];
        }

        return productSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 3, 4, 2};
        int[] nums2 = {4, 2, 2, 5};
        System.out.println(minProductSum(nums1, nums2));
    }
}

