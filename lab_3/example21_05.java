package lab_3;

import java.util.Scanner;

public class example21_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" введите 1 число");
        int num_1 = in.nextInt();
        System.out.println(" введите 2 число");
        int num_2 = in.nextInt();

        int i = 0;

//        for (int i = 0; i <= num_1; i++){
//            for (int j = 0; j <= num_2; j++){
//                int c = j + i;
//                if (c%5 == 2 ){
//                    System.out.printf(" %d + %d = %d при делении на 5 остаток 2 \n", i, j,c);
//                }
//                if (c%3 ==1 ){
//                    System.out.printf(" %d + %d = %d при делении на 3 остаток 1 \n", i, j,c);
//                }
//            }
//        }
//        while ( i <= num_1){
//            int j = 0;
//            while (j<=num_2){
//                int c = j + i;
//                if (c%5 == 2 ){
//                    System.out.printf(" %d + %d = %d при делении на 5 остаток 2 \n", i, j,c);
//                }
//                if (c%3 ==1 ){
//                    System.out.printf(" %d + %d = %d при делении на 3 остаток 1 \n", i, j,c);
//                }
//                j++;
//            }
//            i++;
//        }

        do {
            int j = 0;
            do {
                int c = j + i;
                if (c%5 == 2 ){
                    System.out.printf(" %d + %d = %d при делении на 5 остаток 2 \n", i, j,c);
                }
                if (c%3 ==1 ){
                    System.out.printf(" %d + %d = %d при делении на 3 остаток 1 \n", i, j,c);
                }
                j++;
            }while (j<=num_2);
            i++;
        }while (i <= num_1);
    }
}
