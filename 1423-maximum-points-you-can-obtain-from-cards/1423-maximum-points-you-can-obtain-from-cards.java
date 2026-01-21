class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0, rsum=0;
        int n=cardPoints.length;
        int maxlen=0;
        for(int i=0;i<k;i++)
        {
            lsum=lsum+cardPoints[i];
        }
        maxlen=lsum;
        int right=n-1;

        for(int i=k-1;i>=0;i--)
        {
            lsum-=cardPoints[i];
            rsum+= cardPoints[right];
            right--;
            maxlen=Math.max(maxlen,lsum+rsum);

        }
        return maxlen;
    }
}