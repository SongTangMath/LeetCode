#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int countTimes(char*s,char*t){
	if(!s||!t)return 0;
	char*p=s;
	int count=0;
	while(*p){
		p=strstr(p,t);
		if(!p)return count;
		count++;
		p+=strlen(t);
	}
	return count;
	
}
char* getString(){
	char* s=(char*)malloc(100);
	strcpy(s,"abcxyz");
}
char* trim(char*s,int len){
	char*ans=NULL;
	if(s[0]==0){
		ans=(char*)malloc(1);
		ans[0]=0;
		return ans;
	}
	int i=0,j=len-1;
	while(i<len&&(s[i]==' '||s[i]=='\t'||s[i]=='\n'))i++;
	if(i==len){
		ans=(char*)malloc(1);
		ans[0]=0;
		return ans;
	}
	while(j>0&&(s[j]==' '||s[j]=='\t'||s[j]=='\n'))j--;
	ans=(char*)malloc(j-i+2);
	memcpy(ans,s+i,j-i+1);
	ans[j-i+1]=0;
	return ans;
}
int len(char*s){
	return strlen(s);
}
int f(int **a){
	return a[0][0];
}
int main(){
	int a[][3]={{1,0,0},{0,1,0},{0,0,1}};
	//printf("%d",f(a));
	//printf("%s")
	 int b[3];
  for(int i=0;i<3;i++)
  printf("%d\n",b[i]);
	return 0;
}
