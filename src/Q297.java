import java.util.*;
public class Q297 {
	
	  public String serialize(TreeNode root) {
	        if(root==null)return "#";
	        return root.val+"!"+serialize(root.left)+"!"+serialize(root.right);
	    }

	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	        String[]strs=data.split("!");
	        LinkedList<String>list=new LinkedList<String>();
	        for(int i=0;i<strs.length;i++)list.add(strs[i]);
	        return generate(list);
	        
	    }
	    TreeNode generate(LinkedList<String>list) {
	    	String temp=list.pollFirst();
	    	if(temp.equals("#"))return null;
	    	TreeNode root=new TreeNode(Integer.parseInt(temp));
	    	root.left=generate(list);
	    	root.right=generate(list);
	    	return root;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(10);
		
		root.left.left=new TreeNode(9);
		root.left.right=new TreeNode(10);
		String serial=new Q297().serialize(root);	
		System.out.print(serial);
		
	}

}
