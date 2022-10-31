package lab_3;

import java.util.Scanner;

public class example21_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите день недели:");
        String string = in.nextLine();

//        switch (string) {
//            case "понедельник" -> System.out.print(1);
//            case "вторник" -> System.out.print(2);
//            case "среда" -> System.out.print(3);
//            case "четверг" -> System.out.print(4);
//            case "пятница" -> System.out.print(5);
//            case "суббота" -> System.out.print(6);
//            case "воскресенье" -> System.out.print(7);
//            default -> System.out.print("такого дня недели нет");
//        }


       if (string.equals("понедельник") ){
           System.out.print(1);
       } else if (string.equals("вторник")) {
           System.out.print(2);
       }else if (string.equals("среда")) {
           System.out.print(3);
       }else if (string.equals("четверг")) {
           System.out.print(4);
       }else if (string.equals("пятница")) {
           System.out.print(5);
       }else if (string.equals("суббота")) {
           System.out.print(6);
       }else if (string.equals("воскресенье")) {
           System.out.print(7);
       }


    }
}
