package linkedlist;
/**
 * A quick demo of how to implement a set using a singly-linked list
 * @author trao
 *
 */
    public class LinkedSet<T> {
    //---------------------------------------------------------------
    //The body of the list is held in a singly-linked list
     SLList<T> body;
	
	
    //----------------------------------------------------------------
    // Constructor creates a new singly-linked list for the body
    public LinkedSet()
    {
    	body = new SLList<T>();
    }
    
    //----------------------------------------------------------------
    // member method simply delegates the membership testing to SLList
    public boolean member(T elm)
    {
	return body.member(elm);
    }
	
    //----------------------------------------------------------------
    // Inserts a new element in to the set, if it is not already there
    public void insert(T str)
    {
	// Write your code here:
	// if str is NOT a member of this set, insert str into this – i.e.
	// use the methods in SLList class above to check if str is already
	// in ‘body’ and if not use the appropriate method to insert it at
	// the end or at the front (order in a set does not matter)
    	
    	if(body.isEmpty()) {
    		body.insertAt(str,0);
    	}else {
    		
	    	boolean present = false;
	    	SLNode<T> thisNode = this.body.getHead();

	    	for(int i = 0; i < this.body.size(); i++) {
	    		
	    		if(thisNode.getInfo() == str) {
	    			present = true;
	    		}
	    		thisNode = thisNode.getNext();
	    		
	    	}
	    	if(!present) {
	    		body.insertAt(str,0);
	    	}
    	}

    }
	
    //----------------------------------------------------------------
    // Simple printing method, delegates the job to SLList
    public void printSet()
    {
	System.out.println (body.toString());
    }
	
	
	
    //----------------------------------------------------------------
    // builds a set by inserting all elements of an array
    public void buildSet(T[] elements)
    {
	 // Write your code here
	 //Insert all elements one by one. CALL THE insert()METHOD YOU WROTE
	 //ABOVE IN A LOOP TO DO THIS JOB
    	for(T ele : elements) {
    		this.insert(ele);
    	}
    }
	
     //-------------------------------------------------------------- 
     // Returns the union of this set and the other set without
     // modifying this set or the other set
     public LinkedSet<T> union(LinkedSet<T> otherSet)
     {
		
		LinkedSet<T> result = new LinkedSet<T>();
		SLList<T> resultBody = result.body;
		SLList<T> otherBody = otherSet.body;
		
		// First insert all the elements into the set called result
		// Hint:
		// Use SLList methods on body and resultBody
		// to write this code 
		
		//insert all elements from this list
		SLNode thisNode = body.getHead();
		for(int i = 0; i < body.size(); i++) {
			result.insert((T)thisNode.getInfo());
			thisNode = thisNode.getNext();
		}

		// Now insert all the elements of the other set that 
               // are not in the set called result to write this code
		// Use SLList methods on resultBody and otherBody to do this
		
		//use same loop from above with other list
		//since insert method already does not insert
		//duplicate elements, we can just call insert
		SLNode otherNode = otherBody.getHead();
		for(int i = 0; i < otherBody.size(); i++) {
			result.insert((T)otherNode.getInfo());
			otherNode = otherNode.getNext();
		}

		return result;
     }
	
     //--------------------------------------------------------------
     // Returns the intersection of this set and the other set 
     // without modifying this set or the other set
     public LinkedSet<T> intersection(LinkedSet<T> otherSet)
     {
		LinkedSet<T> result = new LinkedSet<T>();
		SLList<T> resultBody = result.body;
		SLList<T> otherBody = otherSet.body;

		// For each element of this set, if it is also a 
		// member of otherSet, then insert it into result
		// Hint:
		// Use SLList methods on body, otherBody and resultBody
		// to write this code. It is on similar lines to union()
		// in the sense that you will have to use methods from SLList
		// but the algorithm is slightly different
		
		//Establish first nodes
		SLNode<T> thisNode = body.getHead();
		SLNode<T> otherNode = otherBody.getHead();
		//loop over each node in this list
		for(int i = 0; i < body.size(); i++) {
			
			//for each node in this list, compare to each node in other list
			for(int j = 0; j < otherBody.size(); j++) {
				
				//if two nodes have the same info, insert to result list
				if(thisNode.getInfo() == otherNode.getInfo()) {
					
					result.insert((T)thisNode.getInfo());
					
				}
				otherNode = otherNode.getNext();
			}
			
			thisNode = thisNode.getNext();
			otherNode = otherBody.getHead(); //reset otherNode to first node
			
		}
		
		return result;
		
      }

	
}

