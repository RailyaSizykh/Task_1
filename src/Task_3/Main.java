package Task_3;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(list[0] + list[2]);
        int t = list[list.length-1];
        list[list.length-1] = list[0];
        list[0] = t;
        System.out.println(list[0] + list[list.length-3]);
    }
}