import java.util.*;
public class BinarySearch4{
    public static int binarySearch(int a[],int l,int h,int x){
        if(l>h)
            return -1;
        int m=l+(h-l)/2;
        if(a[m]==x)
            return m;
        else if(a[m]<x)
            return binarySearch(a,m+1,h,x);
        else
            return binarySearch(a,l,m-1,x);
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        int x=5;
        System.out.println(binarySearch(a,0,a.length-1,x));
    }
}