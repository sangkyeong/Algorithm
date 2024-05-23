import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        boolean answer = false;
		Stack<String> stk = new Stack<>();

		if(s.length() % 2 == 0) {
			for (String str : s.split("")) {
				if((!stk.isEmpty() && stk.peek().equals("(") && str.equals(")")) ||
						(!stk.isEmpty() && stk.peek().equals("{") && str.equals("}"))||
						(!stk.isEmpty() && stk.peek().equals("[") && str.equals("]")) ) {
					stk.pop();
					continue;
				}
				stk.push(str);
			}
			if(stk.isEmpty()) answer = true;
		}
		return answer;
    }
}