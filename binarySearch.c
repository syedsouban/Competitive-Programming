#include<stdio.h>
int binarySearch(int a[],int low,int high, int key)
{
	int mid=(low+high)/2;
	if(a[mid]==key)
	{
		return mid;
	}
	if(key>a[mid])
	{
		binarySearch(a,mid+1,high,key);
	}
	else if(key<a[mid])
	{
		binarySearch(a,low,mid-1,key);
	}
	else
		return -1;
}

main()
{
	int a[]={1,2,3,4,12,14,15};
	printf("%d",binarySearch(a,0,6,2));
}
