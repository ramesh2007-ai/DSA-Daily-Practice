class Ceil_linear{
    static int linearCeil(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=x)
                return arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={2,4,6,8,10};
        int x=5;
        System.out.println(linearCeil(arr,x));
    }
}