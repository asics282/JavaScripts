package org.example.hw4.task1;

import java.util.*;
import java.util.LinkedList;
/* Вывести список на экран в перевернутом виде (без массивов и ArrayList)
Пример: 1->2->3->4
Вывод: 4->3->2->1
*/

public class Task1 {
    public static void main(String[] args) {
        // объявление массива
        LinkedList<Integer> list = new LinkedList<Integer>();
        // заполнение массива через консоль
        System.out.print("Введите количество элементов: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        for (int i = 1; i < number+1; i++) {
            list.add(i);
        }
        // показываем какой был список
        System.out.println("Список до реверса: " + list);


        list = reverseLinkedList(list);
        System.out.println("Список после переворота: " + list);

        reverseLinkedListCollection(list);
        System.out.println("Вновь перевернутый список с использованием класса Collection: " + list);
    }

    // метод для переворачивания списка
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list)
    {
        for (int i = 0; i < list.size()/2; i++) {
            // объявление временной переменной под индексом i
            Integer temp = list.get(i);
            // меняем элементы i и n, далее i+1 и n-1 до серидины списка
            list.set(i, list.get(list.size() - i - 1));
            // меняем элементы после середины
            list.set(list.size() - i - 1, temp);
        }
        return list;
    }

    public static void reverseLinkedListCollection(LinkedList<Integer> list) {
        Collections.reverse(list);
    }
}
