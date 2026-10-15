import java.util.*;
class Count_vowels_brute
{
public static int[] countVowels(String s,int k)
{
int n=s.length();
int res[]=new int[n-k+1];
int p=0;
for(int i=0;i<=n-k;i++)
{
int count=0;
for(int j=i;j<i+k;j++)
{
char ch=Character.toLowerCase(s.charAt(j));
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
count++;
}
}
res[p++]=count;
}
return res;
}
public static void main(String args[])
{
String s="rameshisgoodboy";
int k=3;
System.out.println(Arrays.toString(countVowels(s,k)));
}
}
