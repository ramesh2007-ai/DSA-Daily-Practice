import java.util.*;
public class BinarySearch3{
    public static boolean binarySearch(int a[],int l,int h,int x){
        if(l>h)
            return false;
        int m=l+(h-l)/2;
        if(a[m]==x)
            return true;
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