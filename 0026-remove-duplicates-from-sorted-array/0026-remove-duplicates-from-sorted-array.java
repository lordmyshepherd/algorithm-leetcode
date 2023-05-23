class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // 유일한 요소의 개수
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

/*
    참고. https://www.notion.so/Algorithm-Devise-a-plan-to-solve-algorithms-886c63136a334978835e450ea1aa44c7#d7bf7651f1c742b5a014091d6ce925a6
*/