package Task_5;

import java.util.Scanner;

public class Main {
    //Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите 2 числа, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’");
        double a, b;
        a = num.nextDouble();
        b = num.nextDouble();
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        // В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции
        double res;
        switch (c) {
            case '+':
                res = a + b;
                System.out.println("Результат " + res);
                break;
            case '-':
                res = a - b;
                System.out.println("Результат " + res);
                break;
            case '*':
                res = a * b;
                System.out.println("Результат " + res);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Деление на 0 запрещено");
                    break;
                }
                res = a / b;
                System.out.println("Результат " + res);
                break;
                default:
                System.out.println("Введен не корректный символ");
                break;
                    }
                   }
}