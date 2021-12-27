package Task_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ввести первое  число с клавиатуры и записать его в строковую переменную.
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        String a = input.nextBigInteger().toString();
        System.out.println("Число " + a + " записано в строковую переменную");

        //Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.println("Введите число: ");
        int b = input.nextInt();
        System.out.println("Число " + b + " записано в целочисленную переменную");

        //Сравнить 2 числа и вывести большее на экран .
        int resultInt = Math.max(Integer.parseInt(a), b);
        System.out.println("Большее число: " + resultInt);

        //Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        double resultDouble = Math.min(Double.parseDouble(a), b);
        System.out.println("Меньшее число: " + resultDouble);
        }
    }


