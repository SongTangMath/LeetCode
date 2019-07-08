#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<string> 
using namespace std;
int combinationSum4(vector<int>& nums, int target) {
		int n=nums.size();
        vector<int> ans(target+1,-1);
        ans[0]=1;
        sort(nums.begin(),nums.end());
        for(int i=1;i<=target;i++){
        	int temp=0;
        	 for(int j=0;j<n;j++)
        if(i>=nums[j]&&ans[i-nums[j]]!=-1)temp+=ans[i-nums[j]];
        if(temp!=0)ans[i]=temp;
		}
		//for(int i=0;i<=target;i++)printf("%d ",ans[i]);
       return ans[target]==-1?0:ans[target];
        
    }
int main(){
	vector<int>nums={3,33,333};
	int target=10000;
	printf("%d",combinationSum4(nums,target));
}
