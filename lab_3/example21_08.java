package lab_3;

public class example21_08 {
    public static void main(String[] args) {

        char[] chars = new char[10];
        char ch = 'A';
        int count = 0;

        while (count < 10) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'y') {
                ch++;
                continue;
            }
            chars[count] = ch;
            count++;
            ch++;
        }
        // вывод в консоль
        for (char aChar : chars) {
            System.out.println(aChar);
        }

    }
}
