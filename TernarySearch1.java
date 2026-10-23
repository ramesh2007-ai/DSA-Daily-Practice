import java.util.*;
public class TernarySearch1{
    public static boolean ternarySearch(int a[],int x){
        int l=0,h=a.length-1;
        while(l<=h){
            int m1=l+(h-l)/3;
            int m2=h-(h-l)/3;
            if(a[m1]==x||a[m2]==x)
                return true;
            else if(x<a[m1])
                h=m1-1;
            else if(x>a[m2])
                l=m2+1;
            else{
                l=m1+1;
                h=m2-1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        int x=5;
        System.out.println(ternarySearch(a,x));
    }
}