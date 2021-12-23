package Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ввести три числа с клавиатуры x, y, z
        Scanner num = new Scanner(System.in);
        System.out.println("Введите значения для x, y, z");
        double x, y, z;
        x = num.nextDouble();
        y = num.nextDouble();
        z = num.nextDouble();

        //Найти и вывести в консоль среднее арифметическое этих чисел
        double Srednee = (x + y + z) / 3;
        System.out.println("Среднее арифмитическое "+Srednee);

        //Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        double Delenie = Math.floor((Srednee/2));
        System.out.println("1/2 и округление в меньшую сторону  "+Delenie);


        //Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if(Delenie>3)
            System.out.println("Программа выполнена корректно");
    }
}
