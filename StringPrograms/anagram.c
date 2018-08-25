#include<stdio.h>
#include<string.h>
int checkAnagram(char *s,int n)
{
	int arr[26];
	for(int i=0;i<26;i++)
	{
		arr[i]=0;
	}
	for(int i=0;i<n;i++)
	{
		if(s[i]>='a'&&s[i]<='z')
		{
			arr[s[i]-'a']=1;
		}
		else if(s[i]>='A'&&s[i]<='Z')
		{
			arr[s[i]-'A']=1;
		}
	}
	int flag=1;
	for(int i=0;i<26;i++)
	{
		if(arr[i]==0)
		{
			flag=-1;
		}
	}
	if(flag==-1)
		return 0;
	else
		return 1;
}
main()
{
	char s[1000];
	
	gets(s);
	
	int n=strlen(s);	
	
	if(checkAnagram(s,n))
		printf("%s is an anagram",s);
	else
		printf("%s is not an anagram",s);	
	
}
