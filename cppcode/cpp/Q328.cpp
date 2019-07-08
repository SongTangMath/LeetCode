#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<limits.h>
#include<stack> 
class ListNode {
	//there will be a great trouble when you try to gc 
	public:
	ListNode* hangNext(int val){
		
		ListNode*  pnewNode=new ListNode(val),*cur=this;
		//if(!head)return newNode;
		while(cur->next)cur=cur->next;
		cur->next=pnewNode;
		return this;
	}
		void printList(){
			ListNode* head=this;
		while(head){
			printf("%d ",head->val);
			head=head->next;
		}
	}
     int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
  };

class Solution {
public:
	

    ListNode* oddEvenList(ListNode* head) {
        if(!head||!head->next)return head;
		ListNode* oddTail=head,*evenTail=head->next,
		*oddHead=head,*evenHead=head->next,
		*cur=head->next->next;
		bool isOdd=true;
		while(cur){
		if(isOdd){
			ListNode* temp=cur->next;
			cur->next=nullptr;
			oddTail->next=cur;
			oddTail=cur;
			cur=temp;
			isOdd=!isOdd;}
		else{
			ListNode* temp=cur->next;
			cur->next=nullptr;
			evenTail ->next=cur;
			evenTail =cur;
			cur=temp;
			isOdd=!isOdd;
			}
		}
		oddTail->next=evenHead;
		evenTail->next=nullptr;
		
return head;
    }
};

int main(){
	 ListNode* head=new ListNode(2);
	 head->hangNext(1)->hangNext(3)->hangNext(5)->hangNext(6)->hangNext(4)->hangNext(7);
	 
	 Solution sol;
	 sol.oddEvenList(head);
	 head->printList();
	return 0;
}
