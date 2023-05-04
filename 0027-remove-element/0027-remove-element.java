class Solution {
    public int removeElement(int[] nums, int val) {
        /* 
            Input: nums = [3,2,2,3], val = 3
            Output: 2, nums = [2,2,3,3]

            Pseudocode
            1. two point approach, pointer k = 0, i = 0으로 시작하여 nums 배열을 반복한다.
               (여기서, k까지가 val와 일치하지 않는 요소들이 있음을 의미한다.)
            2. 만약에 nums[i] != val, nums[i]와 nums[k] 교환하고
            3. return k
        */

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                int temp = nums[i];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }

        return k;
        
    }
}