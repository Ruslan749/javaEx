package lab_1;
import java.util.Scanner;


//3. Напишите программу, в которой Пользователь последовательно вводит
//        название текущего дня недели, название месяца и дату (номер дня в месяце).

//        Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).

public class exe3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Day of the week:");
        String dayOfTheWeek = in.nextLine();
        System.out.print("Month:");
        String month = in.nextLine();
        System.out.print("Data:");
        int data = in.nextInt();

        System.out.printf("день недели -%s , дата - %s , месяц - %s", dayOfTheWeek,data,month);
        in.close();

    }
}
