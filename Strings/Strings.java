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

    public static float shortestPath(String path) {
        int x = 0, y = 0; // Declare x and y variables
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'E') { // Use single quotes for characters
                x++;
            } else if (path.charAt(i) == 'W') { // Use single quotes for characters
                x--;
            } else if (path.charAt(i) == 'N') { // Use single quotes for characters
                y++;
            } else if (path.charAt(i) == 'S') { // Use single quotes for characters, and change else to else if
                y--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static String toUpperCase(String sbr) {
        StringBuilder sb = new StringBuilder();
        char chr = Character.toUpperCase(sbr.charAt(0));
        sb.append(chr);
        for (int ch = 1; ch < sbr.length(); ch++) {
            if (sbr.charAt(ch) == ' ' && ch < sbr.length() - 1) {
                sb.append(sbr.charAt(ch));
                ch++;
                sb.append(Character.toUpperCase(sbr.charAt(ch)));
            } else {
                sb.append(sbr.charAt(ch));
            }
        }
        return sb.toString();
    }

    public static String compress(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();

            }
        }
        return newStr;
    }

    public static void main(String args[]) {
        // String str = "Somnath";
        // System.out.println(isPalindrome(str));

        // String path = "WNEENESENNN";
        // System.out.println("Shortest path: " + shortestPath(path));

        // For a given String convert each the first Letter of each word to upper case.

        // " hi, my name is somnath mandal"-- "Hi, My Name Is Somnath Mandal"

        String sbr = "hi, my name is somnath mandal";
        System.out.println(toUpperCase(sbr));

        String str = "aaabbbbccddde";
        System.out.println(compress(str));
    }
}
