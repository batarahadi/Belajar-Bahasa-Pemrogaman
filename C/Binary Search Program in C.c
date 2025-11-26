#include<stdio.h>
int main() {
	int i,ar[10],pos=-1, n,mid, lb, ub;
	printf("Enter array in sorted order:-\n");
	for(i=0; i<=9; i++) {
		printf("ar[%d]=",i);	
		scanf("%d",&ar[i]);
	}

	lb = 0;
	ub = 9;	
	printf("Enter number to be search=");
	scanf("%d",&n);

	while(lb<ub) {
		mid = (lb+ub)/2;
		if(ar[mid]==n) {
			pos=mid+1;
			break;
		}
		else if(ar[mid] <n) {
			lb = mid+1;
		}
		else {
			ub = mid-1;
		}
	}
	if(pos==-1) {
		printf("Number not found.");			
	}	
	else {
		printf("Position=%d",pos);			
	}
}