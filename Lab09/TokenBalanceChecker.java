package stack;
import java.util.*;
public abstract class TokenBalanceChecker implements BalanceChecker {

	public abstract boolean matches(String open, String closed);
	
	public abstract boolean isOpenTag(String token);
	
	public abstract boolean isClosedTag(String token);
	
	public boolean isBalanced(ArrayList<String> tokenList){
		
		ArrayListStack<String> StringStack = new ArrayListStack<String>();
		
	}
	
}
