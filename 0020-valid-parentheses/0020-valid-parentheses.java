class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() == 1 || s.length() == 0) return false;
        for(char ch : s.toCharArray()){
                if(ch == '(' || ch == '[' || ch == '{'){
                    stack.push(ch);
                }
                else if(stack.empty()) return false;

                else{
                    if( ch == ')' && stack.pop() != '(' ||
                        ch == ']' && stack.pop() != '[' ||
                        ch == '}' && stack.pop() != '{' ) return false;
                }
        
    }
    return stack.isEmpty();
    }
}