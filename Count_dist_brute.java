import java.util.*;
class Count_dist_brute
	{
	public static int[] countDistinct(int a[],int n,int k)
	{
		int res[]=new int[n-k+1];
		int p=0;
		for(int i=0;i<=n-k;i++)
		{
			HashSet<Integer> hs=new HashSet<>();
			for(int j=i;j<i+k;j++)
			{
				hs.add(a[j]);
			}
			res[p++]=hs.size();
		}
		return res;
	}
	public static void main(String args[])
	{
		int a[]={1,2,1,3,4,2,3};	
		int n=a.length;
		int k=4;
		System.out.println(Arrays.toString(countDistinct(a,n,k)));
	}
	}