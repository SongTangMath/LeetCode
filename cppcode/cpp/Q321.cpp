#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>

//#define min(a,b) (a<b?a:b)
//#define max(a,b) (a>b?a:b)
using namespace std;

class Solution {
public:

vector<int> maxNumber(vector<int>& nums1, vector<int>& nums2, int k) {
  vector<int>ans;
  //i+j=k,0<=i<=nums1.size(),0<=j=k-i<=nums2.size()
  for(int i=max(0,k-(int)nums2.size());i<=min((int)nums1.size(),k);i++){
  	int j=k-i;
  	ans=max(ans,merge(maxNumber(nums1,i),maxNumber(nums2,j)));
  }
  return ans;
}

vector<int> maxNumber(vector<int> nums, int k) {
    int drop = nums.size() - k;
    vector<int> out;
    for (int num : nums) {
        while (drop && out.size() && out.back() < num) {
            out.pop_back();
            drop--;
        }
        out.push_back(num);
    }
    out.resize(k);
    return out;
}

vector<int> merge(vector<int> nums1, vector<int> nums2) {
    vector<int> out;
  
  while(nums1.size()+nums2.size()){
  if(nums1>=nums2)
  {
  	out.push_back(nums1.front());
  	nums1.erase(nums1.begin(),nums1.begin()+1);
  }
  else{
  	out.push_back(nums2.front());
  	nums2.erase(nums2.begin(),nums2.begin()+1);
  }
  
  }
  return out;
}
};
int main(){
	int nums1[] = {2,5,6,4,4,0},nums2[] = {7,3,8,0,6,5,7,6,2};
	
	int nums3[]={6,4,7,8,6,5,5,3,1,7,4,9,9,5,9,6,1,7,1,3,6,3,0,8,2,1,8,0,0,7,3,9,
	3,1,3,7,5,9,4,3,5,8,1,9,5,6,5,7,8,6,6,2,0,9,7,1,2,1,7,0,6,8,5,8,1,6,1,5,8,4};
int nums4[]={3,0,0,1,4,3,4,0,8,5,9,1,5,9,4,4,4,8,0,5,5,8,4,9,8,3,1,3,4,8,9,4,9,9,6,6,2,8,9,0,8,
0,0,0,1,4,8,9,7,6,2,1,8,7,0,6,4,1,8,1,3,2,4,5,7,7,0,4,8,4};

	vector<int> num1Vec(nums1,nums1+sizeof(nums1)/sizeof(int));
	vector<int> num2Vec(nums2,nums2+sizeof(nums2)/sizeof(int));
	Solution sol;
	vector<int> ans= sol.maxNumber(num1Vec,num2Vec,15);
	//vector<int>nums3(num1Vec.begin()+2,num1Vec.end());
	//printf("%d\n",nums3.size());
	for(int i=0;i<ans.size();i++)	printf("%d",ans[i]);
	return 0;
}

void printVector(vector<int> a){
	for(int i=0;i<a.size();i++)
	printf("%d",a[i]);
	printf("\n");
}
