#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
using namespace std;

void generate (vector<pair<string, string>> &tickets,vector<vector<string>> &totalVector,
	vector<string>&currentVector,bool* used,int toGo,string lastStep){
		if(toGo==0){
			vector<string>temp(currentVector);
			totalVector.push_back(temp);
			return;
		}
		for(int i=0;i<tickets.size();i++)
		if(!used[i]&&tickets[i].first==lastStep){
			used[i]=true;
			currentVector.push_back(tickets[i].second);
			
			generate(tickets,totalVector,currentVector,used,toGo-1,tickets[i].second);
			used[i]=false;
			currentVector.pop_back();
			
		}
	}
vector<string> findItinerary(vector<pair<string, string>> tickets) {
        vector<vector<string>> totalVector;
        vector<string>currentVector;
        currentVector.push_back("JFK");
        bool*used=new bool[tickets.size()];
        for(int i=0;i<tickets.size();i++)used[i]=false;
        string lastStep="JFK";
        int toGo=tickets.size();
        generate(tickets,totalVector,currentVector,used,toGo,lastStep);
        delete[]used;
        vector<string>ans=totalVector[0];
        printf("%d",totalVector.size());
        /*
        for(int i=0;i<totalVector.size();i++){
        	for(int j=0;j<totalVector[i].size();j++)
        	cout<<totalVector[i][j]<<" ";
        	cout<<endl;
		}
        */
        for(int i=1;i<totalVector.size();i++)
        if(ans>totalVector[i])ans=totalVector[i];
        return ans;
    }
    

int main(){
	vector<pair<string, string>> tickets=
	
	{make_pair("JFK","SFO"), make_pair("JFK","ATL"),
	make_pair("SFO","ATL"),make_pair("ATL","JFK"),make_pair("ATL","SFO")
	};
	vector<string> iternary=findItinerary(tickets);
	for(int i=0;i<iternary.size();i++)	cout<<iternary[i]<<endl;
	vector<string>vec1={"JFK","ATL","JFK","SFO","ATL","SFO"};
	vector<string>vec2={"JFK","SFO","ATL","JFK","ATL","SFO"};
	//printf("%d",vec1<vec2);
}

