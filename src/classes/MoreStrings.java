
package classes;

import java.io.PrintStream;

public class MoreStrings {
	
	private final String TAG = MoreStrings.class.getSimpleName();
	
    private static String a = "Something";
    private static String b = "Whatever";
    private static String c = "";
    private static String d = "hello";
    private static String e = "some really long string, like too much...";
    private static String[] strArray;

    //Main method
    public static void main(String[] args) {
    	
        strArray = new String[]{a, b, c, d, e};
        String strNext = "";
        
        for(String str : strArray) {

            MoreStrings.findStartStr(str, "S");
            MoreStrings.findEndStr(str, "ver");
            MoreStrings.findFirstIndx(str, 'o');
            MoreStrings.findIndx(str, 'o', 5);
            MoreStrings.findFirstSubStr(str, "me");
            MoreStrings.findSubStr(str, "me", 3);
            MoreStrings.countChr(str);
            
            MoreStrings.strConcat(str, strNext);
            strNext = str;

            MoreStrings.chrReplace(str, 'o', 'X');
            MoreStrings.upperCase(str);
            MoreStrings.lowerCase(str);

        }
    }

    private static void findStartStr(String str, String start) {
        if (str.startsWith(start)) {
            System.out.println(String.format("Starts with %s: %s", start, str));
        }
    }

    private static void findEndStr(String str, String end) {
        if (str.endsWith(end)) {
            System.out.println(String.format("Ends with %s: %s", end, str));
        }
    }

    private static void findFirstIndx(String str, char chr) {
        System.out.println(String.valueOf(str) + " (" + chr + "): " + str.indexOf(chr));
    }

    private static void findIndx(String str, char chr, int ignore) {
        System.out.println(String.valueOf(str) + " (" + chr + ", ignore first " + ignore + " chars): " + str.indexOf(chr, ignore));
    }

    private static void findFirstSubStr(String str, String sub) {
        System.out.println(String.valueOf(str) + " (" + sub + "): " + str.indexOf(sub));
    }

    private static void findSubStr(String str, String sub, int ignore) {
        System.out.println(String.valueOf(str) + " (" + sub + ", ignore first " + ignore + " chars): " + str.indexOf(sub, ignore));
    }

    private static void countChr(String str) {
        System.out.println(String.valueOf(str) + "(length): " + str.length());
    }

    private static void strConcat(String str, String strNext) {
        System.out.println("String concat: " + str.concat(strNext));
    }

    private static void chrReplace(String str, char a, char b) {
        System.out.println("Char replace (" + a + " -> " + b + "): " + str.replace(a, b));
    }

    private static void upperCase(String str) {
        System.out.println("Upper case: " + str.toUpperCase());
    }

    private static void lowerCase(String str) {
        System.out.println("Lower case: " + str.toLowerCase());
    }
}
