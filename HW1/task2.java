/*
Дана последовательность целых чисел, оканчивающаяся нулем.
Найти сумму положительных чисел, после которых следует отрицательное число.
Пример: 1 2 1 2 -1 1 3 1 3 -1 0
2 -1 переход - 2 в сумму
3 -1 переход 3 в сумму
суммарно выведет 5
 */

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // cоздаем объект класса Scanner
        System.out.print("Введите число: "); // запрос ввода
        int number = console.nextInt(); // считываем с клавиатуры число
        int sum = 0;
        while (number != 0){
            System.out.print("Введите число: ");
            int number2 = console.nextInt();
            if (number2 < 0 && number > 0){
                sum = sum + number;}
        number = number2; // перезапись
         }
         System.out.println("Сумма положительных чисел равна: " + sum);
    }
}
