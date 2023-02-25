package org.example.hw5.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.example.hw5.task2.Task2.counterWords;

/*
Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом)
 */
public class Task2 {
    public static void main(String[] args) {
        //считываем строку с клавиатуры
        System.out.println("Программа для подсчета количества включений искомого слова в строке");
        System.out.println();
        System.out.print("Введите текст: ");
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        System.out.print("Введите слово: ");
        String word = console.nextLine();
        System.out.printf("Слово %s в тексте встречается %d раз(а)", word, counterWords(text, word));
    }

    public static int counterWords(String text, String word) {
        String lowerText = text.toLowerCase();
        String lowerWord = word.toLowerCase();
        // заменяем знаки применания на ничто)))
        String newStr = lowerText.replaceAll("[.,?!:]", "");
        // создаем массив, где элементом будет слово в строке, разделенное по пробелам (меняем два пробела на один)
        String[] words = newStr.replaceAll("  ", " ").split(" ");
        Map<String, Integer> counterWords = new HashMap<>();
        // создаем для слова, которое ищем "ключ - значение"
        counterWords.put(lowerWord, 0);
        for (String string : words) {
            //если словарь содержит ключ == lowerWord
            if (counterWords.containsKey(lowerWord)) {
                // то записываем в значение по ключу значение, которое имеет ключ на данный момент
                counterWords.put(string, counterWords.get(lowerWord) + 1);
            }
        }
        // возвращаем значение ключа (слова, которое ищем)
        return counterWords.get(lowerWord);
    }
}
