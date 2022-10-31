package lab_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example21_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" введите число ");
        int size = in.nextInt();
        int [] arr = new int[size];
        Random random = new Random();
        for (int i = 0 ; i < arr.length ; i++ ) {
            arr[i] = random.nextInt(200);
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.printf("минимальное значение в масиве: %s ", arr[0]);
    }
}
