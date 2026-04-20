class Solution {
    public boolean isPowerOfThree(int n) {
        boolean found=false;
        long value=1;
        for(int i=0;value<=n;i++){
            if(n==value){
                found=true;
                break;
            }
            value*=3;
        }
        if(found) return true;
        else return false;
    }
}