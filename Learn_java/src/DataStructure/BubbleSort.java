package DataStructure;

public class BubbleSort {
    public void bubSort(int[] arr){
        for (int i = 0;i<arr.length -1;i++){
            for (int j = i+1; j<arr.length; j++ ){
                if(arr[i]>arr[j]){
                    var temp= arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }

    }
}
