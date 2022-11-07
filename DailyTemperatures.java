class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int currTemp = temperatures[i];
            while (!stack.isEmpty() && temperatures[stack.peek()] < currTemp) {
                int ind = stack.pop();
                res[ind] = i - ind;
            }
            stack.push(i);
        }

        return res;
    }
}
