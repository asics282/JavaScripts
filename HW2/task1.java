package HW2;
// Дана последовательность N целых чисел. Найти сумму простых чисел.
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        System.out.println("");
        int num = scanner.nextInt();
        int summ = 0;
        for (int i = 0; i < n-1; i++) {
            int num2 = scanner.nextInt();
            if(num2%num != 0 && num2%2 != 0){
                summ += num2;
                }
            num = num2;
        }
        scanner.close();
        System.out.println(summ);

    }
}
