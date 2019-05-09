

public class Q210 {
	 public int[] findOrder(int numCourses, int[][] prerequisites) {
		 if(prerequisites.length==0) {
			 int[]order=new int[numCourses];
			 for(int i=0;i<order.length;i++)order[i]=i;
					 return order;
		 }
		 
	        boolean[][]graph=new boolean[numCourses][numCourses];
	        for(int[]temp:prerequisites) {
	        	int a=temp[0];
	        	int b=temp[1];
	        	graph[a][b]=true;
	        	//��ʾb��aΪ�ȵ���.
	        	//graph[i][j]��ʾjΪi�ȵ���.��i�ſ�û���ȵ���
	        	//iff graph[i][j]ȫΪfalse
	        }
	        int[]order=new int[numCourses];
	        int finished=0;
	        boolean[]completed=new boolean[numCourses];
	        while(finished<numCourses) {
	        	boolean foundNext=false;
	        	for(int i=0;i<numCourses&&!foundNext;i++) {
	        		if(completed[i])continue;
	        		boolean canBechosen=true;
	        		for(int j=0;j<numCourses;j++)
	        			if(graph[i][j])canBechosen=false;
	        		if(!canBechosen)continue;
	        		foundNext=true;
	        		for(int j=0;j<numCourses;j++)
	        			graph[j][i]=false;
	        		//���пγ̲�����Ҫ�γ�i��Ϊ�ȵ���
	        		completed[i]=true;
	        		order[finished]=i;
	        		finished++;
	        	}
	        	if(!foundNext)return new int[0];
	        }
	        return order;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCourses=4;
				int[][]prerequisites= {{1,0},{2,0},{3,1},{3,2}};
				int[]order=new Q210().findOrder(numCourses, prerequisites);
				for(int temp:order)
		System.out.println(temp);
	}

}
