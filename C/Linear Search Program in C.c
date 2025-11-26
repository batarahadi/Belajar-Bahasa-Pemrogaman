#include<stdio.h>
int main() {
	int i,ar[10],n,pos=-1;
	printf("Enter array:-\n");
	for(i=0;i<=9;i++) {
		printf("ar[%d]=",i);	
		scanf("%d",&ar[i]);
	}
	
	printf("Enter number to be search=");
	scanf("%d",&n);
	for(i=0;i<=9;i++) {
		if(n==ar[i]) {
			pos=i+1;
		}
	}
	if(pos==-1) {
		printf("Number not found.");			
	}	
	else {
		printf("Position=%d",pos);			
	}

    return 0;
}