package Assignment4.module11;
import java.util.Stack;


    // LeetCode 20 - Valid Parentheses


    public class ValidParentheses {

        public static void main(String[] args){

            String s="()[]{}";
            Stack<Character> stack=new Stack<>();

            for(char c:s.toCharArray()){

                if(c=='('||c=='{'||c=='[')
                    stack.push(c);

                else{
                    if(stack.isEmpty()){
                        System.out.println(false);
                        return;
                    }
                    stack.pop();
                }
            }

            System.out.println(stack.isEmpty());
        }
    }

