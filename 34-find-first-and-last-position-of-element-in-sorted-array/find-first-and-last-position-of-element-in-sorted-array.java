class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        result[0]=findboundry(nums,target,true);
        if(result[0]==-1)
        {
            return result;
        }
        result[1]=findboundry(nums,target,false);
        return result;
        
    }
    private int findboundry(int[]nums,int target,boolean isfirst)
    {
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(target>nums[mid])
            {
                left=mid+1;
            }
            else if(target<nums[mid])
            {
                right=mid-1;
            }
            else  //nums[mid]==target
            {
                index=mid;
                if(isfirst)
                {
                    right=mid-1;  // sqeezen to left for firstoccurance
                }
                else
                {
                    left=mid+1; //for last occurance
                }
            }
        }
        return index;
    }
}