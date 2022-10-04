package Lab06;

public class SectionB {

	public static void main(String[] args) {
		
		int[] array = {2,3,3,4,2};
		System.out.println(findPair(array));
		
		
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
		
		/*
	
		for(int num : array) {
			
			if(array[num+1] < array.length) {
				
				if(array[num] == array[num+1]) {
					
					numPairs = true;
					
				}
				
			}
		}
		*/
		
		for (int i = 0; i < array.length; i++) 
			if (array[i] == array[i+1]) {
				return true;
			}/*else {
				return false;
			}
		*/
		return false;
		
		
	}
	
}
