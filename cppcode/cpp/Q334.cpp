#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<string> 
#include<limits>
using namespace std;

bool increasingTriplet(vector<int>& nums) {
       int first=INT_MAX,second=INT_MAX;
       for(int i=0;i<nums.size();i++){
       	if(nums[i]>second)return true;
       	else if(nums[i]>first)second=nums[i];
       	else first=nums[i];
	   }
    return false;
    }
    
int main(){
	vector<int>nums={5,4,3,2,1};
	printf("%d",increasingTriplet(nums));
	//printf("%d",INT_MAX);
}
