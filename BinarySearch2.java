import java.util.*;
public class BinarySearch2{
    public static int binarySearch(int a[],int x){
        int l=0,h=a.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==x)
                return m;
            else if(a[m]<x)
                l=m+1;
            else
                h=m-1;
        }
        return -1;
    }

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        int x=5;
        System.out.println(binarySearch(a,x));
    }
}