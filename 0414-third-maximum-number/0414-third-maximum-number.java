class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        
        for (int num : nums) {
           if ((max != null && num == max) || (secondMax != null && num == secondMax) || (thirdMax != null && num == thirdMax)) {
                continue;
            }
            
            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } 
            else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } 
            else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }
        return thirdMax == null ? max : thirdMax;
    }
}