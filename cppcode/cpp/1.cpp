#include <stdio.h>
#include <stdlib.h>
#include <vector>
int f(int a){return a;}
typedef int (func_type)(int);
typedef int (*pfunc_type)(int);

struct point{
	int x,y;
};
int main() {
	std::vector<point> a(10);
	//a.push_back(1);
	for(int i=0;i<a.size();i++){
		printf("%d\n",a[i].x);
	}
	
	return 0; 
}

