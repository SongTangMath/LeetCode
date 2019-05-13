import java.util.ArrayList;
import java.util.*;

public class Q381 {
	private HashMap<Integer,ArrayList<Integer>>map;
	private ArrayList<Integer>list;
		private java.util.Random  random;
		
		 public Q381() {
			 map=new HashMap<Integer,ArrayList<Integer>> ();
			 list=new ArrayList<Integer>();
			 random=new java.util.Random ();
		    }
		    
		    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
		    public boolean insert(int val) {
		    	boolean flag=true;
		        if(!map.containsKey(val))		       
		        	map.put(val, new ArrayList<Integer>());		        
		        else flag= false;
		        list.add(val);
		        map.get(val).add(list.size()-1);
		        return flag;
		    }
		    
		    /** Removes a value from the set. Returns true if the set contained the specified element. */
		    public boolean remove(int val) {
		        if(!map.containsKey(val)||map.get(val).isEmpty())return false;
		        List<Integer>indices=map.get(val);
		        int index=indices.get(indices.size()-1);
		        //last position of val
		        if(index==list.size()-1) {
		        	
		        	
		        	int len=list.size();
		        	list.remove(len-1);
		        	len=indices.size();
		        	indices.remove(len-1);
		        }
		        else {
		        	int val1=list.get(list.size()-1);
		        	 List<Integer>indices1=map.get(val1);
		        	 //set the last number in indices1 to indices.get(indices.size()-1)
		        	 //remove the last number in indices
		        	 indices1.set(indices1.size()-1, indices.get(indices.size()-1));
		        	 Collections.sort(indices1);
		        	int len=indices.size();
		        	indices.remove(len-1);
		        	list.set(index, val1);
		        	len=list.size();
		        	list.remove(len-1);
		        }
		        return true;
		    }
		    
		    /** Get a random element from the set. */
		    public int getRandom() {
		        int index=random.nextInt(list.size());
		        return list.get(index);
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Init an empty collection.
		Q381 collection = new Q381();
		/*
		// Inserts 1 to the collection. Returns true as the collection did not contain 1.
		System.out.println(collection.insert(1));

		// Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
		System.out.println(collection.insert(1));

		// Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
		System.out.println(collection.insert(2));

		// getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
		System.out.println(collection.getRandom());

		// Removes 1 from the collection, returns true. Collection now contains [1,2].
		System.out.println(collection.remove(1));

		// getRandom should return 1 and 2 both equally likely.
		System.out.println(collection.getRandom());
		*/
		System.out.println(collection.insert(0));
		System.out.println(collection.insert(1));
		System.out.println(collection.insert(2));
		System.out.println(collection.insert(3));
		System.out.println(collection.insert(3));
		
		System.out.println(collection.remove(2));
		System.out.println(collection.remove(3));
		System.out.println(collection.remove(0));
		//System.out.println(collection.remove(2));
		//System.out.println(collection.remove(2));
	}

}
