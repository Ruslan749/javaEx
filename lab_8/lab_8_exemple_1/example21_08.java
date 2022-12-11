/*
Пример 8. Прочитать и вывести на экран информацию из трех источников: файла
на диске, интернет-страницы и массива данных типа byte. Указать кодировку,
поддерживающую кириллицу. (Сравнить с работой программы, приведенной в
примере 2.)

 */
package lab_8.lab_8_exemple_1;
import java.io.*;
import java.net.URL;
public class example21_08 {
    public static void readAllByByte(Reader in) throws IOException {
        while (true){
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1){ // признак конца файла
                System.out.println(oneByte);
            } else {
                System.out.println("\n" + " конец ");
                break;
            }
        }
    }
    public static void main(String[] args) {
        try{
// С потоком связан файл
            InputStream inFile = new FileInputStream("C:\\TMP\\LR_8\\TASK_1.txt"); // байтовый поток
            Reader rFile = new InputStreamReader(inFile); // символьный поток (cp1251 - передается «русская» кодировка)
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();
// С потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream(); // байтовый поток
            Reader rUrl= new InputStreamReader(inUrl, "cp1251");

            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();
// С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{5,8,3,9,11});
            Reader rArray = new InputStreamReader(inArray, "cp1251"); ; // символьный поток

            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e){
            System.out.println("wrong!!!" + e);
        }
    }
}
