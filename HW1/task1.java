import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // cоздаем объект класса Scanner
        System.out.print("Введите строку: ");
        String str = console.nextLine(); // Читаем с клавиатуры строку текста.
        // String str = "a good   example"; // объявление строки
        StringBuilder new_str = new StringBuilder();
        String[] arrayString = str.split(" "); // переносим строку в массив
        for (int i = arrayString.length - 1; i >= 0; i--) { //обход массива с конца
            new_str.append(arrayString[i]); // собираем элементы массива в строку
            if (i != 0) { 
                new_str.append(" ");
            }
        }
        String reverse_str = new_str.toString(); // 
        String print_str = reverse_str.replaceAll("\\s+", " "); // замена всех дублей пробелов на пробел
        System.out.println(print_str);
    }
}