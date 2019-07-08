#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<limits.h>
#include<map>
#include<time.h>
using namespace std;
class Solution {
public:
    vector<int> original,ans;
    Solution(vector<int>& nums) {
        ans=nums;
        original=nums;
        srand((unsigned)time(NULL)); 
    }
    
    /** Resets the array to its original configuration and return it. */
    vector<int> reset() {
       return original;
    }
    
    /** Returns a random shuffling of the array. */
    vector<int> shuffle() {
        int n=ans.size();
        
        for(int i=0;i<n-1;i++) {
                int index=rand()%(n-i)+i;
              swap(ans[i],ans[index]);
            }
        return ans;
    }
};
int main(){
	vector<int>nums={1,2,3};
	Solution* obj = new Solution(nums);
  vector<int> param_1 = obj->reset();
  vector<int> param_2 = obj->shuffle();
  for(int temp:param_2)printf("%d ",temp);
  vector<int> a={1,2,3};
 
  }

