class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> memory = new HashMap<>();
        for(int i=0; i<n ; i++){
            int currentNum = nums[i];
            int complement = target- currentNum;
            if(memory.containsKey(complement)){
                return new int[]{memory.get(complement),i};
            }
            memory.put(currentNum,i);
        }
        return new int[0];
    }
}
