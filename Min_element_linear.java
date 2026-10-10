class Min_element_linear
{
public static int minl(int a[])
{
	int n=a.length;
	int min=a[0];
	for(int i=0;i<n;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	return min;	
}
public static void main(String args[])
{
int a[]={10,12,13,15,17,19,20,4,8,9};
System.out.println(minl(a));
}
}