package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        setA.add("1");
        setA.add("a");
        setA.add("3");

        Iterator<String> itr = setA.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // Delete 1 phần tử
        setA.remove("a");
        System.out.println("Dữ liệu sau khi delete");
        for (String str : setA){
            System.out.println(str);
        }

        //Xoa het phan tu
        setA.clear();
        System.out.println("Dữ liệu sau khi xoa het");
        for (String str : setA){
            System.out.println(str);
        }

        // Them phan tu tu set khac
        Set<String> set2 = new HashSet<>();
        set2.add("4");
        setA.addAll(set2);
        System.out.println("Dữ liệu sau khi them moi");
        for (String str : setA){
            System.out.println(str);
        }
    }
}
