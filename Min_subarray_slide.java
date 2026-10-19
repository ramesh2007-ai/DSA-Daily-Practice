public class Min_subarray_slide{
    public static int minSum(int[] arr,int k){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int min=sum;
        for(int i=k;i<n;i++){
            sum=sum-arr[i-k]+arr[i];
            if(sum<min){
                min=sum;
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr={2,1,5,1,3,2};
        int k=3;
        System.out.println(minSum(arr,k));
    }
}