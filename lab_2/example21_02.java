package lab_2;
import java.util.Scanner;

public class example21_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number:");
        int number = in.nextInt();

        if(number%5 == 2 ) {
            System.out.println("результат: положительный деления на 5 остаток 2");
        } else
        {
            System.out.println("результат: отрицательный деления на 5");
        }
        if (number%7 == 1){
            System.out.println("результат: положительный деления на 7 отстатка 1");
        }else
        {
            System.out.println("результат: отрицательный деление на 7");
        }
    }
}
