class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int n1;
        int n2;
        
        for (String ch : tokens){
            if(ch.equals("+")){
                n1 = stack.pop();
                n2 = stack.pop();
                stack.push(n2 + n1);
            }
            else if(ch.equals("-")){
                n1 = stack.pop();
                n2 = stack.pop();
                stack.push(n2 - n1);
            }
            else if(ch.equals("*")){
                n1 = stack.pop();
                n2 = stack.pop();
                stack.push(n2 * n1);
            }
            else if(ch.equals("/")){
                n1 = stack.pop();
                n2 = stack.pop();
                stack.push(n2 / n1);
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}