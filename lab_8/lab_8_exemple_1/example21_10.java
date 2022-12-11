/*
Пример 10. Выполнить чтение из одного файла и запись в дру- гой
файл с использованием класса PrintWriter.
 */
package lab_8.lab_8_exemple_1;
import java.io.*;
public class example21_10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter Out = null;
        try {
// Создание потоков
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\TMP\\TASK_1.txt"),"cp1251"));
            Out = new PrintWriter("C:\\TMP\\TASK_6.txt","cp1251");
// Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                Out.println(lineCount + ": " + s);
            }
        } catch (IOException e){
            System.out.println("Arghhh" + e);
        } finally{
            br.close();
            Out.flush();
            Out.close();
        }
    }
    /*
Представленный ниже фрагмент кода демонстрирует работу
PrintWriter с системным выходным потоком:

    PrintWriter out = new PrintWriter(System.out);
    int lineCount = 0;
    String s;
// Вывод информации из файла на монитор
    while ((s = br.readLine()) != null)
    {
    lineCount++;
    out.println(lineCount + ": " + s);
    }
     */

}
