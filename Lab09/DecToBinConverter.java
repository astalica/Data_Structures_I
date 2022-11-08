package stack;
import java.util.*;

public class DecToBinConverter {

	public static void printInBinary(int n) {
		
		ArrayListStack<Integer> S = new ArrayListStack<Integer>();
		int rem;
		int digit;
		
		if(n == 0) {
			System.out.print(n);
		}else {
			
			while(n > 0) {
				
				rem = n%2;
				S.push(rem);
				n = n/2;
				
			}
			
			while(S.isEmpty() == false) {
				
				digit = S.pop();
				System.out.print(digit);
				
			}
			
		}
		
	}
	
}
