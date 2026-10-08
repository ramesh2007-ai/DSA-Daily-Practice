class Floor_array1
{
    static int linearFloor(int[] arr,int x){
        int floor=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x)
                floor=arr[i];
            else
                break;
        }
        return floor;
    }
    public static void main(String[] args){
        int[] arr={1,2,8,10,10,12,19};
        int x=5;
        System.out.println(linearFloor(arr,x));
    }
}