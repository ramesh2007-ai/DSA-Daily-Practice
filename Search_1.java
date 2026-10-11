class Search_1
{
    public static int search(int a[],int x)
    {
        int n=a.length;
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(a[mid]==x)
            {
                return mid;
            }
            if(a[mid]<=a[h])
            {
                if(x>a[mid] && x<=a[h])
                {
                    l=mid+1;
                }
                else
                {
                    h=mid-1;
                }
            }
            else
            {
                if(x>=a[l] && x<a[mid])
                {
                    h=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int a[]={5,6,7,8,9,10,1,2,3};
        int x=6;
        System.out.println(search(a,x));
    }
}