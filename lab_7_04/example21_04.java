/*
Напишите программу, в которой использована цепочка наследования из трех
классов.
1) В первом классе есть открытое символьное поле.
2) Во втором классе появляется открытое текстовое поле.
3) В третьем классе появляется открытое целочисленное поле.
В каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.
 */
package lab_7_04;

public class example21_04 {
    public static void main(String[] args) {
        superClass superClass = new superClass('R');
        System.out.println(superClass.toString());
        subOneClass subOneClass = new subOneClass('a',"привет");
        System.out.println(subOneClass .toString());
        subTwoClass subTwoClass = new subTwoClass('F',"пока",23);
        System.out.println(subTwoClass .toString());
    }
}
