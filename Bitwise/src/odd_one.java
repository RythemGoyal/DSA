//Array contains all elements twice except one
public class odd_one {
    public static void main(String[] args) {
        int[] arr= {2,3,4,1,2,1,3,6,4};
        System.out.println(odd(arr));
    }

    static int odd(int arr[]){
        int unique = 0;
        for(int n : arr){
            unique = unique ^ n;
        }
        return unique;
    }
}
