import java.util.*;
class First_negative_sliding
{
public static int[] winNegative(int a[],int n,int k)
{
int res[]=new int[n-k+1];
Deque<Integer> dq=new LinkedList<>();
int p=0;
for(int i=0;i<n;i++){

if(a[i]<0)
{
dq.addLast(i);
}
if(i>=k-1)
{
while(!dq.isEmpty()&&dq.peekFirst()<i-k+1)
{
dq.removeFirst();
}
if(!dq.isEmpty())
{
res[p++]=a[dq.peekFirst()];
}
else
{
res[p++]=0;
}
}
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
