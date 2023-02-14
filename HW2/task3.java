package HW2;

/*Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
Массив зада изначально*/
public class task3 {
    public static void main(String [] args) {
        int [] array = {1, -2, 38, 4, 55, -3, 5};

        System.out.print("Исходный массив: ");
        // печать исходного массива
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

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