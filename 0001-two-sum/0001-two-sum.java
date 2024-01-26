class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = nums.length;
        Map<Integer, Integer> findMap = new HashMap<>();

        int[] result = new int[2];

        for(int i = 0; i < a; i++) {
            if(findMap.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = findMap.get(target - nums[i]);
                break;
            }

            findMap.put(nums[i], i);
        }

        return result;
    }
}