package Task_12;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        //Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        //Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        String a = "I Like Java !!!";
        if ((a.contains("Java")&(a.startsWith("I Like"))&(a.endsWith("!!!")))) {

            //Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
            System.out.println(a=a.toUpperCase(Locale.ROOT));}

        //Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
        String result = a.substring(6,11);
        System.out.println(result.replace("A","O"));

        }
    }








