#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<string> 

std::vector<std::string> split(const std::string &str,const std::string &pattern){
	std::vector<std::string> ans;
	if(str.length()==0)return ans;
	int index=0;
	while(index<str.length()){
		size_t pos=str.find(pattern,index);
		if(pos==std::string::npos){
			ans.push_back(str.substr(index));
			return ans;
		}
		else{
			ans.push_back(str.substr(index,pos-index));
			index=pos+pattern.length();
		}
		
	}
	return ans;
}
using namespace std;
bool isValidSerialization(string preorder) {
	if(preorder.length()==0)return false;
        std::vector<std::string> ans=split(preorder,",");
        int countSharp=0,countNumber=0;
        int n=ans.size();
        if(ans[n-1]!="#")return false;
        countNumber=0;
        for(int i=0;i<n;i++)
        {
        	if(ans[i]=="#")countSharp++;
        	else countNumber++;
        	if(i<n-1&&countSharp>countNumber)return false;
		}
		return countSharp==countNumber+1;
    }
int main(){
	std::string s="Hello  World",t="uv";
	std::vector<std::string>ans=split(s,t);
	//for(int i=0;i<ans.size();i++)	std::cout<<ans[i]<<std::endl;
	string preorder="#";
	printf("%d",isValidSerialization(preorder));
	
}
