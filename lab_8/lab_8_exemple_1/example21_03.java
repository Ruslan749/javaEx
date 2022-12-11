/*
Пример 3. Прочитать и вывести на экран информацию из предварительно
созданного файла с использованием буфера в 5 байт.
 */
package lab_8.lab_8_exemple_1;
import java.io.*;
import java.util.Arrays;
public class example21_03 {
    // считывыние по 5 символов(буфер)
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while(true){
            int count = in.read(buff);
            if (count != -1){ // если не конец файла (данные буфера преобразовываються в строку)
                System.out.println("количество = "+count+", buff = "
                        + Arrays.toString(buff)+", str = "
                        + new String(buff, 0, count,"cp1251"));
            }else {
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        String fileName = "MyFile1.txt";
        InputStream inFile = null; // переменная обяъявляеться до секкции try чтоб не ограничивать область видимости
        try{
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        }catch(IOException e){
            System.out.println("Ошибка открытия-закрытия файла "+fileName+e);
        } finally { // коректное закрытие потока
            if(inFile != null){
                try{
                    inFile.close();
                }catch (IOException ignore){ //  /*NOP*/ ничего не делать
                    /*NOP*/
                }
            }
        }
    }
}
