package HW2;
import java.util.Scanner;
// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int size = input.nextInt();
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите число:");

        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        System.out.print ("Введенный массив:");
        for (int i = 0; i < size; i++) {
        System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();

        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i]<=array[i-1]){
                flag = false;
                break;
            }
        }
        if (flag == true){System.out.print("Введенная последовательность чисел является возрастающей");}
        else {System.out.print("Введенная последовательность чисел НЕявляется возрастающей");}
    }
}