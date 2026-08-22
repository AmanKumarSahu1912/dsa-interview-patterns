class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastseen={-1,-1,-1};
        int count=0;
        for(int right=0;right<s.length();right++)
        {
            //update the last seen index for current character
            lastseen[s.charAt(right)-'a']=right;
            //min from all 3
            int minindex=Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]));
            //we can also skip if condition and directly set count+=minindex+1(ex -1+1=0)
            if(minindex!=-1)
            {
                count+=minindex+1;
            }
        }
        return count;
    }
}