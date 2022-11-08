/*
1) Напишите программу с классом, у которого есть символьное и
целочисленное поле.
2) В классе должны быть описаны версии конструктора
    a) с двумя аргументами (целое число и символ – определяют значения полей),
    b) а также с одним аргументом типа double.
3) В последнем случае действительная часть аргумента определяет код символа (значение символьного поля), а
дробная часть (с учетом десятых и сотых) определяет значение
целочисленного поля.

Например, если аргументом передается число 65.1267,
то значением символьного поля будет символ ‘A’ с кодом 65, а целочисленное
поле получит значение 12 (в дробной части учитываются только десятые и
сотые).
 */

package lab_5;



public class example21_04 {
    public static void main(String[] args) {

        Example exe_1 = new Example(12,'A');
        Example exe_2 = new Example(65.1267);

    }
}

class Example {
    private char ch1;
    private int int1;
    Example(int i, char a){
        this.ch1 = a;
        this.int1 = i;
        System.out.printf("ch: %s int: %s\n", ch1,int1);

    }
    Example(double d){
        String[] a = String.valueOf(d).split("[.]");
        int _int = Integer.parseInt(a[0]);
        char ch =(char) _int;
        int _frac = Integer.parseInt(a[1].substring(0,2));
        System.out.printf("%s %s",ch,_frac);

    }

}