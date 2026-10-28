import java.util.*;
class Union_ts_without_duplicates1{
    public static void main(String[] args){
        int[] a={4,2,1};
        int[] b={5,2,3};
        TreeSet<Integer> set=new TreeSet<>();
        for(int x:a)
            set.add(x);
        for(int x:b)
            set.add(x);
        System.out.println(set);
    }
}