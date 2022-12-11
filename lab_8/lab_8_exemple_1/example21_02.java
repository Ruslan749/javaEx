/*
Пример 2. Прочитать и вывести на экран информацию из трех источников:
файла на диске, интернет-страницы и массива типа byte.
 */
package lab_8.lab_8_exemple_1;
import java.io.*;
import java.net.URL;
public class example21_02 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print(oneByte + "\t");
            } else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        try{
            // с потоком связан файл
            InputStream inFile = new FileInputStream("MyFile1.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();
            // с потоком связана интернет страница
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            // с потоком связан массив типа байт
            InputStream inArray = new ByteArrayInputStream(new byte[]{7,9,3,7,4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        } catch (IOException e){
            System.out.println("Ой-йой! "+ e);
        }
    }
}
