#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<map>
#include<stack>
#include<set>
using namespace std;



void visit(map<string, multiset<string>> &targets,vector<string> &route,string airport) {
    while (targets[airport].size()) {
        string next = *targets[airport].begin();
        targets[airport].erase(targets[airport].begin());
        visit(targets,route,next);
    }
    route.push_back(airport);
    //for(int i=0;i<route.size();i++)	cout<<route[i];
    //cout<<endl;
}


vector<string> findItinerary(vector<pair<string, string>> tickets) {
	map<string, multiset<string>> targets;
	vector<string> route;
    for (auto ticket : tickets)
        targets[ticket.first].insert(ticket.second);
        //printf("%d",targets.size());
    visit(targets,route,"JFK");
    return vector<string>(route.rbegin(), route.rend());
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
