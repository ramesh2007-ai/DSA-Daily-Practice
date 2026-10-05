class First_binary_search {
    static int first_Occurence(int a[], int n, int x) {
        int l = 0;
        int h = n - 1;
        int res = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (a[mid] == x) {
                res = mid;
                h = mid - 1;
            }
            else if (a[mid] < x) {
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int a[] = {2, 2, 3, 3, 5, 5, 5, 5, 5, 5, 9, 16};
        int n = a.length;
        int x = 5;
        System.out.println(First_binary_search.first_Occurence(a, n, x));
    }
}