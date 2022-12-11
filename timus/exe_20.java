/*
Улитка
Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?

Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.

Программа должна вывести одно натуральное число
 */
package timus;
import java.util.Scanner;

public class exe_20 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print((h-b-1)/(a-b)+1);
    }
}
