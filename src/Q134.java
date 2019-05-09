

public class Q134 {
	
	 public int canCompleteCircuit(int[] gas, int[] cost) {
		int []gas1=new int[gas.length*2];
		int []cost1=new int[gas.length*2];
		for(int i=0;i<gas.length;i++) {
			gas1[i]=gas[i];cost1[i]=cost[i];
		}
		for(int i=gas.length;i<gas1.length;i++) {
			gas1[i]=gas[i-gas.length];
			cost1[i]=cost[i-gas.length];
		}
		for(int i=0;i<gas.length;) {
			int remain=0,pos=i,count=0;
			while(remain+gas1[pos]>=cost1[pos]) {
				
				remain+=(gas1[pos]-cost1[pos]);
				pos++;count++;
				if(count==gas.length)return i;
				
			}
			i=pos+1;
		}
		return -1;
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]gas  = {2,3,4},
				cost = {3,4,3};
		System.out.println(new Q134().canCompleteCircuit(gas, cost));
	}

}
