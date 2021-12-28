package Task_13;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Пользователь должен ввести строку из слов, разделенных пробелами.
        // Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
        System.out.println("Напишите строку из слов:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int count=0;
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            //Выведите слова, состоящие только из латиницы.
            if(isLat(strArray[i])) {
                System.out.println(strArray[i]);
                count=count+1;
            }
        }
        //Выведите количество этих слов.
        System.out.println(count);
     }
    private static boolean isLat(String str){
        return str.matches("[a-zA-Z]+");
    }
}
