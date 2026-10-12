class Min_Element_ROtate
{
public static int min(int a[])
{
int n=a.length;
int l=0;
int r=n-1;
while(l<r)
{
	int mid=l+(r-l)/2;
	if(a[mid]>a[r])
	{
		l=mid+1;
	}
	else
	{
		r=mid;
	}
}
return a[l];
}
public static void main(String args[])
{
	int a[]={10,12,13,15,17,19,20,4,8,9};
	System.out.println(min(a));
}
}