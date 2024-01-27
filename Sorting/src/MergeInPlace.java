import java.util.Arrays;

//Merge Sort In place
public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr = {8,4,2,10,7};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr, int s, int e){
        if(e-s == 1){
            return;
        }

        int mid = s + (e-s)/2;

        mergesort(arr,s,mid);
        mergesort(arr,mid,e);

        merge(arr,s,mid,e);
    }

    static void merge(int[] arr , int s, int mid, int e){
        int i=s;
        int j=mid;
        int k=0;

        int[] mix = new int[e-s];

        while (i<mid && j<e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0; l<mix.length; l++){
            arr[l+s] = mix[l];
        }
    }
}
