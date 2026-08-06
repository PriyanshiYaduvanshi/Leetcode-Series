class Solution {
    public int digitProduct(int n){
        int product = 1;
        while(n>0){
            int temp = n % 10;
            product *= temp;
            n/=10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        while(digitProduct(n) % t != 0){
            n++;
        }
        return n;
    }
}