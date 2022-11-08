package lab_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class example21_10 {
    public static void main(String[] args) {
        int sizeArr = 10;
        int [] arr = new int[sizeArr];
        Random random = new Random();
        for (int i = 0 ; i < arr.length ; i++ ) {
            arr[i] = random.nextInt(200);
        }
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));

        System.out.print(Arrays.toString(arr));
    }
}
