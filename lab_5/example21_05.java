/*
Напишите программу с классом, у которого есть закрытое целочисленное поле.
1) Значение полю присваивается с помощью открытого метода.
2) Методу аргументом может передаваться целое число, а также метод может вызываться
без аргументов.

    a) Если методы вызывается без аргументов, то поле получает нулевое значение.
    b) Если метод вызывается с целочисленным аргументом, то это значение присваивается полю.

3) Однако если переданное аргументом методу значение превышает 100, то значением полю присваивается число 100

Предусмотрите в классе конструктор, который работает по тому же принципу
что и метод для присваивания значения полю. Также в классе должен быть
метод, позволяющий проверить значение поля.
 */
package lab_5;
public class example21_05 {
    public static void main(String[] args) {
    Exemple exe = new Exemple(5);
    exe.getNum(5);
    System.out.println("число = " + exe.PrintInt());
    exe.getNum();
    System.out.println("число = " + exe.PrintInt());
    }
}
class Exemple{
    private int num;

    public int getNum(int num1){
        this.num = num1;

        if (num < 100){
            return num;
        }else {
            num = 100;
        }

        return num;
    }
    public void getNum() {
        System.out.println(" метод без аргументов");
    }

    public int PrintInt(){
        return num;
    }

    Exemple (int num){
        System.out.println("конструктор Exemple() = значению " + num );
        this.getNum(num);
    }
}
