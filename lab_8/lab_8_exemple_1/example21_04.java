package lab_8.lab_8_exemple_1;
import java.io.*;
import java.util.Scanner;
public class example21_04 {
    public static void main(String[] args) throws IOException {
        try{
// Создание исходного файла numIsh.txt и запись в него чисел типа float
            File f1 = new File("C:\\TMP");
            f1.mkdirs();
            f1 = new File("C:\\TMP\\chapter_04_08_4(reading).txt"); //для красоты берем свой формат
            f1.createNewFile();
            f1 = new File("C:\\TMP\\chapter_04_08_4(writing).txt"); //для красоты берем свой формат
            f1.createNewFile();

            Scanner sc = new Scanner(System.in, "cp1251");

            DataOutputStream wr = new DataOutputStream(new FileOutputStream("C:\\TMP\\chapter_04_08_4(reading).txt"));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();

            System.out.println("Введите числа");
            for (int i =0; i < count; i++){
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();
// Создание файла numRez.txt и переписывание в него чисел из numIsh.txt
            DataInputStream rd = new DataInputStream(new FileInputStream("C:\\TMP\\chapter_04_08_4(reading).txt"));
// поток для записи в результирующий файл numRez.txt
            wr = new DataOutputStream(new FileOutputStream("C:\\TMP\\chapter_04_08_4(writing).txt"));

            try{
                while (true){ // чтение-запись из одного файла в другой
                    float num = rd.readFloat();
                    wr.writeFloat(num);;
                    System.out.println("Число: " + (float)num);
                }
            } catch (EOFException e){}
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}
