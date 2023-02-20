package org.example.hw3.task2;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    String name;
    String country;
    Double weight;
    Integer price;
    Integer sort;
}
