// * * * * *
// * * * *
// * * *
// * *
// *
package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(4,4 );
        System.out.println();
        triangle(4,0);
    }
    static void pattern(int rows, int cols){
        int i=0,j=0;
        if(i==rows){
            return;
        }
        while(j<cols){
            System.out.print("*");
            j++;
        }
        System.out.println();
        pattern(rows-1,cols-1);
    }

    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }
        else{
            System.out.println();
            triangle(r-1,0);
        }
    }
}
