package lab_3;
import java.util.Scanner;
public class example21_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" введите 1 число");
        int start = in.nextInt();
        System.out.println(" введите 2 число");
        int finish = in.nextInt();
        int i,b;

        if (start > finish){
           i = finish;
        }else {
            i = start;
        }
        if (start > finish){
            b = start;
        }else {
            b = finish;
        }
        for (; i <= b; i++){
            System.out.println(i);
        }
        while (i<=b){
            System.out.println(i);
            i++;
        }
        do {
            System.out.println(i);
            i++;
        }while (i<=b);
    }
}
