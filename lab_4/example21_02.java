package lab_4;

public class example21_02 {
    public static void main(String[] args) {
        int figure = 5; // число строк которое необходимо вывести
        int i ; // переменная задает число, необходимое для расчета количества строк
        int j ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int z; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        for (i = 1 ; i <= figure; i++){
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = 0; j < i; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }

    }
}
