import java.util.*;
public class Q380 {
private HashMap<Integer,Integer>map;
private ArrayList<Integer>list;
	private java.util.Random  random;
	
	 public Q380() {
		 map=new HashMap<Integer,Integer>();
		 list=new ArrayList<Integer>();
		 random=new java.util.Random ();
	    }
	    
	    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	    public boolean insert(int val) {
	        if(map.containsKey(val))return false;
	        list.add(val);
	        map.put(val,list.size()-1);
	        return true;
	    }
	    
	    /** Removes a value from the set. Returns true if the set contained the specified element. */
	    public boolean remove(int val) {
	        if(!map.containsKey(val))return false;
	        int index=map.get(val);
	        if(index==list.size()-1) {
	        	map.remove(val);
	        	int len=list.size();
	        	list.remove(len-1);
	        }
	        else {
	        	map.put(list.get(list.size()-1), index);
	        	map.remove(val);
	        	list.set(index, list.get(list.size()-1));
	        	int len=list.size();
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
		Q380 randomSet = new Q380();
		/*
		// Inserts 1 to the set. Returns true as 1 was inserted successfully.
		System.out.println(randomSet.insert(1));

		// Returns false as 2 does not exist in the set.
		System.out.println(randomSet.remove(2));

		// Inserts 2 to the set, returns true. Set now contains [1,2].
		System.out.println(randomSet.insert(2));

		// getRandom should return either 1 or 2 randomly.
		System.out.println(randomSet.getRandom());

		// Removes 1 from the set, returns true. Set now contains [2].
		System.out.println(randomSet.remove(1));

		// 2 was already in the set, so return false.
		System.out.println(randomSet.insert(2));

		// Since 2 is the only number in the set, getRandom always return 2.
		System.out.println(randomSet.getRandom());
		*/
		System.out.println(randomSet.insert(0));
		System.out.println(randomSet.insert(1));
		System.out.println(randomSet.insert(2));
		System.out.println(randomSet.insert(3));
		System.out.println(randomSet.insert(4));
		System.out.println(randomSet.insert(5));
		
		System.out.println(randomSet.insert(-1));
		System.out.println(randomSet.insert(-2));
		System.out.println(randomSet.insert(-3));
		System.out.println(randomSet.insert(-4));
		System.out.println(randomSet.insert(-5));
		
		System.out.println(randomSet.remove(0));
		System.out.println(randomSet.remove(1));
		System.out.println(randomSet.remove(2));
		System.out.println(randomSet.remove(3));
		System.out.println(randomSet.remove(4));
		System.out.println(randomSet.remove(5));
		
		System.out.println(randomSet.remove(-1));
		System.out.println(randomSet.remove(-2));
		System.out.println(randomSet.remove(-3));
		System.out.println(randomSet.remove(-4));
		System.out.println(randomSet.remove(-5));
		
		//System.out.println(randomSet.getRandom());
		System.out.println(randomSet.remove(0));
		
	}

}
