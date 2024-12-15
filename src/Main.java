import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] strArray = {"ab", "cd", "ef"};
        String stroke = "12345";
        String zeroIndex = "1203405";
        System.out.println("Массив символов строк(первый вариант) : " + Arrays.toString(charArrays(strArray)));
        System.out.println("Массив символов строк(второй вариант) : " + Arrays.toString(otherArrays(strArray)));
        System.out.println(firstLastCharAt(stroke));
        System.out.println("Позиция первого нуля в строке: " + getZeroIndex(zeroIndex));

    }
    //todo Первый вариант посредством метода toCharArray();
    public static char[] charArrays(String[] array) {

        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i];

        }
        char[] charsArray = str.toCharArray();
        return charsArray;
    }
    //todo Второй вариант
    public static char[] otherArrays(String[] array){

        int length = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                length++;
            }
        }

        char [] c = new char[length];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                c[k] = array[i].charAt(j);
                k++;
            }
        }

        return c;
    }
    //todo Второе задание.
    public static String firstLastCharAt(String str)
    {
        int i = str.length();
        char first = str.charAt(0);
        char last = str.charAt(i - 1);
        String str1 = first  + "" + last;
        return str1;
    }
    //todo Третье задание
    public static int getZeroIndex(String str){
        int zeroIndex = str.indexOf('0');
        return zeroIndex;
    }
}
