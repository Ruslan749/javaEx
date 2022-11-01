package timus;
/*
Задача : 1409. Два бандита
Исходные данные:
В единственной строке записано 2 числа — количество банок, простреленных Гарри и Ларри соответственно.
Результат:
Выведите 2 числа — количество банок, не простреленных Гарри и Ларри соответственно.
 */
import java.io.PrintWriter;
import java.util.*;

public class exe_5 {
    // 1 способ
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] result = new int[2];

        for (int i = 0; i <= result.length -1; i++){
            result[i] = in.nextInt();
        }
        in.close();

        int tottalTargets = 0;
        for (int target: result){
            tottalTargets = tottalTargets +target;
        }

        for (int can: result){
            System.out.printf("%s \n", tottalTargets-can-1);
        }

//        2 способ

        Locale.setDefault(Locale.US);

        PrintWriter out = new PrintWriter(System.out);

        int hCans = in.nextInt();
        int lCans = in.nextInt();

        out.print(lCans - 1);
        out.print(" ");
        out.println(hCans - 1);
        out.flush();
    }
}
