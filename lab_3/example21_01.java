package lab_3;
import java.util.Scanner;
public class example21_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number:");
        int number = in.nextInt();

        switch (number) {
            case 1 -> System.out.print("понедельник");
            case 2 -> System.out.print("вторник");
            case 3 -> System.out.print("среда");
            case 4 -> System.out.print("четверг");
            case 5 -> System.out.print("пятница");
            case 6 -> System.out.print("суббота");
            case 7 -> System.out.print("воскресенье");
            default -> System.out.print("число введено не верно");
        }
    }
}
