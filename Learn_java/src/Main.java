import DataStructure.BubbleSort;
import DataStructure.MergeSort;
import DataStructure.QuickSort;
import OOP.Cat;
import TestEnum.TestEnum;
import trycatch.TestTryCatch;

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

        // Enum
//        TestEnum.WeekDay1 day1 = TestEnum.WeekDay1.getWeekDayByValue(3);
//        TestEnum.WeekDay day = TestEnum.WeekDay.MONDAY;
//        switch (day) {
//            case MONDAY:
//                System.out.println("Hôm nay là đầu tuần");
//                break;
//            case SUNDAY:
//                System.out.println("Hôm nay là ngày làm việc cuối cùng của tuần");
//                break;
//            default:
//                System.out.println("Ngày làm việc trong tuần");
//        }

        // Try-catch-finally
//        TestTryCatch test= new TestTryCatch();
//        test.getException();
//        test.testThrow(4);
//        try {
//            test.testThrows(12);
//            test.msg();
//
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }catch (Exception e1){
//            System.out.println(e1);
//
//        }


        //Tìm kiếm tuần tự
//        int[] arr = {1, 5, 4, 8, 2, 3, 10, 9, 6, 7};
//        BubbleSort sort = new BubbleSort();
//        sort.bubSort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.print(arr[i]);
//        }

        //Quịck sort
//        int[] arr = {1, 5, 4, 8, 2, 3, 10, 9, 6, 7};
//        QuickSort sort = new QuickSort();
//        sort.sort(arr,0,arr.length -1);
//        for (int i=0; i< arr.length-1;i++){
//            System.out.print(arr[i]);
//
//        }

//        MergeSort sort = new MergeSort();
//        System.out.println("Mảng ban đầu:");
//        sort.printArray(arr);
//
//        MergeSort ob = new MergeSort();
//        ob.sort(arr, 0, arr.length - 1);
//
//        System.out.println("\nMảng đã sắp xếp:");
//        sort.printArray(arr);
    }
}