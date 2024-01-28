//input : "baccdah"
//output : "bccdh"

package Strings;

public class RemoveChar {
    public static void main(String[] args) {
        skip("","baccdah");
        System.out.println(skip2("baccdah"));
    }

    static void skip(String newStr , String str){
        if(str.isEmpty()){
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            skip(newStr , str.substring(1));
        }
        else{
            skip(newStr+ch , str.substring(1));
        }
    }

    static String skip2(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            return skip2(str.substring(1));
        }
        else{
            return ch+skip2(str.substring(1));
        }
    }
}
