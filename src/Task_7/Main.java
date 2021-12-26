package Task_7;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //Пользователь вводит размер массива и данные с клавиатуры в массив
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Значения внесены в массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();

        //Сравнить элементы массива с заранее заданными константами x, y, z.
        int x=3, y=6, z=9;
        System.out.println("Константы имеющиеся в системе: " + " x= " + x + " y= " + y + " z= " + z);

        //Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        for (int i = 0; i < size; i++) {
             if (array[i]==x || array[i]==y || array[i]==z) {
                 System.out.println(array[i] + " Данное значение имеется в константах");
                 break;
             }
        }
    }
}





