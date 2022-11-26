/*
2) Во втором классе появляется открытое текстовое поле.
 */
package lab_7_04;

public class subOneClass extends superClass {
    public String str;

    public void setChar1Str1 (char ch, String str) {
        super.ch = ch;
        this.str = str;
    }

    subOneClass ( char ch, String str){
        super(ch);
        this.setChar1Str1(ch, str);
    }

    subOneClass(subOneClass copy) {
        super(copy.ch);
        this.setChar1Str1(copy.ch, copy.str);
    }
    String getStr (){
        return str;
    }


    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        "string = " + this.getStr();
        return super.toString() + ClassNameAndFieldValue;
    }
}
