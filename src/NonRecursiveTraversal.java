import java.util.*;
public class NonRecursiveTraversal {
private List<Integer> inorder(TreeNode root){
	//������
	List<Integer>list=new ArrayList<Integer>();
	if(root==null)return list;
	Stack<TreeNode>stack=new Stack<TreeNode>();	
	
	TreeNode cur=root;
	while(cur!=null||!stack.isEmpty()) {
		while(cur!=null) {stack.push(cur);
		cur=cur.left;
	}
		//���Ա�֤��ʱ�ǿ�
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
		//��ǰ�治ͬ��ʱ����Ϊ��
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
	//�������ٷ���
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
