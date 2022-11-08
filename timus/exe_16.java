package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class exe_16 {
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        int num = in.nextInt();
        int [] arr = new int[num];

        for (int i =0; i< arr.length; i++){
            arr[i] = in.nextInt();
            out.print(arr[i]);
        }
    out.flush();
    }
}
