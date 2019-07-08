#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<limits.h>
#include<stack> 

using namespace std;
class Solution {
public:
    void wiggleSort(vector<int>& nums) {
        int n=nums.size();
       vector<int>b(nums);
       sort(b.begin(),b.end());
       //for(int i=0;i<b.size();i++)	printf("%d ",b[i]);
       nums.clear();
       vector<int> small,big;
       int mid=-1;
       if(n%2==0)mid=n/2;
       else mid=n/2+1;
       for(int i=0;i<mid;i++)small.push_back(b[i]);
       for(int i=mid;i<n;i++)big.push_back(b[i]);
       nums.clear();
       while(small.size()+big.size()){
       	
       		nums.push_back(small.back());
       		small.erase(small.end()-1,small.end());
       	if(!big.empty()){
       				nums.push_back(big.back());
       		big.erase(big.end()-1,big.end());
			   
	   }
    }}
};

int main(){
	int nums[]={1,2,3,5,5,5,6,7,8};
	std::vector<int>a(nums,nums+sizeof(nums)/sizeof(int));
	//printf("%d\n",a.size());
	Solution sol;sol.wiggleSort(a);
	for(int i=0;i<a.size();i++)
	printf("%d ",a[i]);
	return 0;
} 
