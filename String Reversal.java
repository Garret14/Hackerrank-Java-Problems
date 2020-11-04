import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder B = new StringBuilder();
        B.append(A);
        B = B.reverse();
        String B2 = B.toString();
        String newh = "";
        if(A.equals(B2)){
            newh = "Yes";
        }
        else{
            newh = "No";
        }
        System.out.println(newh);
    }
}