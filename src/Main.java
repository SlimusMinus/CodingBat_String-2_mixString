import java.io.*;
import java.security.PrivilegedExceptionAction;
import java.util.*;

import static java.lang.System.console;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        System.out.println(mixString("Long", "So"));

    }

    public static String mixString(String a, String b) {

        int maxA = a.length();
        int maxB = b.length();
        char[] str2 = new char[maxA + maxB];
        if(a.length() == 0) return b;
        else if(b.length() == 0) return a;
        int j = 0;
        for (int i = 0; i < (a.length() + b.length()-1); i++)
        {
            if(maxA != 0 || maxA < 0){
                if(i != 0)  i++;
                str2[i] = a.charAt(j);
                if(maxB == 0) i--;
                maxA--;
            }
            if(maxB != 0 || maxB < 0){
                str2[i+1] = b.charAt(j);
                maxB--;
            }
            j++;
        }
        return new String(str2);
    }

}
