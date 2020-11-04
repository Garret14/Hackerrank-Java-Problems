import java.util.Scanner;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a.toUpperCase();
        b.toUpperCase();
        if(a.length() != b.length()){
            return false;
        }
        HashMap <char, int> hash1 = new HashMap<char, int>();
        HashMap <char, int> hash2 = new HashMap<char, int>();
        char Arr1[] = a.toCharArray();
        char Arr2[] =  b.toCharArray();
        for(int i = 0; i < a.lenghh(); i++){
            if(hash1.containsKey(Arr1[i])){
                hash1.put(Arr1[i], 1);
            }
            else{
                hash1.put(Arr1[i], hash1.get(Arr1[i]) + 1);
            }
            if(hash2.containsKey(Arr2[i])){
                hash2.put(Arr2[i], 1);
            }
            else{
                hash2.put(Arr2[i], hash2.get(Arr2[i]) + 1);
            }
        }
        if(a1 == b1){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}