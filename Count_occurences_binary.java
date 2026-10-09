class Count_occurences_binary {
    static int first(int a[],int n,int x) {
        int l=0,h=n-1,res=-1;
        while(l<=h) {
            int mid=l+(h-l)/2;
            if(a[mid]==x) {
                res=mid;
                h=mid-1;
            } else if(a[mid]<x) {
                l=mid+1;
            } else {
                h=mid-1;
            }
        }
        return res;
    }

    static int last(int a[],int n,int x) {
        int l=0,h=n-1,res=-1;
        while(l<=h) {
            int mid=l+(h-l)/2;
            if(a[mid]==x) {
                res=mid;
                l=mid+1;
            } else if(a[mid]<x) {
                l=mid+1;
            } else {
                h=mid-1;
            }
        }
        return res;
    }

    static int count(int a[],int n,int x) {
        int first=first(a,n,x);
        if(first==-1)
            return 0;
        int last=last(a,n,x);
        return last-first+1;
    }

    public static void main(String[] args) {
        int a[]={1,2,2,2,3,4,5};
        int x=2;
        System.out.println(count(a,a.length,x));
    }
}