package lab_3;


public class example21_07 {
    public static void main(String[] args) {
        int arrNum = 10;
        char [] arr = new char[arrNum];
        char ch = 'a';
        int count = 0;

        while (count <= arr.length - 1) {
            arr[count] = ch;
            count++;
            ch+=2;
        }
//        for (char aChar : arr) {
//            System.out.println(aChar);
//        }

        int i = arrNum-1 ;
        while (i >= 0){
            System.out.print(arr[i]);
            i--;
        }
    }
}
