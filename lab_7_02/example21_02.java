/*
    1) Напишите программу, в которой есть суперкласс с приватным текстовым полем.
    2) В базовом классе должен быть метод для присваивания значения полю: без параметров и с одним текстовым параметром.
    3) Объект суперкласса создается передачей одного текстового аргумента конструктору. Доступное только
для чтения свойство результатом возвращает длину текстовой строки.
    4) На основе суперкласса создается подкласс. В подклассе появляется дополнительное открытое целочисленное поле.
В классе должны быть такие версии метода для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром.
    5) У конструктора подкласса два параметра (целочисленный и текстовый).
 */
package lab_7_02;

public class example21_02 {
    public static void main(String[] args) {
        superClass sClass = new superClass();
        sClass.toString();
        superClass sClass1 = new superClass("текст супер класса");
        sClass1.toString();
        subClass subClass1 = new subClass ();
        subClass1.toString();
        subClass subClass2 = new subClass ("текст суб класса № 1 ");
        subClass2.toString();
        subClass subClass3 = new subClass (1);
        subClass3.toString();
        subClass subClass4 = new subClass ("текст суб класса № 2",1);
        subClass4.toString();
    }
}


