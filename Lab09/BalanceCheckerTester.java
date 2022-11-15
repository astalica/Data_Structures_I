package stack;
import java.io.*;

import java.util.*;
public class BalanceCheckerTester {

	public static void main(String[] args) {
		String data1 = "";
		HTMLBalancer hb = new HTMLBalancer();
		
		try {
			
			Scanner sc = new Scanner(new File("testdata1.txt"));
			
			while(sc.hasNext()) {
				
				data1 = data1.concat(sc.next() + " ");
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		ArrayList<String> htmlData1 = new ArrayList<String>();
		
		StringTokenizer st1 = new StringTokenizer(data1, " ");
		while(st1.hasMoreTokens()) {
			htmlData1.add(st1.nextToken());
		}
		
		if(hb.isBalanced(htmlData1)) {
			System.out.println("htmldata1 is balanced");
		}else {
			System.out.println("htmldata1 is not balanced");
		}
		
		
		String data2 = "";
		try {
			
			Scanner scan = new Scanner(new File("testdata2.txt"));
			
			while(scan.hasNext()) {
				data2 = data2.concat(scan.next() + " ");
			}
			
		}catch(IOException f) {
			f.printStackTrace();
		}
		
		ArrayList<String> htmlData2 = new ArrayList<String>();
		StringTokenizer st2 = new StringTokenizer(data2, " ");
		while(st2.hasMoreTokens()) {
			htmlData2.add(st2.nextToken());
		}
		
		if(hb.isBalanced(htmlData2)) {
			System.out.println("hmtldata2 is balanced");
		}else {
			System.out.println("htmldata2 is not balanced");
		}
		
		
	}
	
}
