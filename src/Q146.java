import java.util.*;
public class Q146 {
	private int numOfNodes,capacity;
	private DLinkedNode tail,head;
	private HashMap<Integer,DLinkedNode>map;
	public void printStatus(){
		DLinkedNode node=head;
		while(node!=null) {
			System.out.print("("+node.key+","+node.value+")-->");
			node=node.post;
		}
		System.out.println();
		System.out.print("map.keySet:");
			for(int temp:map.keySet())
				System.out.print(temp+" ");
			System.out.println();
	}
	 public Q146(int capacity) {
		 if(capacity<=0)capacity=1;
		 numOfNodes=0;
	        this.capacity=capacity;
	        tail=null;
	        head=null;
	        map=new HashMap<Integer,DLinkedNode>();
	    }
	    
	 public void removeFirst() {
		 if(head==null)return;
		 map.remove(head.key);
		  if(head==tail) {
			 head=null;
			 tail=null;
		 }
		 
		 head=head.post;
		 head.pre=null;
		 numOfNodes--;
	 }
	 public void removeNodeByKey(int key) {
		 if(!map.containsKey(key))return;
		 DLinkedNode node=map.get(key);
		 DLinkedNode pre=node.pre,post=node.post;
		 if(node==head)head=post;
		 if(node==tail)tail=pre;
		 if(pre!=null)pre.post=post;
		 if(post!=null)post.pre=pre;
		 numOfNodes--;
		 map.remove(key);
	 }
	 public void addNode(int key,int value) {
		 DLinkedNode node=new DLinkedNode(key,value);
		 if(head==null) {
			
			 head=node;
			 tail=node;
			 
			
		 }
		 else {
			 tail.post=node;
			 node.pre=tail;
			 tail=node;
		 }
		 map.put(key,node);
		 numOfNodes++;
	 }
	 public void addNode(DLinkedNode node) {
		 //DLinkedNode node=new DLinkedNode(key,value);
		 if(head==null) {
			
			 head=node;
			 tail=node;
			 map.put(node.key,node);
			 
		 }
		 else {
			 tail.post=node;
			 node.pre=tail;
			 tail=node;
		 }
		 numOfNodes++;
	 }
	    public int get(int key) {
	    	int ans=-1;
			if(!map.containsKey(key))return -1;
			else 
				{				
					 ans= map.get(key).value;
					 this.removeNodeByKey(key);
					 
					 this.addNode(key, ans);
				}
	        return ans;
	    }
	    
	    public void put(int key, int value) {
	        if(!map.containsKey(key)) {
	        	
	        	if(numOfNodes>=capacity) {
	        		removeNodeByKey(this.head.key);
	        		addNode(key,value);
	        	}
	        	else addNode(key,value);
	        		
	        }
	        else {
	        	//map.containsKey(key)-->true
	        	DLinkedNode node=new DLinkedNode(key,value);
	        	
	        	this.removeNodeByKey(key);
	        	map.put(key, node);
	        	this.addNode(node);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q146 cache = new Q146( 2 /* capacity */ );

		cache.put(2, 1);
		cache.printStatus();
		cache.put(2, 2);
		cache.printStatus();
		System.out.println(cache.get(2));      // returns 1
		cache.printStatus();
		cache.put(3, 3);    // evicts key 2
		System.out.println(cache.get(2));        // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		System.out.println(cache.get(1));       // returns -1 (not found)
		System.out.println(cache.get(3));        // returns 3
		System.out.println(cache.get(4));        // returns 4
	}

}
class DLinkedNode{
	public DLinkedNode pre,post;
	public int key,value;
	public DLinkedNode(int key,int value) {
		this.key=key;
		this.value=value;
		this.post=null;
		this.pre=null;
	}
	@Override
	public String toString() {
		return "DLinkedNode [key=" + key + ", value=" + value + "]";
	}
	
	
}