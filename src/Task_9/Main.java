package Task_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        double array[] = new double[size];
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }
        System.out.print("Значения внесены в массив: ");
        double summa = 0;
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
            summa = (summa + array[i]);
        }
        System.out.println();
        //Посчитайте среднее арифметическое элементов массива.
        double srednee = summa / size;
        System.out.println("Среднее арифметическое: " + srednee);

        //После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i] * srednee);
        }
    }
}
