
public class Q307 {
private SegmentTreeNode root=null;
private SegmentTreeNode buildTree(int[]nums,int begin,int end) {
	//递归建树
	SegmentTreeNode node=new SegmentTreeNode(begin,end);
	if(begin==end) {
		node.count=nums[begin];
		return node;
	}
	int mid=node.mid();
	node.left=buildTree(nums,begin,mid);
	node.right=buildTree(nums,mid+1,end);
	node.count=node.left.count+node.right.count;
	return node;
}
public void update(int i, int val) {
    update(root,i,val);
}
public int sumRange(int i, int j) {
    return sumRange(root,i,j);
    
}
private int sumRange(SegmentTreeNode node,int i,int j) {
	if(node==null||j<node.min||i>node.max)return 0;
	if(node.max<=j&&node.min>=i)return node.count;
	return sumRange(node.left,i,j)+sumRange(node.right,i,j);
}
private void update(SegmentTreeNode node,int index,int num) {
	//将nums[index]改为num,更新线段树
	if(node==null||node.max<index||node.min>index)return;
	if(node.max==index&&node.min==index) {
		node.count=num;
		return;
	}
	update(node.left,index,num);
	update(node.right,index,num);
	node.count=node.left.count+node.right.count;
}
public Q307(int[]nums) {
	this.root=buildTree(nums,0,nums.length-1);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]nums= {1,3,5};
				Q307 obj=new Q307(nums);
				System.out.println(obj.root.count);
				obj.update(1, 4);
				System.out.println(obj.sumRange(1, 1));
	}

}
class SegmentTreeNode{
	//min,max为左右端点.因为左右孩子已经用了left,right了这里我们只好改用min,max
	int min,max,count;
	SegmentTreeNode left,right;
	public SegmentTreeNode(int min, int max) {
		super();
		this.count=0;
		this.min = min;
		this.max = max;
	}
	public int mid() {
		return (max-min)/2+min;
	}
}