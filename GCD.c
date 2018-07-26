#include<stdio.h>
GCD(int A,int B)
{
	if(A==0)
		return B;
	else if(B==0)
		return A;
	else
		return GCD(B,A%B);
}
main()
{
	printf("GCD of 12 and 14 is %d",GCD(12,14));
}
