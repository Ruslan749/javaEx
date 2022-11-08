/*
Напишите программу с классом, в котором есть два закрытых целочисленных поля
(назовем их max и min).
1) Значение поля max не может быть меньше значения поля min.
2) Значения полям присваиваются с помощью открытого метода.
3) Метод может вызываться с одним или двумя целочисленными аргументами.
4) При вызове метода значения полям присваиваются так:
    a)сравниваются текущие значения полей и значения аргументов, переданных методу.
    b) Самое большое из значений присваивается полю max, а самое маленькое из
значений присваивается полю min.
5) Предусмотрите конструктор, который работает по тому же принципу, что и
метод для присваивания значений полям. В классе также должен быть метод,
отображающий в консольном окне значения полей объекта.
 */
package lab_5;
public class example21_06 {
    public static void main(String[] args) {
        Numbers num = new Numbers(20,30);
        num.PrintInt();
        num.getNum(5, 10);
        num.PrintInt();
        num.getNum(5);
        num.PrintInt();
    }
}
class Numbers {
    int numMax;
    int numMin;
  public void getNum(int num1, int num2){
      if (num1 > num2){
          this.numMax = num1;
          this.numMin = num2;
      }else {
          this.numMax = num2;
          this.numMin = num1;
      }
  }
    public void getNum (int num){
      this.numMax = num;
      this.numMin = 0;
    }
    Numbers(int num1, int num2){
      this.getNum(num1,num2);
    }
    public void PrintInt(){
        System.out.println("максимально значение: " + this.numMax + " " + "минимальное значение: " + this.numMin);
    }
}