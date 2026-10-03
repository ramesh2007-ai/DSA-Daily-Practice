import java.util.*;
class Find_smallest_and_largest_numbers{
    public static void main(String[] args)throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(min+" "+max);
    }
}