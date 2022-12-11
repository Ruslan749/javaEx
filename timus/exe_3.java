/*
задача 1785
В единственной строке записано целое число n (1 ≤ n ≤ 2000) — количество монстров.
 */

package timus;
import java.io.PrintWriter;
import java.util.Scanner;

public class exe_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        if ( a >= 0 && a <= 4) {
            out.println("few");
        } if ( a >= 5 && a <= 9) {
            out.println("several");
        }if ( a >= 10 && a <= 19) {
            out.println("pack");
        }if ( a >= 20 && a <= 49) {
            out.println("lots");
        }if ( a >= 50 && a <= 99) {
            out.println("horde");
        }if ( a >= 100 && a <= 249) {
            out.println("throng");
        }if ( a >= 250 && a <= 499) {
            out.println("swarm");
        }if ( a >= 500 && a <= 999) {
            out.println("zounds");
        }if ( a >= 1000) {
            out.println("legion");
        }

        out.flush();
    }
}
