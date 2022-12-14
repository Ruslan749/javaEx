/*
Напишите программу, в которой есть
    1) суперкласс
        -с защищенным текстовым полем,
        - конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля.
    2) На основе суперкласса создаются дваподкласса (оба на основе одного и того же суперкласса).
        - В одном из классов появляется защищенное целочисленное поле,
        - конструктор с двумя параметрами и
        - переопределен метод для отображения значений полей объекта и названия класса.
    3) Во втором подклассе появляется
        - защищенное символьное поле,
        - конструктор с двумя параметрами
        - переопределен метод, отображающий в консоли название класса и значения
полей.
    4) В главном методе создайте объекты каждого из классов. Проверьте работу метода,
отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
метод через объектную переменную суперкласса, которая ссылается на объект
производного класса
 */

package lab_7.lab_7_05;

public class example21_05 {
    public static void main(String[] args) {
        superClass superClass = new superClass("text superClass is constructor");
        superClass.toString();
        subOneClass subOneClass = new subOneClass("text one is constructor", 25);
        subOneClass.toString();
        subTwoClass subTwoClass = new subTwoClass("text one is constructor", 'H');
        subTwoClass.toString();
    }
}
