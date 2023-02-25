package org.example.hw5.task1;

import java.util.HashMap;
import java.util.Map;

/*
Подсчитать количество вхождения каждого слова
Пример: Россия идет вперед всей планеты. Планета — это не Россия.
 */
public class Task1 {
    public static void main(String[] args) {
    String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
    counterWords(str);
    }
    //метод подсчета количества вхождения каждого слова в предложении
    public static void counterWords(String s){
        // приводим строку к нижнему регистру (требование по заданию)
        String str = s.toLowerCase();
        // заменяем знаки применания на пробелы
        String newStr = str.replaceAll("[.—]","");
        // создаем массив, где элементом будет слово в строке, разделенное по пробелам (меняем два пробела на один)
        String[] words = newStr.replaceAll("  "," ").split(" ");
        Map<String, Integer> counterWords = new HashMap<>();
        // перебираем ключи map через цикл foreach
        for (String string : words) {
            // если ключа нет, то создаем его
            counterWords.putIfAbsent(string, 0);
            // если ключ есть, то считаем значения по циклу
            counterWords.put(string, counterWords.get(string)+1);
        }
        // вывод результата
        for (String string : counterWords.keySet()) {
            System.out.println(string + ": " + counterWords.get(string));
        }
    }
}
