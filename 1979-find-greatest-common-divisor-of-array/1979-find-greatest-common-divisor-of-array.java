class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]<=min){
                min=nums[i];
            }
            if(nums[i]>=max){
                max=nums[i];
            }
        }
        while(min!=0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}