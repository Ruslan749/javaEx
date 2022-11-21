/*
Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве).
 */
package lab_6;

public class example21_08 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        sumArr sumArr = new sumArr();
        System.out.println(sumArr.arrList(arr));
    }

    public static class sumArr{
        private static int arrSum;
        private static int arrList (int[] arr ){
            for (int i = 0 ; i<arr.length; i++){
                arrSum += arr[i];
            }
            return arrSum /2;
        }

    }
}
