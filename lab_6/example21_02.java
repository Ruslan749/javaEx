/*
Напишите программу с классом, в котором есть закрытое статическое целочисленное поле
с начальным нулевым значением.
    1) В классе должен быть описан статический метод, при вызове которого
отображается текущее значение статического поля,
    2) после чего значение поля увеличивается на единицу.

 */
package lab_6;
public class example21_02 {
    public static void main(String[] args) {
        Box_1 box = new Box_1();


    }
}
class Box_1 {
    private int i = 0;

    public int getI() {
        System.out.println(i);
        return i++;
    }
}
