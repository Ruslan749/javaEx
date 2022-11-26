/*
Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив. В результате вызова метода элементы массива попарно
меняются местами: первый — с последн и м , второй — с предпоследним и так далее.
 */
package lab_6;
public class example21_09 {
    public static void main(String[] args) {
        Box box = new Box();
        char[] arr = new char[]{'1','2','3','4','5','6','7',};
        box.charList(arr);
        box.showChars();
    }
    public static class Box{
        static char[] arr;
        private static char[] charList (char chars[]){
            arr = new char[chars.length];
            for (int i = 0, j = chars.length - 1; i < chars.length && j / 2 >= 0; i++, j--){
                arr[i] = chars[j];
            }
            return arr;
        }

        private static void showChars (){
            for (char chars: arr) {
                System.out.println(chars);
            }
        }
    }
}
