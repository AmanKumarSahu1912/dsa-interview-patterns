class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int right=cardPoints.length-1;
        int left=0;
        int maxpoints=0;
        int leftsum=0;
        int rightsum=0;
        while(left<k)
        {
            leftsum+=cardPoints[left];
            left++;
        }
        maxpoints=leftsum;
        for(left=k-1;left>=0;left--)
        {
            leftsum-=cardPoints[left];
            rightsum+=cardPoints[right];
            right--;
            maxpoints=Math.max(maxpoints,leftsum+rightsum);
        }
        return maxpoints;
    }
}