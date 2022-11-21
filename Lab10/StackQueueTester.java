package queue;

import java.util.*;

public class StackQueueTester {

	public static void main(String[] args) {
		
		ArrayListStack<String> s1 = new ArrayListStack<String>();
		ArrayListStack<String> s2 = new ArrayListStack<String>();
		ArrayListStack<String> s3 = new ArrayListStack<String>();
		
		String dataForS1 = "Not everything that can be counted counts, and not everything that counts can be counted";
		String dataForS2 = "Not everything that can be counted counts, and not everything that counts can be counted";
		String dataForS3 = "Only two things are infinite, the universe and human stupidity, and I'm not sure about the former.";
		
		ArrayList<String> S1 = new ArrayList<String>(Arrays.asList(dataForS1.split(" ")));
		ArrayList<String> S2 = new ArrayList<String>(Arrays.asList(dataForS2.split(" ")));
		ArrayList<String> S3 = new ArrayList<String>(Arrays.asList(dataForS3.split(" ")));
		
		for(String str : S1) {
			s1.push(str);
		}
		for(String str : S2) {
			s2.push(str);
		}
		for(String str : S3) {
			s3.push(str);
		}
		
		/*----------------------------------------------------------------------------------------------------------------------*/
		
		ArrayListQueue<String> q1 = new ArrayListQueue<String>();
		ArrayListQueue<String> q2 = new ArrayListQueue<String>();
		ArrayListQueue<String> q3 = new ArrayListQueue<String>();
		
		String dataForQ1 = "Not everything that can be counted counts, and not everything that counts can be counted";
		String dataForQ2 = "Not everything that can be counted counts, and not everything that counts can be counted";
		String dataForQ3 = "Only two things are infinite, the universe and human stupidity, and I'm not sure about the former.";
		
		ArrayList<String> Q1 = new ArrayList<String>(Arrays.asList(dataForQ1.split(" ")));
		ArrayList<String> Q2 = new ArrayList<String>(Arrays.asList(dataForQ2.split(" ")));
		ArrayList<String> Q3 = new ArrayList<String>(Arrays.asList(dataForQ3.split(" ")));
		
		for(String str : Q1) {
			q1.insert(str);
		}
		for(String str : Q2) {
			q2.insert(str);
		}
		for(String str : Q3) {
			q3.insert(str);
		}
		
		/*----------------------------------------------------------------------------------------------------------------------*/
		
		System.out.println(s1.size());
		System.out.println(s2.size());
		System.out.println(s3.size());
		System.out.println(q1.size());
		System.out.println(q2.size());
		System.out.println(q3.size());
		System.out.println("\n");
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		System.out.println("s2 equals s3: " + s2.equals(s3));
		System.out.println("q1 equals q2: " + q1.equals(q2));
		System.out.println("q1 equals q3: " + q1.equals(q3));
		System.out.println("q2 equals q3: " + q2.equals(q3));
		

		
	}
	
}
