#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<limits.h>
class Solution {
public:
    int coinChange(std::vector<int>& coins, int amount) {
    	int n=coins.size();
        int* dp=new int[amount+1];
        std::fill(dp,dp+amount+1,-1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
        	dp[i]=INT_MAX;
        	for(int j:coins){
        	if(j<=i&&dp[i-j]!=-1)
        	dp[i]=std::min(dp[i],1+dp[i-j]);
        	
		}
		if(dp[i]==INT_MAX)dp[i]=-1;
		}
		int ret=dp[amount];
		delete[]dp;
		return ret;
        
    }
};

int main(){
	std::vector<int>a;
	a.push_back(2);
	a.push_back(5);
	a.push_back(10);
	a.push_back(1);
	Solution sol;
	printf("%d",sol.coinChange(a,27));
	return 0;
} 
