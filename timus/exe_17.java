/*
Сумма цифр
Дано трехзначное число. Найдите сумму его цифр.
 */
package timus;
import java.util.Scanner;

public class exe_17 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int a1 = a /100;
        int a2 = a % 10;
        int a3 = a % 100 / 10;
        System.out.print(a1 + a2 + a3);
    }
}
