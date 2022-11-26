/*
Напишите программу со статическим методом, которым вычисляется сумма
квадратов натуральных чисел 1^2 + 2^2 + 3^2 + ... + n^2.
Число n передается аргументом методу.
Предложите версию метода с рекурсией и без рекурсии. Для проверки результата можно
использовать формулу 1^2 + 2^2 +3^2+…+n^2 =(n+1)*(2n + 1)/6
 */
package lab_6;

public class example21_05 {
    public static void main(String[] args) {
        SummNum box = new SummNum();
        int num = 4;
        int sum = box.sum(num);
        System.out.println(sum);
        int sum_2 = box.SumRec(num);
        System.out.println(sum_2);
    }

    private static class SummNum {
        private int sum (int num){
            // без рекурсии
            int res = 0;
            for (int i = 1; i<=num; i++){
                res += Math.pow(i,2);
            }
            return res;
        }

        private int SumRec (int n){
            int res = 0;
            if (n <= 1) return 1;
            res = SumRec(n-1)+n*n;
            return res;
        }
    }
}
