//Remove an entire string
//eg: input : 'bccappleg'
//output: 'bcceg'
//removed : 'apple;
package Strings;

public class RemoveString {
    public static void main(String[] args) {
        System.out.println(skip2("bccapplegh"));
    }
    static String skip2(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            return skip2(str.substring(5));
        }
        else{
            return str.charAt(0)+skip2(str.substring(1));
        }
    }
}
