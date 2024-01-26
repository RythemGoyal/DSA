//Bubble sort using recursion
package Patterns;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        BubbSort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +"\t");
        }
    }

    static void normBubbSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void BubbSort(int arr[], int index, int l){
        if(l == 0){
            return;
        }
        if(index < l){
            if(arr[index] > arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            BubbSort(arr,index+1,l);
        }
        else{
            BubbSort(arr,0,l-1);
        }
    }

}
