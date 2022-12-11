/*
1) Напишите программу, в которой на основе суперкласса создается подкласс, а на
основе этого подкласса создается еще один подкласс (цепочка наследования из трех
классов).
2) В первом суперклассе есть
    - открытое целочисленное поле,
    - метод с одним параметром для присваивания значения полю
    - конструктор с одним параметром.
 */

package lab_7.lab_7_03;
public class superClass {
     int num;
    superClass (int num){
        setValue(num);
    }

    public superClass() {

    }
    void setValue (int num){
        this.num = num;
    }
    int getInt (){
        return num;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " int 1 = " + this.getInt();
        return ClassNameAndFieldValue;
    }
}
