package DataStructure;

public class QuickSort {
    public void sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int iL = l;
        int iR = r;
        int k = l + (iR - iL) / 2;
        var result = arr[k];

        while (iL <= iR) {
            while (arr[iL] < arr[k]) {
                iL++;
            }
            while (arr[iR] > arr[k]) iR--;
            if (iL <= iR) {
                var tem = arr[iL];
                arr[iL] = arr[iR];
                arr[iR] = tem;
                iL++;
                iR--;
            }
        }
        if (l < iR) {
            sort(arr, l, iR);
        }
        if (iL < r) {
            sort(arr, iL, r);
        }

    }
}
