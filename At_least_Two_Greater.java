import java.util.*;

public class At_least_Two_Greater{

    public static long[] findElements(long arr[]) {

        ArrayList<Long> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }

        Collections.sort(al);

        // Remove largest two elements
        al.remove(al.size() - 1);
        al.remove(al.size() - 1);

        long[] ans = new long[al.size()];

        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter size
        int n = sc.nextInt();

        long[] arr = new long[n];

        // Enter array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long[] result = findElements(arr);

        // Print result
        for (long x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}