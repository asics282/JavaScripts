package org.example.hw4.task2;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class Task2 {
    public static void main(String[] args) {
        // объявление строки
        String s = "([]{}";
        System.out.println(isValid(s));
        System.out.println(isValid1(s));
    }

    public static String isValid(String s) {
        //объявление списка
        Deque<String> list = new LinkedList<>();
        //получение списка элементов строки
        String[] array = s.split("");
        return Arrays.toString(array);
    }

    public static boolean isValid1(String s) {
        //если длина строки НЕчетное значение, то сразу false
        if (s.length() % 2 != 0) return false;
        //создаем пустую очередь с помощью LinkedList
        Deque<Character> list = new LinkedList<>();
        // проходим по списку
        for (char el : s.toCharArray()) {
            // если строка начинается с открытых скобок '(', '[', '{'
            if (el == '(' || el == '[' || el == '{') {
                //добавляем символ в список
                list.add(el);
            } else {
                // если спискок НЕпуст
                if (!list.isEmpty()) {
                    // если первый элемент списка и элемент явл-ся противоположными скобками
                    if ((list.peekFirst() == '{' && el == '}')
                            || (list.peekFirst() == '[' && el == ']')
                            || (list.peekFirst() == '(' && el == ')')) {
                        // удаляем первый элемент
                        list.removeFirst();
                    }
                } else return false;
            }
        }
        return true;
    }
}