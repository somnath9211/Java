package Strings;

import java.util.*;

public class Strings {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "Somnath";
        System.out.println(isPalindrome(str));
    }
}
