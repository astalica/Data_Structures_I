package stack;
import java.util.*;
public class HTMLBalancer extends TokenBalanceChecker{

	public boolean matches(String open, String closed) {
		
		String op = open.substring(1);
		String cl = closed.substring(2);
		if(isOpenTag(open) && isClosedTag(closed) && op.equals(cl)) return true;
		return false;
		
	}

	public boolean isOpenTag(String token) {
		
		char[] chars = token.toCharArray();
		if(chars[0] == '<' && chars[chars.length-1] == '>' && chars[1] != '/') return true;
		return false;
		
	}

	public boolean isClosedTag(String token) {
		
		char[] chars = token.toCharArray();
		if(chars[0] == '<' && chars[1] == '/' && chars[chars.length-1] == '>')return true;
		return false;
		
	}

}
