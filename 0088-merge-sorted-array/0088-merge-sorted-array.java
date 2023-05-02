class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        for (int i = nums1.length; i > 0; i--) {
            boolean isSwaps = false;

            for (int j = 0; j < i - 1; j++) {
                if(nums1[j] > nums1[j+1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                    isSwaps = true;
                }
            }

            if(isSwaps == false) break;
        }
    }
}