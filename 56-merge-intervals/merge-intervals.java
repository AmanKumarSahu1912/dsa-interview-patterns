class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length ==0)
        {
            return new int[0][];
        }
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        List<int[]> merged = new ArrayList<>();
        int[] currinterval = intervals[0];
        merged.add(currinterval);
        for(int[] nextinterval : intervals)
        {
            int currend = currinterval[1];
            int nextstart = nextinterval[0];
            int nextend = nextinterval[1];
            if(currend>=nextstart)
            {
                currinterval[1]=Math.max(currend,nextend);
            }
            else
            {
                currinterval=nextinterval;
                merged.add(currinterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}