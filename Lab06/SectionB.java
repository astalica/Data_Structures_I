

package Lab06;

public class SectionB {

	public static void main(String[] args) {
		
		int[] array = {9,6,3,4,2};
		int[] arraySorted = {1,2,3,4,5,6,7,8,9};
		
		//System.out.println("A: Middle index = " + printMiddle(array));
		//System.out.println("B: Smallest index = " + printSmallest(arraySorted));
		//System.out.println("B: findPair(array));
		
		System.out.println(hasDuplicate(array));
		
	}
	
	public void printMiddle(int[] array) {
		
		int size = array.length;
		int middle = (size-1)/2;
		System.out.println(array[middle]);
		
	}
	
	public void printSmallest(int[] array) {
		
		System.out.println(array[0]);
		
	}
	
	public static boolean findPair(int[] array) {
		
		for (int i = 0; i < (array.length-1); i++) 
			
			if (array[i] == array[i+1]) {
				
				return true;
				
			}
		
		return false;
		
		
	}
	
	public static boolean hasDuplicate(int[] array) {
		boolean duplicate = false;
		
		for(int i =0; i < array.length; i++) {
			
			for(int j = i + 1; j < array.length; j++) {
				
				if(array[i] == array[j]) {
					
					duplicate = true;
					return duplicate;
					
				}
				
			}
			
		}
		
		return duplicate;
		
	}
	
}
