class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int runningsum=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums)
        {
            runningsum+=num;
            int target = runningsum-k;
            if(map.containsKey(target))
            {
                count+=map.get(target);
            }
            map.put(runningsum,map.getOrDefault(runningsum,0)+1);
        }
        return count;  
    }
}