package queue;

import java.util.*;
/**
 * Implementation of a stack using an ArrayList to hold the
 * elements of the stack
 * @author trao
 *
 * @param <T>
 */
public class ArrayListStack<T> implements IStack<T>
{
	//--------------------------------------------------
	// Body of the stack is held in an ArrayList
	private ArrayList<T> stackBody;
	
	//--------------------------------------------------
	/**
	 * Constructor: Instantiates the body
	 */
	public ArrayListStack()
	{
		stackBody = new ArrayList<T>();
	}
	//--------------------------------------------------
	/**
	 * Test for emptiness: size == 0 means stack is empty
	 */
	public boolean isEmpty()
	{
		return (stackBody.size() == 0);
	}
	//--------------------------------------------------
	/**
	 * Insert a new item at the top of the stack
	 */
	public void push(T item)
	{	
		stackBody.add(item);
	}
	//--------------------------------------------------
	/**
	 * Delete the top-most element of the stack
	 * Report error and return null if stack is empty
	 */
	public T pop()
	{
		if (isEmpty())
		{
			System.out.println("Error in ArrayStack.pop() Stack Empty ");
			return null;
		}
		else
		{
			T topElement = stackBody.get(stackBody.size()-1);
			stackBody.remove(stackBody.size()-1);
			return topElement;
		}
	}
	//--------------------------------------------------
	/**
	 * Fetch the top-most element of the stack without
	 * removing it. Report error and return null if stack 
	 * is empty
	 */
	public T top()
	{
		if (isEmpty())
		{
			System.out.println("Error in ArrayStack.top() Stack Empty ");
			return null;
		}
		else
		{
			T topElement = stackBody.get(stackBody.size()-1);
			return topElement;
		}
	}
	
	public boolean equals(ArrayListStack<T> otherStack) {
		
		ArrayList<T> theseElements = new ArrayList<T>();
		ArrayList<T> otherElements = new ArrayList<T>();
		
		if(this.size() == otherStack.size()) {
			
			while(!isEmpty()) {
				for(int i = 0; i<this.stackBody.size(); i++) {
					
					T thisElement = this.stackBody.get(i);;
					T otherElement = otherStack.stackBody.get(i);
					if(thisElement != otherElement) {
						
						return false;
					
					}
					
				}
				
				
			return true;
			
		}
			
			
			
		
		
		}
		return false;
	}
	
	public int size() {
		
		int count = 0;
		while(!isEmpty()) {
			pop();
			count++;
		}
		return count;
	}

}

