/*
Напишите программу с классом, в котором есть два ноля:
    1) символьное и текстовое.
    2) В классе должен быть перегруженный метод для присваивания значений полям.
Если методвызывается с символьным аргументом, то соответствующее значение присваивается
символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
значение текстового ноля.
    3)Методу аргументом также может передаваться символьный массив. Если массив состоит
из одного элемента, то он определяет
значение символьного поля.
В противном случае (если в массиве больше одного элемента) из символов массива формируется
текстовая строка и
присваивается значением текстовому полю.
 */

package lab_6;

public class example21_01 {
    public static void main(String[] args) {
        Box box = new Box();
        char[] arr_1 = new char[]{'A'};
        char[] arr_2 = new char[]{'s','t','r','o','k','a'};
        box.resault("cтрока");
        box.resault('L');
        box.resault(arr_1);
        box.resault(arr_2);
    }
}

class Box{
    char ch;
    String str;

   public  String resault (String str){
       this.str = str;
       System.out.println(str);
       return str;
   }

    public char resault (char ch){
        this.ch = ch;
        System.out.println(ch);
        return ch;
    }
    public void resault (char[] ch){
       for (int i = 0; i< ch.length; i++){
           if (ch.length == 1){
               this.ch = ch[i];
           }else {
               this.str = String.valueOf(ch);
           }
       }
        System.out.println(this.ch);
        System.out.println(this.str);
    }
}
