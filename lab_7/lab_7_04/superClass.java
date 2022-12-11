/*
1) В первом классе есть открытое символьное поле.
 */
package lab_7.lab_7_04;
public class superClass {
     char ch;
    superClass (char ch){
        setCh (ch);
    }
    public superClass() {
    }
    void setCh(char ch){
        this.ch = ch;
    }

    char getCh (){
        return ch;
    }
    superClass(superClass copy) {
        this.setCh(copy.ch);
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " char = " + this.getCh();
        return ClassNameAndFieldValue;
    }
}
