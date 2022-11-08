/*
задача 2066. Простое выражение
Исходные данные
Даны целые неотрицательные числа a, b, c в неубывающем порядке
(0 ≤ a ≤ b ≤ c ≤ 100), каждое в отдельной строке.
Результат
Выведите одно целое число — минимальное значение выражения.
 */

package timus;
import java.util.*;

public class exe_12 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (b==0 || b == 1 || c ==1 ){
            System.out.print(a-b-c);
        }else {
            System.out.print(a-b*c);
        }
    }
}
