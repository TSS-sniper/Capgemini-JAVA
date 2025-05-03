//package extra;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class april24 {
//
//    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 33, 4, 500, 88};
//        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr));
//        m1(a);
//    }
//
//    public static void m1(ArrayList<? super Number> list) {
//        for (Number n : list) {
//            System.out.println(n);
//        }
//        list.add(20); // ❌ Cannot add to a list of <? extends ...>
//    }
//}
//