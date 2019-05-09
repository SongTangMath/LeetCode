import java.util.*;
public class NonRecursiveTraversal {
private List<Integer> inorder(TreeNode root){
	//左中右
	List<Integer>list=new ArrayList<Integer>();
	if(root==null)return list;
	Stack<TreeNode>stack=new Stack<TreeNode>();	
	
	TreeNode cur=root;
	while(cur!=null||!stack.isEmpty()) {
		while(cur!=null) {stack.push(cur);
		cur=cur.left;
	}
		//可以保证此时非空
		cur=stack.pop();
		list.add(cur.val);
		cur=cur.right;
	}
	return list;
}

private List<Integer> preorder(TreeNode root){
	List<Integer>list=new ArrayList<Integer>();
	if(root==null)return list;
	Stack<TreeNode>rights=new Stack<TreeNode>();	
	
	TreeNode cur=root;
	while(cur!=null||!rights.isEmpty()) {
		while(cur!=null) {
			list.add(cur.val);
			if(cur.right!=null)rights.push(cur.right);
		cur=cur.left;
	}
		//与前面不同此时可能为空
		if(!rights.isEmpty())
		cur=rights.pop();
		
	}
	return list;
}
private List<Integer>reverseList(List<Integer> list){
	List<Integer> list1=new ArrayList<Integer>();
	int n=list.size();
	for(int i=0;i<n;i++)list1.add(list.get(n-i));
	return list1;
}
private List<Integer> postorder(TreeNode root){
	//中右左再反序
	List<Integer>list=new ArrayList<Integer>();
	if(root==null)return list;
	Stack<TreeNode>stack=new Stack<TreeNode>();	
	
	TreeNode cur=root;
	while(cur!=null||!stack.isEmpty()) {
		while(cur!=null) {stack.push(cur);
		cur=cur.right;
	}
		cur=stack.pop();
		list.add(cur.val);
		cur=cur.left;
	}
	return reverseList(list);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
