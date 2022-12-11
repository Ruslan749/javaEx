/*
Задание 2. Создать проект, позволяющий из одного, предварительно
созданного программными средствами файла, переписать данные,
соответствующие условию
 - в исходном файле содержится две строки в
формате UTF-8 и 5 чисел типа double.
В результирующий файл переписать вторую строку и положительные числа.
 */
package lab_8.lab_8_exemple_2;

import java.io.*;
import java.util.*;
public class example21_01 {

    public static void main(String[] args) throws Exception{
        WritingFile writingFile = new WritingFile();
        ReaderFile readerFile = new ReaderFile();
    }
}
class WritingFile{
    WritingFile () throws Exception {
        try {
            File file1 = new File("C:\\java_ex\\lab_8\\lab_8_exemple_2\\numbersFile.txt");
            file1.createNewFile();
            if (file1.exists()) {
                System.out.println("Успешно созданый файл numbers");
                System.out.println("Полный путь: " + file1.getAbsolutePath());
            }
            FileWriter fw = new FileWriter(file1);
            fw.write("1.54,2.36,3.53,4.48,5.89\n6.56,7.86,-8.96,9.45,10.31");
            fw.close();
            new ReaderFile(file1.getAbsolutePath());
        }catch (Exception e) {
            System.out.println("ошибка" + e);
        }
    }
}
class ReaderFile {

    ReaderFile (){}
    ReaderFile (String file1) throws Exception{

       try {
           File file2 = new File("C:\\java_ex\\lab_8\\lab_8_exemple_2\\resault.txt");
           file2.createNewFile();
           if (file2.exists()) {
               System.out.println("Успешно созданый файл resault");
               System.out.println("Полный путь: " + file2.getAbsolutePath());
           }
           String[] str1 = new String[5];
           String[] str2 = new String[5];
           String strNum2 ="";
           String strNum1 ="";

           String strDouble = "";

           FileReader fr = new FileReader(file1);
           Scanner scan = new Scanner(fr);

           FileWriter fw = new FileWriter(file2);
           String [] strNumDoub ;
           double[] doub = new double[10];

           int i = 1;
           while (scan.hasNextLine()){
                 str1 = scan.nextLine().split(",");
               i++;
               if (i==2){
                   str2 = scan.nextLine().split(",");
               }
           }

           for (int p = 0; p < str2.length; p++){
                strNum2 += str2[p] + ",";
           }
           for (int q = 0; q < str1.length; q++){
               strNum1 += str1[q] + ",";
           }
           String strNum = strNum1  + strNum2;

           strNumDoub = strNum.split(",");

           for (int q = 0 ; q<strNumDoub.length;q++){
                doub[q] = Double.parseDouble(strNumDoub[q]);
           }

           for (int q = 0; q < doub.length;q++) {
               if (doub[q] > 0){
                   strDouble += doub [q] + " ";
               }
           }

           fw.write("2 строка: " + strNum2 + "\n" + "положительные числа типа Double: " + strDouble );
           fw.close();
           fr.close();

       }catch (Exception e){
           System.out.println("ошибка " + e);
       }

    }
}



