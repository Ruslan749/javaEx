/*
        4) На основе суперкласса создается подкласс. В подклассе появляется дополнительное открытое целочисленное поле.
В классе должны быть такие версии метода для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса):
    без параметров,
    с текстовым параметром,
    с целочисленным параметром,
    с текстовым и целочисленным параметром.
        5) У конструктора подкласса два параметра (целочисленный и текстовый).
 */
package lab_7.lab_7_02;

public class subClass extends superClass{
    private int num;
    private String str;
    // конструкторы
    subClass (){
        setString();
    }
    subClass (String str){
        setString(str);
    }
    subClass (int num){
        setInt(num);
    }
    subClass (String str, int num){
        setString(str);
        setInt(num);
    }
    // методы

    public void setInt (int num){
        this.num = num;
    }
    public int getInt (){
        return num;
    }
    public void setString () {
        this.str = "нет данных";
    }
    public void setString (String str){
        this.str = str;
    }
    public String getString (){
        return str;
    }
    public int strLength(){
        return str.length();
    }
    public void Show (){
        System.out.println(num);
        System.out.println(str);
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue = "subClassTest{" + "str2=\"" + getString() + '\"' + " string.length = " +"\""+strLength()+"\"}"
                +"\nsubClassTest{" + "int1=\"" + getInt() + "\"}";
        System.out.println(ClassNameAndFieldValue);
        return ClassNameAndFieldValue;
    }

}
