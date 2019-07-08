#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<limits.h>
#include<map>
using namespace std;

 bool canConstruct(string ransomNote, string magazine) {
        map<char,int>map1,map2;
        map<char,int>::iterator it1,it2;
        for(int i=0;i<ransomNote.size();i++){
        	it1=map1.find(ransomNote[i]);
        	if(it1==map1.end())map1[ransomNote[i]]=1;
        	else {
        		int val=it1->second;
        		map1[ransomNote[i]]=val+1;
			}
        	
		}
		
		for(int i=0;i<magazine.size();i++){
        	it2=map2.find(magazine[i]);
        	if(it2==map2.end())map2[magazine[i]]=1;
        	else {
        		int val=it2->second;
        		map2[magazine[i]]=val+1;
			}
        	
		}
		it1=map1.begin();
		while(it1!=map1.end()){
			it2=map2.find(it1->first);
			if(it2==map2.end()||it2->second<it1->second)return false;
			it1++;
		}
		return true;
		
    }
int main(){
	map<int,int>map2;
	map<int,int>::iterator it=map2.find(6);
	printf("%d");
}
