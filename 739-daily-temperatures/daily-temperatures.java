class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++)
        {
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()])
            {
                int pervday=stack.pop(); // pop top and give index
                result[pervday]=i-pervday;
            }
            stack.push(i);
        }
        return result;
        
    }
}