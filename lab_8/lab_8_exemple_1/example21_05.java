/*
Пример 5. Создать файл на диске, ввести заданное с клавиату- ры
количество строк текста и записать их в файл в формате UTF-8.

 */
package lab_8.lab_8_exemple_1;
import java.io.*;
import java.util.Scanner;
public class example21_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла:\t");
        String fname = sc.nextLine();
        try {
// Создается файл
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            System.out.print("Введите количество строк для записи в файл:\t");
            int n = sc.nextInt();
// Создается поток для записи с учетом типа данных – DataOutputStream,
// и ему в качестве параметра передается поток FileOutputStream
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine(); //очистка буфера
            for (int i = 0; i < n; i++) {
                System.out.println("Введите строку для записи в файл =>\t");
                String s = sc.nextLine();
                dOut.writeUTF(s); // запись отдельных строк
            }
            dOut.flush(); // дописываем несохраненные данные на диск
            dOut.close(); ; // закрываем поток
// Чтение и вывод данных из созданного файла
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while(true) {
                System.out.println(dIn.readUTF());
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
