package frame_work_module.Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashsets {
    public static void main(String[] args) {
        Set<String > value = new HashSet<String>();
        value.add("i");
        value.add("am");
        value.add("studing");
        value.add("jaava");
        System.out.println(value);
        value.add("i");
        System.out.println(value);
        value.add("I");
        System.out.println(value);
        value.remove("I");
        System.out.println(value);

        Set<Integer> value1 = new HashSet<Integer>();
        value1.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,9,10}));
        System.out.println(value1);


        Set<Integer> value2 = new HashSet<Integer>();
        value2.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8}));


        Set<Integer> intersection = new HashSet<Integer>(value1);
        intersection.retainAll(value2);
        System.out.println(intersection);


        Set<Integer> union = new HashSet<Integer>(value1);
        union.addAll(value2);
        System.out.println(union);

        Set<Integer> difference = new HashSet<Integer>(value1);
        union.removeAll(value2);
        System.out.println(difference);

        Set<Integer> difference2 = new HashSet<Integer>(value2);
        union.removeAll(value1);
        System.out.println(difference2);

    }
}
