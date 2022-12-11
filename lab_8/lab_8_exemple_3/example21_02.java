/*
Задание 3. Создать проект, позволяющий из одного текстового файла,
содержащего несколько строк (тип String) заранее подготовленного текста
на русском языке (Пушкин, Лермонтов или другой российсмки классик на
Ваш вкус),
построчно переписать в другой текстовый файл слова
начинающиеся с согласных букв..
Требования:
– слова из предложения выделять методом split();
– в новом файле следует указать номер строки, в которой искомые
слова находились в исходном файле;
– для каждой строки указать количество выбранных слов.
 */
package lab_8.lab_8_exemple_3;

import java.io.*;
import java.util.*;

public class example21_02 {
    public static void main(String[] args) {
        try {
            File f1 = new File("./lab_8/lab_8_exemple_3/lorem.txt");
            File f2 = new File("./lab_8/lab_8_exemple_3/resault.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1.getAbsolutePath()),"UTF8"));
            PrintWriter bw = new PrintWriter(f2.getAbsolutePath(),"UTF8");
            String s;
            List <String> consonants= Arrays.asList("й","ц","к","н","г","ш","щ","з","х","ф",
                    "в","п","р","л","д","ж","ч","с","м","т","б");
            int lineCounter=0;
            while ((s=br.readLine())!=null) {
                lineCounter+=1;
                String resultString=""+lineCounter+": ";
                String[] lineArray=s.toLowerCase().split(" ");
                int count=0;
                for (String word : lineArray) {
                    String[] wordCharsArray=word.split("");
                    if (consonants.contains(wordCharsArray[0]) ) {
                        count+=1;
                        resultString+=word+" ";
                    }
                }
                if (count!=0) {
                    bw.println(resultString+count);
                }
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

