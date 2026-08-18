class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right =height.length-1;
        int maxarea=0;
        while(left<right)
        {
            int currwidth=right-left;
            int currheight=Math.min(height[left], height[right]);
            int currarea=currwidth*currheight;
            maxarea = Math.max(maxarea,currarea);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxarea;  
    }
}