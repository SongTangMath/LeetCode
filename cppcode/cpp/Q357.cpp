#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<string> 
using namespace std;
 int factorial(int n){
        int ans=9;
        for(int i=9;i>=11-n;i--)ans*=i;
        return ans;
    }
  int countNumbersWithUniqueDigits(int n) {
        if(n==0)return 1;
        if(n==1)return 10;
        if(n>=11)return countNumbersWithUniqueDigits(10);
        return factorial(n)+countNumbersWithUniqueDigits(n-1);
    }
   
int main(){
	printf("%d",countNumbersWithUniqueDigits(3)); 
} 
