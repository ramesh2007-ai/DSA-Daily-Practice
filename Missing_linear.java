class Missing_linear{
    static int linearMissing(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i)
                return i;
        }
        return arr.length;
    }
    public static void main(String[] args){
        int[] arr={0,1,2,6,9,11,19};
        System.out.println(linearMissing(arr));
    }
}