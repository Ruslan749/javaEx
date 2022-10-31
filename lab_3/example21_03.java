package lab_3;

import java.util.Arrays;

public class example21_03 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));

        int a = 1;
        int b = 1;
        int i = 2;
        System.out.println(a);
        System.out.println(b);
        while (i < 10) {
            int fib = a + b;
            a = b;
            b = fib;
            i++;
            System.out.println(fib);
        }

        int c = 1;
        int d = 1;
        int resault;
        System.out.println(c);
        System.out.println(d);

        do{
            resault = d + c;
            System.out.println(resault);

            c = d;
            d = resault;
        } while (d <= 50);
    }


}
