package lab_2;
import java.util.Scanner;
public class example21_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number:");
        int number = in.nextInt();

        if ( number%4 == 0){
            if (number>= 10){
                System.out.println(" Удовлетворяет требованиям");
            }
        }else {
            System.out.println("Требования не выполнены");
        }
    }
}
