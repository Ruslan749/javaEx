/*
 1) суперкласс
        -с защищенным текстовым полем,
        - конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля.
 */
package lab_7_05;

class superClass {
    final String str;

    public superClass(String str){
        this.str = str;
    }
    String getStr (){
        return str;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        "- string = " + this.getStr();
        System.out.println(ClassNameAndFieldValue);
        return super.toString() + ClassNameAndFieldValue;
    }
}
