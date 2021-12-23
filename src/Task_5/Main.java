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
        double res = 0;
        switch (c) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
                default:
                System.out.println("Не корректный символ");
                break;
                    }
        System.out.println("Результат " + res);
    }
}