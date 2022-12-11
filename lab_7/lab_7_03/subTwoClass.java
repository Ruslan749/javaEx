/*
4) В третьем классе появляется
    - открытое текстовое поле,
    - метод с тремя аргументами для присваивания значений полям (перегрузка метода из суперкласса)
    - конструктор с тремя параметрами.
 */
package lab_7.lab_7_03;

public class subTwoClass extends subOneClass{
    String str;
    subTwoClass (char ch, int num, String str){

        setValue(ch, num, str);
    }

    void setValue(char ch , int num, String str) {
        super.setValue(ch,num);
        this.str = str;
    }

    public String getStr(){
        return str;
    }
    @Override
    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getStr();
        return super.toString()+ThirdFieldValue;
    }
}
