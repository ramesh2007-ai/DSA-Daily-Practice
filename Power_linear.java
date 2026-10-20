class Power_linear{
    static long powerLinear(int x,int n){
        long ans=1;
        for(int i=0;i<n;i++)
            ans=ans*x;
        return ans;
    }

    public static void main(String[] args){
        int x=2;
        int n=10;
        System.out.println(powerLinear(x,n));
    }
}