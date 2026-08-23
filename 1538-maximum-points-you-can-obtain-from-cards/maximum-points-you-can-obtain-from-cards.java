class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length-1;
        int left=0;
        int sum=0;
        while(left<k)
        {
            sum+=cardPoints[left];
            left++;
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