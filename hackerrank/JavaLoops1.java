//Java Loops I
//https://www.hackerrank.com/challenges/java-loops-i

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaLoops1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for(int i=1 ; i<=10 ; i++)
        {
            System.out.println(N+" x "+i+" = "+N*i);
        }
    }
}
