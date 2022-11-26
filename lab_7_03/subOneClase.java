/*
3) Во втором классе появляется
    - открытое символьное поле,
    - метод с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса)
    - конструктор с двумя параметрами.
 */
package lab_7_03;

class subOneClass extends superClass{
    public char ch;
    subOneClass ( char ch, int num){
        setValue(ch,num);
    }

    subOneClass() {
    }

    // методы
    void setValue (char ch, int num){
        this.ch = ch;
        super.setValue(num);
    }
    char getCh (){
        return ch;
    }
    @Override
    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getCh();
        return super.toString()+ThirdFieldValue;
    }

}
