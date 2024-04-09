package DataStructure;

public class QuickSort {
    public void sort(int[] arr, int leftOfArr, int rightOfArr) {
        if (leftOfArr >= rightOfArr) return;
        int iLeft = leftOfArr;
        int iRight = rightOfArr;
        int k = leftOfArr + (iRight - iLeft) / 2;
        var result = arr[k];

        while (iLeft <= iRight) {
            while (arr[iLeft] < arr[k]) {
                iLeft++;
            }
            while (arr[iRight] > arr[k]) iRight--;
            if (iLeft <= iRight) {
                var tem = arr[iLeft];
                arr[iLeft] = arr[iRight];
                arr[iRight] = tem;
                iLeft++;
                iRight--;
            }
        }
        if (leftOfArr < iRight) {
            sort(arr, leftOfArr, iRight);
        }
        if (iLeft < rightOfArr) {
            sort(arr, iLeft, rightOfArr);
        }

    }
}
