//To store all the subseq strings in an ArrayList and return it
package Strings;

import java.util.ArrayList;

public class SubseqList {
    public static void main(String[] args) {
        System.out.println(subseq("","abc"));
    }

    static ArrayList<String> subseq(String newStr, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(newStr);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subseq(newStr,str.substring(1));
        ArrayList<String> right = subseq(newStr+ch, str.substring(1));

        left.addAll(right);
        return left;
    }
}
