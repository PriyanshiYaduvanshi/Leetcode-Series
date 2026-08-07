class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }

    boolean even(int n){
        int digitcount = digits(n);
        return digitcount % 2 == 0;
    }

    int digits(int n){
        int count=0;
        if(n<0){
            n=n*-1;
        }

        if(n==0){
            return 1;
        }

        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}