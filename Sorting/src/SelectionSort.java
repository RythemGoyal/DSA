import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {8,1,4,5,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length-1;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
