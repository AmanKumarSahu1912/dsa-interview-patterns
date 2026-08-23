class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int right=cardPoints.length-1;
        int maxpoints=0;
        int leftsum=0;
        int rightsum=0;
        for(int left=0;left<k;left++)
        {
            leftsum+=cardPoints[left];
        }
        maxpoints=leftsum;
        //for(left=k-1;left>=0;left--)
        while(k>0)
        {
           /* leftsum-=cardPoints[left];
            rightsum+=cardPoints[right];
            right--;*/
            leftsum-=cardPoints[k-1];
            k--;
            rightsum+=cardPoints[right];
            right--;
            maxpoints=Math.max(maxpoints,leftsum+rightsum);
        }
        return maxpoints;
    }
}