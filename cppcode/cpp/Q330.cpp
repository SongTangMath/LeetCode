#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>

using namespace std;
class Solution {
public:
    int minPatches(vector<int>& nums, int n) {
        long long sum=0,count=0;
        for(int i=0;i<nums.size();){
        	if(sum>=n)return count;
        	if(nums[i]<=sum+1){
        		sum+=nums[i];
        		i++;
			}
			else{
				sum=2*sum+1;
				count++;				
			}
		}
		if(sum>=n)return count;
		while(sum<n){
			sum=2*sum+1;
			count++;
		}
		return count;
    }
};
int main(){
	vector<int>nums={1,2,31,33};int n=2147483647;
	Solution sol;
	printf("%d",sol.minPatches(nums,n));
	return 0;
} 
