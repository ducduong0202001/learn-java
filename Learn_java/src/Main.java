import DataStructure.BubbleSort;
import DataStructure.MergeSort;
import OOP.Cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Demo về OOP
//        Cat cat= new Cat();
//        cat.setGiongLoai("Meo");
//        cat.setSoChan(4);
//        cat.setLoaiThucAn("thit, rau, cu");
//        cat.setMauLong("den");
//        cat.getInfo(cat.getGiongLoai(), cat.getSoChan(), cat.getLoaiThucAn(), cat.getMauLong());
//        cat.getInfoMove();
//        cat.getWeight(6);
//        cat.getSound("meomeo");

        //Tìm kiếm tuần tự
//        int[] arr = {1, 5, 4, 8, 2, 3, 10, 9, 6, 7};
//        BubbleSort sort = new BubbleSort();
//        sort.bubSort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.print(arr[i]);
//        }
        int[] arr = {1, 5, 4, 8, 2, 3, 10, 9, 6, 7};
        MergeSort sort = new MergeSort();
        System.out.println("Mảng ban đầu:");
        sort.printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nMảng đã sắp xếp:");
        sort.printArray(arr);
    }
}