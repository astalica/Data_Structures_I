package Lab08;

import java.util.*;

public class Inventory {
    ArrayList<Part> inventoryList = new ArrayList<Part>();



// need to double check this logic its 4am and i shot
    public void sortedInsert(Part part) {

    	
       // if (inventoryList.size() != 0) {
        //  for (int i = 0; i <= inventoryList.size()-1; i++)
               // if (part.compareTo(inventoryList.get(i)) > 0)
                  //  inventoryList.add(i-1, part);
                
                	
        //}else {
        	//inventoryList.add(part);
       // }
          if(inventoryList.size() != 0) {
        	  
        	  if(part.compareTo(inventoryList.get(0)) < 0) {
        		  inventoryList.add(0, part);
        	  }else if(part.compareTo(inventoryList.get(inventoryList.size()-1)) > 0) {
        		  inventoryList.add(inventoryList.size(),part);
        	  }else {
        		  int i = 0;
        		  while(part.compareTo(inventoryList.get(i)) > 0) {
        			  i++;
        		  }
        		  inventoryList.add(i,part);
        	  }
        	  
          }else {
        	  inventoryList.add(part);
          }
         
    }

    public double totalInventoryValue() {
        double total = 0;

        for(int i = 0; i <= inventoryList.size() - 1; i++)
            total += inventoryList.get(i).getValue();

        return total;
    }

    public String searchByColor(String s) {
        String res = "";
        for(int i = 0; i <= inventoryList.size() - 1; i++) {
            if(s.compareToIgnoreCase(inventoryList.get(i).getColor()) == 0)
               res += inventoryList.get(i).toString();
        }
        return res;
    }

    public String heaviestPart() {
        int hP = 0;
        double temp = inventoryList.get(0).getWeight();

        //Bubble Compare
        for(int i = 1; i <= inventoryList.size() - 1; i++) {
            if (inventoryList.get(i).getWeight() > temp) {
                hP = i;
                temp = inventoryList.get(i).getWeight();
            }
        }

        return inventoryList.get(hP).toString();
    }

    public int numPartsInStock(String s) {
        int res = 0;

        for(int i = 0; i <= inventoryList.size() - 1; i++)
            if(s.equalsIgnoreCase((inventoryList.get(i).getPartName())))
                res += inventoryList.get(i).getAmountInStock();

        return res;
    }

    public String reOrderList() {
        ArrayList<Part> reOrderedList = new ArrayList<Part>();

        for (int i = 0; i <= inventoryList.size() - 1; i++)
            if(inventoryList.get(i).getAmountInStock() < inventoryList.get(i).getReorderPoint())
                reOrderedList.add(inventoryList.get(i));

        return reOrderedList.toString();
    }

}