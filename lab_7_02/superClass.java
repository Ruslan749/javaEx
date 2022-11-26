/*
    2) В базовом классе должен быть метод для присваивания значения полю: без параметров и с одним текстовым параметром.
    3) Объект суперкласса создается передачей одного текстового аргумента конструктору. Доступное только
для чтения свойство результатом возвращает длину текстовой строки.
 */
package lab_7_02;

public class superClass {
    private String str;

    superClass (){
        setString();
    }
    superClass (String str){
        setString(str);
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

    @Override
    public String toString() {
        String superClassNameAndFieldValue = "superClassTest{" + "str1=\"" + getString() + '\"' + " string.length = " +"\""+strLength()+"\"}";
        System.out.println(superClassNameAndFieldValue);
        return superClassNameAndFieldValue;
    }
}
