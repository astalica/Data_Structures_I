package stack;
import java.util.*;
public abstract class TokenBalanceChecker implements BalanceChecker {

	public abstract boolean matches(String open, String closed);
	
	public abstract boolean isOpenTag(String token);
	
	public abstract boolean isClosedTag(String token);
	
	public boolean isBalanced(ArrayList<String> tokenList){
		
		ArrayListStack<String> StringStack = new ArrayListStack<String>();
		
		for(int i = 0; i < tokenList.size(); i++) {
			
			String tok = tokenList.get(i);
			if(isOpenTag(tok)) {
				StringStack.push(tok);
			}else if(isClosedTag(tok)) {
				
				if(StringStack.isEmpty()) {
					return false;
				}
				String tok1 = StringStack.top();
				if(!matches(tok1,tok)) {
					return false;
				}
				StringStack.pop();
				
			}
			
		}
		if(!StringStack.isEmpty()) {
			return false;
		}
		
		return true;
		
	}
	
}
