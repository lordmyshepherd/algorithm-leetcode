class Solution {
    /*
        (5단계) 코드 작성: 4단계 알고리즘 설계를 기반으로 코드를 작성한다.
    */    
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
	        return nums.length;
	    }
	    
	    int k = 2;
	    
	    for (int i = 2; i < nums.length; i++) {
	        if (nums[i] != nums[k - 2]) {
	            nums[k] = nums[i];
	            k++;
	        }
	    }
	    
	    return k;
 
    }
}

/*
    (1단계) 문제 이해: 주어진 문제를 읽고 이해하기
    
    "주어진 정수 배열(nums)은 오름차순으로 정렬되어 있고, 중복된 원소를 최대 2번까지만 허용하도록 배열을 수정해야 한다. 
    배열의 상대적인 순서는 유지되어야 하고, 문제에서 원하는 결과는 배열의 길이를 변경하지 않고 중복을 제거한 후, 
    결과가 처음 k개의 슬롯에 위치하도록 하는 것이다. 
    추가적인 배열을 할당하지 않고 O(1)의 추가 메모리를 사용하여 배열을 수정해야 한다.
    결과로서 k를 반환해야 한다."

*/

/*
    (2단계) 구체적인 예들
    Input: nums = [1,1,1,2,2,3] / Output: 5, nums = [1,1,2,2,3,_]
    Input: nums = [0,0,1,1,1,1,2,3,3] / Output: 7, nums = [0,0,1,1,2,3,3,_,_]

*/

/*
    (3단계) 계획 수립: 주어진 문제에 대한 해결 방법을 정의하고 전략을 수립하는 단계이다.
    "배열을 한 번 순회하면서 중복 횟수를 체크하고 중복 허용 횟수 이내의 원소만 유지한다.
    중복 허용 횟수 이상의 중복된 원소는 제거한다. -> Two Pointer Pattern 적용하자.
    유지된 원소의 개수를 k로 세어 반환한다."
*/

/*
    (4단계) 알고리즘 설계: 계획 수립 단계에서 수립한 계획을 바탕으로 알고리즘을 설계한다.
    - 정렬된 배열입니다. 예) [0,0,1,1,1,1,2,3,3]
		- 우선, 배열의 처음부터 시작하여 유일한 요소가 나타날 위치를 가리키는 인덱스 **`k`**를 설정합니다. 
      초기에 `k`는 2로 설정됩니다. 이는 배열의 첫 번째 요소와 두 번째 요소는 
      중복되지 않을 것이라는 가정 때문입니다.
		- 그런 다음 배열을 순회하면서 중복된 요소를 제거합니다. 
      현재 인덱스 `i`를 이용하여 배열을 탐색합니다. 만약 현재 요소(`nums[i]`)가 `k`에서 2를 뺀 
      인덱스에 해당하는 요소와 다르다면, 이는 새로운 유일한 요소이므로 `nums[k]`에 현재 요소를 저장하고 
      `k`를 1 증가시킵니다. 이렇게 하면 유일한 요소가 나타날 위치를 가리키는 `k`가 증가하게 됩니다.
		- 반복이 끝난 후 k 값을 반환합니다.
*/

/*
   참고: https://www.notion.so/Algorithm-New-b02d4ba702294b01905a59685440b29b#9a9f6a35888c41149610beb05b35a7c4
*/
