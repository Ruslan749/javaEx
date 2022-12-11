/*
 2) На основе суперкласса создаются дваподкласса (оба на основе одного и того же суперкласса).
        - В одном из классов появляется защищенное целочисленное поле,
        - конструктор с двумя параметрами и
        - переопределен метод для отображения значений полей объекта и названия класса.
 */
package lab_7.lab_7_05;

public class subOneClass extends superClass{
    final int num;
    public subOneClass(String str, int num) {
        super(str);
        this.num = num;
    }
    int getInt(){
        return num;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        "- string = " + getStr() + "\n" +
                        "- Number = " + getInt();
        System.out.println(ClassNameAndFieldValue);
        return super.toString() + ClassNameAndFieldValue;
    }
}
