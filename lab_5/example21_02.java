/*
    Напишите программу с классом, у которого есть два символьных поля и
метод.
    Он возвращает результат, и у него нет аргументов. При вызове метод
выводит в консольное окно все символы из кодовой таблицы, которые
находятся «между» символами, являющимися значениями полей объекта (из
которого вызывается метод).
    Например, если полям объекта присвоены
значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
выводиться все символы от ‘A’ до ‘D’ включительно.
 */
package lab_5;

public class example21_02 {
    public static void main(String[] args) {
        Chars ch = new Chars();
        ch.getCh1_Ch2();
    }
}
class Chars {
    char ch1 = 'A';
    char ch2 = 'D';
    int b = ch2;
    public void getCh1_Ch2() {
        int res = 0;
        for (int i = ch1;i<=b;i++){
            res = i;
            System.out.println((char)res);
        }
    }
}