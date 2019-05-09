
import java.util.*;
public class Q99 {
	 public void recoverTree(TreeNode root) {
	        TreeNode first=null,second=null;
	        Stack<TreeNode>stack=new Stack<TreeNode>();
	        List<Integer>list=new ArrayList<Integer>();
		       TreeNode cur=root;
		       while(cur!=null||!stack.isEmpty()) {
		    	   while(cur!=null) {
		    		   stack.push(cur);		    		  
		    		   cur=cur.left;
		    	   }
		    	   cur=stack.pop();
		    	   
		    	   //�˴���ӷ��ʴ���
		    	  list.add(cur.val);
		    	   
		    	   cur=cur.right;
		       }
		       int num1=-1,num2=-1;
		       boolean found=false;
		       for(int i=0;i<list.size();i++) {
		    	   if(i<list.size()-1&&list.get(i)>list.get(i+1)&&!found) {found=true;num1=i;}
		       if(i>=1&&list.get(i)<list.get(i-1))num2=i;}
		       
		       cur=root;int count=0;
		       while(cur!=null||!stack.isEmpty()) {
		    	   while(cur!=null) {
		    		   stack.push(cur);		    		  
		    		   cur=cur.left;
		    	   }
		    	   cur=stack.pop();
		    	   if(count==num1)first=cur;
		    	   if(count==num2)second=cur;
		    	   count++;
		    	   
		    	   //�˴���ӷ��ʴ���
		    	  list.add(cur.val);
		    	   
		    	   cur=cur.right;
		       }
		       
		       
		       if(first!=null&&second!=null) {
		    	   int temp=first.val;
		    	   first.val=second.val;		    	   
		    	   second.val=temp;
		    	   
		       }

	    }
	 public void printBST(TreeNode root) {
		 
	       Stack<TreeNode>stack=new Stack<TreeNode>();
	       TreeNode cur=root;
	       while(cur!=null||!stack.isEmpty()) {
	    	   while(cur!=null) {
	    		   stack.push(cur);cur=cur.left;
	    	   }
	    	   cur=stack.pop();
	    	  System.out.print(cur.val+" ");
	    	   cur=cur.right;
	       }

	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeNode root=new TreeNode(1);
			root.left=new TreeNode(3);
			//root.right=new TreeNode(4);
			//root.right.left=new TreeNode(2);
			root.left.right=new TreeNode(2);
			new Q99().recoverTree(root);
			new Q99().printBST(root);
			System.out.println();
	}

}
