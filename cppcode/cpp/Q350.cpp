#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<limits.h>
#include<map>
using namespace std;
void print(map<int,int>);
  vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        map<int,int>map1,map2,ansMap;
        for(int i=0;i<nums1.size();i++){
        	map<int,int>::iterator it=map1.find(nums1[i]);
        	if(it==map1.end())
        	map1[nums1[i]]=1;
        	else {
        		int value=it->second;
        		map1.erase(it);
        		map1[nums1[i]]=value+1;
			}
		}
		
		for(int i=0;i<nums2.size();i++){
        	map<int,int>::iterator it=map2.find(nums2[i]);
        	if(it==map2.end())
        	map2[nums2[i]]=1;
        	else {
        		int value=it->second;
        		map2.erase(it);
        		map2[nums2[i]]=value+1;
			}
		}
		//print(map1);		printf("\n");
		//print(map2);		printf("\n");
			map<int,int>::iterator it1=map1.begin();
			while(it1!=map1.end()){
				map<int,int>::iterator it2=map2.find(it1->first);
				if(it2!=map2.end())
				ansMap[it1->first]=min(it1->second,it2->second);
				it1++;
			}
			
		vector<int>ans;
			map<int,int>::iterator it=ansMap.begin();
			while(it!=ansMap.end()){
				vector<int>temp(it->second,it->first);
				ans.insert(ans.end(),temp.begin(),temp.end());
				it++;
			}
			return ans;
    }
    void print(map<int,int>map1){
    	map<int,int>::iterator it=map1.begin();
    	while(it!=map1.end())
    	{
    		printf("%d=%d ",it->first,it->second);
    		it++;
		}
	}

int main(){
	vector<int>nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
	vector<int>ans=intersect(nums1,nums2);
	for(int i=0;i<ans.size();i++)
	printf("%d ",ans[i]);
	return 0;
} 
