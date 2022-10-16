package lab_2;
import java.util.Scanner;
public class example21_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number:");
        int number = in.nextInt();
        number/=1000;
        System.out.printf("ваше число: %s тысяч", number);
    }
}
