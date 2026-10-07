class CountOnesLinear {
    static int countOnes(int a[],int n) {
        int count=0;
        for(int i=0;i<n;i++) {
            if(a[i]==1)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={0,0,0,1,1,1,1,1};
        System.out.println(countOnes(a,a.length));
    }
}