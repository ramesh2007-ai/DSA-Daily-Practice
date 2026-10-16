import java.util.*;
class First_negative_brute
{
public static int[] winNegative(int a[],int n,int k)
{
int res[]=new int[n-k+1];
int p=0;
for(int i=0;i<=n-k;i++)
{
int s=0;
for(int j=i;j<i+k;j++)
{
if(a[j]<0){

s=a[j];
break;
}
}
res[p++]=s;
}
return res;
}
public static void main(String args[]){
int a[]={12,-1,-7,8,-15,30,16,28};
int n=a.length;
int k=3;
System.out.println(Arrays.toString(winNegative(a,n,k)));
}
}
