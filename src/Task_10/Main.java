package Task_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Пользователь вводит данные с клавиатуры в матрицу
        System.out.println("Введите размер матрицы - строки и столбцы: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int[][] matrix = new int[x][y];
        System.out.println("Размер матрицы: " + x + " x " + y);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Введите элемент матрицы [" + i + "][" + j + "]:");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println();
        //Вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
         for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("Первая строка матрицы, умноженная на 3: " + matrix[0][j] * 3);
            }
    }
}






