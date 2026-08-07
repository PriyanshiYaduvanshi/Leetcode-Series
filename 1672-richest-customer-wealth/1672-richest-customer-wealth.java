class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int max=0;
        for(int row = 0; row<n; row++){
            int sum = 0;
            for(int col=0; col<accounts[row].length;col++){
                sum += accounts[row][col];
            }
            max = Math.max(max,sum);
        }
        return max; 
    }
}