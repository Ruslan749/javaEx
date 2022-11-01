/*
задача 1000
Вычислите a+b
 */

package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class exe_2 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            int a = in.nextInt();
            int b = in.nextInt();
            out.println(a + b);

            out.flush();
    }
}




