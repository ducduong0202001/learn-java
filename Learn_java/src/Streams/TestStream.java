package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        Integer[] test = {1, 2, 3, 4, 5, 6, 78, 8};
        Stream<Integer> stream= Arrays.stream(test);
        List<Integer> numElm= stream.sorted().toList();
        System.out.println(numElm);

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("duc",10);
        myMap.put("van",1);
        myMap.put("pham",5);
        int[] op = myMap.entrySet().stream().mapToInt(r->r.getValue()).filter(i-> i > 5).toArray();
        for (int i : op){
            System.out.println(i);
        }
        //Sap xep
        List<Integer> collection = Arrays.stream(test).sorted((a,b) -> b.compareTo(a)).filter(i -> i < 5).collect(Collectors.toList());
        for (Integer x : collection){
            System.out.print(x);
        }

        List<Map.Entry<String, Integer>> testSort= myMap.entrySet().stream().sorted((a,b) -> b.getValue().compareTo(a.getValue())).collect(Collectors.toList());
        for (Map.Entry<String,Integer> i : testSort){
            System.out.println(i);
        }
    }
}
