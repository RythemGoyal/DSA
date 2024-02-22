public class EvenOdd{
    public static void main(String[] args) {
        int a = 100;
        System.out.println(eve_odd(a));
    }

    static boolean eve_odd(int a){
        return (a&1)==0;
    }
}