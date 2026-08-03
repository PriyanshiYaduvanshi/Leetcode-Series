class Solution {
    public boolean helper(int i, int j, String s){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int n=s.length();
        int i = 0;
        int j = n-1;

        while(i <= j){
            char left = s.charAt(i),
                 right =s.charAt(j);

            if(left != right){
                return helper(i+1,j,s) || helper(i,j-1,s);
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}