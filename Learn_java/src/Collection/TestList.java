package Collection;

import java.util.*;

public class TestList {
    public static void main(String args[]) {

        Integer[] test = {1, 2, 3, 4, 5, 6, 78, 8};
        List<Integer> list = new ArrayList<>(Arrays.asList(test));
        list.add(4);
        for (Integer i : list) {
            System.out.println(i);
        }

        //Sap xep phan tu trog list
        Collections.sort(list);

        // Sử dung iterator
        ListIterator<Integer> itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.println("iterator " + itr.next());
        }

        //Lay 1 phan tu bat ki
        int a = list.get(4);
        System.out.println(a);

        //Update 1 phan tu
        list.set(4,10);
        System.out.println("Mang sau khi update");
        for(int i : list){
            System.out.println(i);
        }

        //Remove 1 phan tu
        list.remove(4);
        System.out.println("Mang sau khi remove");
        for(int i : list){
            System.out.println(i);
        }
    }
}
