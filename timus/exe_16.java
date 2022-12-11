/*
Стоимость покупки
Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
Программа получает на вход три числа: a, b, n.
Программа должна вывести два числа: стоимость покупки в рублях и копейках.
 */
package timus;
import java.util.Scanner;

public class exe_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int r = a*b;

        System.out.print((a*c)+(b*c)/100 + " " + (b*c)%100);
    }
}
