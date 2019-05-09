
import java.util.*;
public class Q113 {
public List<List<Integer>> pathSum(TreeNode root, int sum) {
	List<List<Integer>> totalList=new ArrayList<List<Integer>>();
	if(root==null)return totalList;
	List<Integer>list=new ArrayList<Integer>();
	 generate(totalList,list,root,sum);
	 return totalList;
    }
	private void generate(List<List<Integer>>totalList,
			List<Integer>list,TreeNode root,int sum) {
		  
	        if(root.left==null&&root.right==null) {
	            
	            if(root.val==sum)
	            { 
	            	list.add(root.val);
	            	
	            	totalList.add(new ArrayList<Integer>(list));
	            	list.remove(list.size()-1);
	            return;
	            
	            }
	            }
	            
	        
	        if(root.left!=null) {
	        	list.add(root.val);
	        	generate(totalList,list,root.left,sum-root.val);
	        	list.remove(list.size()-1);
	        }
	        if(root.right!=null) {
	        	list.add(root.val);
	        	generate(totalList,list,root.right,sum-root.val);
	        	list.remove(list.size()-1);
	        }

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
