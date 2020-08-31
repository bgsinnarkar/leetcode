/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/evaluate-reverse-polish-notation/

https://leetcode.com/problems/evaluate-reverse-polish-notation/discuss/47430/Java-Accepted-Code%3A-Stack-implementation.

***********************************************/

class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack();        
        String operators = "+-*/";
        int left;
        int right;
        
        for(int i = 0; i < tokens.length; i++) {            
            if(operators.contains(tokens[i])) {
                right = stack.pop();
                left = stack.pop();
                
                switch(tokens[i]) {
                    case "+":
                        stack.push(left + right);
                        break;

                    case "-":                    
                        stack.push(left - right);
                        break;

                    case "*":
                        stack.push(left * right);
                        break;

                    case "/":                    
                        stack.push(left / right);
                        break;

                    default:
                        break;
                } 
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }  
        
        return stack.pop();
    }
}