//To print all subsequence of a string
package Strings;

public class Subseq {
    public static void main(String[] args) {
        subseq("","abc");
    }

    static void subseq(String newStr , String str){
        if(str.isEmpty()){
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(0);

        subseq(newStr,str.substring(1));
        subseq(newStr+ch , str.substring(1));
    }
}

