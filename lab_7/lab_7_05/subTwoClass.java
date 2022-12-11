package lab_7.lab_7_05;

public class subTwoClass extends superClass {

    final char ch;

    public subTwoClass(String str, char ch) {
        super(str);
        this.ch = ch;
    }
    char getChar (){
        return ch;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        "- string = " + this.getStr() + "\n" +
                        "- char = " + getChar();
        System.out.println(ClassNameAndFieldValue);
        return super.toString() + ClassNameAndFieldValue;
    }
}
