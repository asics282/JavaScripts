package HW2;
/*Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
Ввод массива с клавиатуры*/

import java.util.Scanner;
public class task3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
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

        int sumIndexTwoSign = 0; // сумма индексов двузначных элементов
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                sumIndexTwoSign = sumIndexTwoSign + i;
            }
        }
        System.out.println();
        System.out.print("Новый массив: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sumIndexTwoSign;
            }
            System.out.print(array[i]+" ");
        };
    }
}
