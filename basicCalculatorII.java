class Solution {
    public int calculate(String s) {
        int size = s.length();
        Stack<Integer> stack = new Stack<>();
        int num= 0;
        char ch;
       char  opr = '+';
        int i = 0;
         while ( i < size ) {
             ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = (num * 10) + (ch - '0');
            }
            if (!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == size - 1) {
                if (opr == '-') {
                    stack.push(-num);
                }
                else if (opr == '+') {
                    stack.push(num);
                }
                else if (opr == '*') {
                    stack.push(stack.pop() * num);
                }
                else if (opr == '/') {
                    stack.push(stack.pop() / num);
                }
                opr = ch;
                num = 0;
            }
             i++;
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
