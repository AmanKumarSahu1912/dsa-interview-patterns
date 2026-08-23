class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length-1;
        int sum=0;
        for(int left=0;left<k;left++)
        {
            sum+=cardPoints[left];
        }
        int max=sum;
        while(k>0)
        {
            sum-=cardPoints[--k];  // subtarct from left index
            sum+=cardPoints[n--];//add one no. from right
            if(sum>max)
            {
                max=sum;
            } 
        }
        return max;
    }
}