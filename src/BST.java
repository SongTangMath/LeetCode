

public class BST <Key extends Comparable<Key>,Value>{
	
	private class Node{
		private Key key;
		private Value value;
		private Node lChild,rChild;
		private int numOfNodes;
		public Node(Key key,Value value,int numOfNodes) {
			this.key=key;
			this.value=value;
			this.numOfNodes=numOfNodes;
		}
	}
	private Node root;
	private int size() {
		return size(root);
	}
	private int size(Node node) {
		if(node==null)return 0;
		else return node.numOfNodes;
	}
	public Value get(Key key) {
		return get(key,root);
	}
public Value get(Key key,Node node) {
		if(node==null)return null;
		 if(key.compareTo(node.key)>0)
			return get(key,node.rChild);
		 else if(key.compareTo(node.key)<0)
				return get(key,node.lChild);
		 else return node.value;
					
	}

private void put(Key key,Value value) {
	//如以key为键的节点已经存在则更新值(所以我们的二叉查找树各节点key互异)
	//不存在则挂上这个节点
	put(root,key,value);
}
private Node put(Node node,Key key,Value value) {
	if(node==null)return new Node(key,value,1);
	if(key.compareTo(node.key)>0)
		return put(node.rChild,key,value);
	else if(key.compareTo(node.key)<0)
		return put(node.lChild,key,value);
	else {node.value=value;node.numOfNodes=size(node.lChild)+size(node.rChild)+1;
			return node;}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
