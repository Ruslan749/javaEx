package timus.task_14;
import java.util.*;
public class exe_14 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int invitation = in.nextInt();
        String [] arr = new String[invitation];
        int count = 2;

        for (int i = 0; i < arr.length; i++){
            arr[i] = new Scanner(System.in).nextLine();
        }

        for (String s : arr) {
            count++;
            if (s.contains("+")) {
                count++;
            }
        }
        if (count==13){
            count++;
        }
        System.out.println(count*100);
    }
}
