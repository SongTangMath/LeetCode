#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<string> 
#include<queue>
using namespace std;

class node{
	public:
	int row,col,val;
	   bool operator< (const node& b) const{
		return this->val>b.val;
	}
	node(int row,int col,int val){
		this->row=row;
		this->col=col;
		this->val=val;
	}
};
int kthSmallest(vector<vector<int>>& matrix, int k) {
        priority_queue<node>queue;
        int n=matrix.size();
        int m=matrix[0].size();
        for(int i=0;i<n;i++){
        	node temp(i,0,matrix[i][0]);
        	queue.push(temp);
		}
		vector<int>ans;
		while(k>0&&!queue.empty()){
			k--;
			node temp=queue.top();
			queue.pop();
			ans.push_back(temp.val);
			if(temp.col+1<m){
				node next(temp.row,temp.col+1,matrix[temp.row][temp.col+1]);
					queue.push(next);
			}
			
		}
		//for(int i=0;i<ans.size();i++)		printf("%d ",ans[i]);
		return ans.back();
    }
int main(){
	vector<vector<int>> matrix={{1,5,9},{10,11,13},{12,13,15}};
	int k=8;
	printf("%d",kthSmallest(matrix,k));
}
