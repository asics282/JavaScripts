package org.example.hw3.task2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Task2 {
    public static void main(String[] args) {
        Product product1 = new Product("Авто", "Германия", 3500.00, 3000000, 1);
        Product product2 = new Product("Компьютер", "Япония", 3.00, 100000, 1);
        Product product3 = new Product("Смартфон", "Китай", 0.3, 50000, 2);
        Product product4 = new Product("Микровалновая печь", "Китай", 4.0, 5000, 2);
        Product product5 = new Product("Брус деревянный", "Россия", 5.00, 500, 3);
        Product product6 = new Product("Игрушка", "Беларусь", 0.1, 300, 3);

        // Создаем массив товаров
        List<Product> allProduct = new ArrayList<>();

        // Помещаем в массив все товары
        allProduct.add(product1);
        allProduct.add(product2);
        allProduct.add(product3);
        allProduct.add(product4);
        allProduct.add(product5);
        allProduct.add(product6);

        // Запрос у пользователя сорта
        System.out.println("Введите сорт товара: ");
        Scanner console = new Scanner(System.in);
        int sort = console.nextInt();

        Integer priceTemp = null;
        Product prItem = null;
        boolean flag = false;


        // Создаем результирующий список
        // List<Product> result = new ArrayList<>();

        for (Product product : allProduct) {
            // если ...  и сорт товара равн заданному сорту
            if (flag == false && product.getSort() == sort) {
                // при сваеваем временной переменной цену продукта
                priceTemp = product.getPrice();
                prItem = product;
                flag = true;
            } else if (product.getSort() == sort && product.getPrice() < priceTemp) {
                prItem = product;
            }
        }

        // печать результата в консоль
        System.out.printf("На товар %s сотра %d минимальная цена: %d", prItem.getName(), prItem.getSort(), prItem.getPrice());
    }
}
