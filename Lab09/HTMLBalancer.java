package stack;

public class HTMLBalancer extends TokenBalanceChecker{

	public boolean matches(String open, String closed) {
		return false;
	}

	public boolean isOpenTag(String token) {
		return false;
	}

	public boolean isClosedTag(String token) {
		return false;
	}

}
