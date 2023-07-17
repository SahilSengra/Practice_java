package frame_work_module;

import java.util.*;

public class fist {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(8);


       List<Integer> sublist = new ArrayList<>();
        sublist.add(5);
        sublist.add(6);
        sublist.add(7);

        int ind = Collections.indexOfSubList(newList,sublist);
        System.out.println(" the index idex is : "+ind);

//        newList.add(3,4);

       // Collections.sort(newList, Collections.reverseOrder());
//        int search = Collections.binarySearch(newList,9);
//        System.out.println(search);



        int max = Collections.max(newList);
        System.out.println(max);

        int min = Collections.min(newList);
        System.out.println(min);



//        Iterator It = newList.listIterator();
//        while (It.hasNext()){
//            System.out.println(It.next());
//        }

    }
}
