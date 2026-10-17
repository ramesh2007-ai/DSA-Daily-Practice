import java.util.*;
public class Min_max_brute{
    public static int[] minMaxSum(int[] arr,int k){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(sum<min) min=sum;
            if(sum>max) max=sum;
        }
        return new int[]{min,max};
    }
    public static void main(String[] args){
        int[] arr={2,1,5,1,3,2};
        int k=3;
        int[] result=minMaxSum(arr,k);
		System.out.println(Arrays.toString(result));
    }
}