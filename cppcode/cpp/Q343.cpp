#include<vector>
#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<cmath>
using namespace std;
int integerBreak(int n) {
        if(n<=3)return n-1;
        if(n==4)return 4;
        double numberOf3=n%3==1? n/3-1:n/3;
        double left=n-numberOf3*3;
        if(left!=0)return left*pow(3,numberOf3);
        else return pow(3,numberOf3);
    }
int main(){
	
	printf("%d",integerBreak(10));
	return 0;
} 
