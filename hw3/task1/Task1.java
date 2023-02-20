package org.example.hw3.task1;
import java.util.List;
import java.util.ArrayList;

/* Задача 1. Дан массив записей: наименование товара, цена, сорт.
Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Task1 {
    public static void main(String[] args) {
        Product product1 = new Product("Мука высший сорт", 100, 1);
        Product product2 = new Product("Молоко жирность 3,2 %", 90, 3);
        Product product3 = new Product("Рис высший сорт", 150, 2);
        Product product4 = new Product("Говядина высший сорт", 400, 1);
        Product product5 = new Product("Капуста", 50, 3);

        // Создание неизменяемого списка товаров
        List<Product> allProducts = List.of(product1, product2, product3, product4, product5);
        // Создание списка с результатом
        List<Product> result = new ArrayList();

        for (Product product : allProducts) {
            // если сорт продукта 1 ИЛИ 2 сорта И название продукта содержит "высший" в нижнем регистре
            if (product.getSort() == 1 || product.getSort() == 2 && product.getName().toLowerCase().contains("высший")){
                // если список не содержит элементоа, то добавляем продукт в результирующий список
                if (result.isEmpty()) result.add(product);
                else {
                    // если цена продукта больше цены первого продукта
                    if (product.getPrice() > result.get(0).getPrice()){
                        result.clear(); // очищаем список
                        result.add(product); // добавляем продукт в список
                    }
                    // сравниваем цены
                    else if (product.getPrice().equals(result.get(0).getPrice())){
                        result.add(product);
                    }
                }
            }
        }
        // печать результата в консоль
        for (Product prod : result) {
            // с помощью спецификатора %s подтягиваем строки, а %d int-ы
            System.out.printf("%s стоит %d", prod.getName(), prod.getPrice());
        }
    }
}
