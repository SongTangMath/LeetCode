#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<limits.h>
#include<map>
#include <sstream>
using namespace std;
 bool isSubsequence(string s, string t) {
        if(s.length()==0)return true;
        if(t.length()<s.length())return false;
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
        	while(j<t.length()&&s[i]!=t[j])j++;
        	if(j==t.length())return false;
        	else{
        		i++;
        		j++;
        		if(i==s.length())return true;
			}
		}
    }
    
    string decodeString(string s) {
    	bool needExpansion=false;
    	int pos1=-1;
       for(int i=0;i<s.length();i++)
       
       if('0'<=s[i]&&s[i]<='9'){
       	needExpansion=true;
       	pos1=i;
       	break;
	   }
	   if(!needExpansion)return s;
	   int pos2=pos1;
	   while(pos2+1<s.length()&&'0'<=s[pos2+1]&&s[pos2+1]<='9')pos2++;
	   int pos3=-1;
	   int countLeft=1;
	   for(int i=pos2+2;i<s.length();i++){
	   	char ch=s[i];
	   		if(s[i]=='[')countLeft++;
	   		else if(s[i]==']')countLeft--;
	   		if(countLeft==0){
	   			pos3=i;
	   			break;
			   }
	   }
	   string part1=s.substr(0,pos1);
	   string part2=s.substr(pos1,pos2+1-pos1);
	   string part3=s.substr(pos2+2,pos3-pos2-2);
	   string part4=s.substr(pos3+1,s.length()-pos3-1);
	   string ans=part1;
	   //cout<<part1<<endl<<part2<<endl<<part3<<endl<<part4<<endl;
	   int times=-1;
	   stringstream ss;
	   ss<<part2;
	   ss>>times;
	   part3=decodeString(part3);
	   for(int i=0;i<times;i++)ans+=part3;
	   //cout<<ans<<endl;
	   return ans+decodeString(part4);
    }
    int main(){
    	string s="2[abc]3[cd]ef";
    	cout<<decodeString(s)<<endl;
	} 
