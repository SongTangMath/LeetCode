

public class Q207 {
	 private boolean hasCycle=false;
	    public boolean canFinish(int numCourses, int[][] prerequisites) {
	        int n=numCourses;
	        hasCycle=false;
	        if(n==0)return true;
	        boolean[]marked=new boolean[n];
	        boolean[]onStack=new boolean[n];
	        for(int i=0;i<n;i++)
	        	if(!marked[i]&&!hasCycle)dfs(numCourses,prerequisites,
	        			marked,onStack,i);
	        return !hasCycle;
	    }
	    private void dfs(int n,int[][] prerequisites,boolean[]marked,
	        boolean[]onStack,int index){
	        marked[index]=true;
	        onStack[index]=true;
	        for(int []temp:prerequisites)
	        {
	            if(temp[0]==index)
	            	if(!marked[temp[1]])            	
	            	             dfs(n,prerequisites,marked,onStack,temp[1]);
	            	else if(onStack[temp[1]])hasCycle=true;
	        }
	            onStack[index]=false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCourses=2;
		int[][]prerequisites= {{1,0}};
		System.out.println(new Q207().canFinish(numCourses, prerequisites));
	}

}
