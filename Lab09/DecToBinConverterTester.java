package stack;



public class DecToBinConverterTester {
	
	public static void main(String args[]) {
		
		Integer[] numbers = { 	new Integer(23), 
				new Integer(47), 
				new Integer(257), 
				new Integer(1023),
				new Integer(0), 
				new Integer(82), 
				new Integer(512), 
				new Integer(100),
				new Integer(2049)
				     };
		for(Integer num : numbers) {
			
			System.out.println("Number: " + num);
			System.out.print("Binary: ");
			DecToBinConverter.printInBinary(num);
			System.out.println("\n");
			
		}

		
	}
	
}
