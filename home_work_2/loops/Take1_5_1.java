package home_work_2.loops;

import java.util.Scanner;

public class Take1_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int max = 0;
        if (a != 0) {
            while (a > 0) {
                if (a % 10 > max) max = a % 10;
                a /= 10;
            }
            System.out.println("Наибольшей цифрой является  " + max);
        } else {
            System.out.println("Заданное число не является натуральным!");
            System.out.println(" Попробуйте ещё раз");
        }
    }
}
