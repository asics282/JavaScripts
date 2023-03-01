package org.example.hw6;

import org.example.hw3.task1.Product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
 */
public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Lenovo", 14.0, 250, 30000);
        Notebook notebook2 = new Notebook("Macbook", 13.0, 500, 200000);
        Notebook notebook3 = new Notebook("Xiaomi", 15.0, 150, 45000);
        Notebook notebook4 = new Notebook("HP", 14.5, 300, 55000);
        Notebook notebook5 = new Notebook("Huawei", 14.5, 600, 40000);

        // создание множества ноутбуков
        HashSet<Notebook> allNotebooks = new HashSet<>();
        allNotebooks.add(notebook1);
        allNotebooks.add(notebook2);
        allNotebooks.add(notebook3);
        allNotebooks.add(notebook4);
        allNotebooks.add(notebook5);

        // показываем ассортимент магазина
        System.out.println("Ассортимент магазина");
        System.out.println();
        for (Notebook notebook:allNotebooks) {
            System.out.printf("Ноутбук %s с диагональю %.2f, объемом жесткого диска в %dГб: %d руб%n", notebook.getName(), notebook.getDisplay(), notebook.getHdd(), notebook.getPrice());
        }

        // ввод критерия поиска
        System.out.println();
        System.out.printf("Сколько вы готовы отдать за ноутбук (минимальная цена 30000): ");
        Scanner console = new Scanner(System.in);
        int findPrice = console.nextInt();

        // создание списка с результатом
        List<Notebook> result = new ArrayList();
        // фильтрация (выдача ноутбуков с ценой выше 100000)
        for (Notebook notebook:allNotebooks) {
            if(notebook.getPrice() <= findPrice) result.add(notebook);
        }

        // печать результата в консоль
        System.out.println("Наш магазин может вам предложить следующие модели: ");
        for (Notebook notebook : result) {
            // с помощью спецификатора %s подтягиваем строки, а %d int-ы
            System.out.printf("%s ценой %d%n", notebook.getName(), notebook.getPrice());
        }
    }
}
