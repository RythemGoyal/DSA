package Patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        sortt(arr, arr.length,0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sortt(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                sortt(arr, r, c+1, c);
            }else{
                sortt(arr, r, c+1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            sortt(arr,r-1,0,0);
        }
    }
}
