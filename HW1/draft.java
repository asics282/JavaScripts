/**
 * draft
 */
public class draft {

    public static void main(String[] args) {
        String str = "the sky is blue"; // объявление строки
        StringBuilder newstr = DelSpase(str);
        String reverse_str = newstr.toString();
        String str1 = Method(reverse_str);
        System.out.println(str1);
    }

        // функция замены в строке двух пробелов одним
        public static StringBuilder DelSpase(String str){
            //удаление пробелов вначале и в конце строки
            str = str.trim();
            // Замена двух пробелов одним
            while (str.indexOf("  ") >= 0) {
                str.replace("  ", " ");
            }
            return new StringBuilder(str);
        }

        public static String Method(String str) {
        // объявление массива и помещение в него строки, разделенную по пробелам
        String[] array = str.split(" ");
            for (int i = 0; i < array.length / 2; i++) {
                // создание временной переменной, хранящей последний элемент массива
                String temp = array[array.length / 2 - i - 1];
                array[array.length / 2 - i - 1] = array[i];
                array[i] = temp;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            String arrayToString = String.join(" ", array);
            return arrayToString;
        }
    }