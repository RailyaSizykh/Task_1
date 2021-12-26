package Task_8;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    //Напишите программу, где пользователь вводит любое целое положительное число n.
    // А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int a = num.nextInt();
        int summa = 0;
        for (int i = 0; i <= a; i++) {
                if (i % 2 != 0 ) {
                    summa = (summa + i);
                }
        }
        System.out.println("Сумма нечетных чисел от 1 до " + a + " равна: "+ summa);
    }
}
