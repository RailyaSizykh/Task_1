package Task_6;

import java.util.Scanner;

public class Main {
    //Пользователю предлагается на выбор ввести массу или расстояние
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - расстояние, 2 - масса");
        double value;
        value = scanner.nextDouble();
        if (value == 1) {
            System.out.println("Вы выбрали расстояние");
            // Пользователю предлагается выбрать единицу измерения
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");

            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println("Единица измерения - метр. Введите число");
                    //Пользователю предлагается ввести количество выбранных единиц
                    double meters = scanner.nextDouble();
                    System.out.println("Вы ввели " + meters + " м");
                    System.out.println("Мили: " + meters * 0.006213);
                    System.out.println("Ярды: " + meters * 1.09361);
                    System.out.println("Футы: " + meters * 3.28084);
                }
                break;
                case 2: {
                    System.out.println("Единица измерения - миля. Введите число");
                    //Пользователю предлагается ввести количество выбранных единиц
                    double miles = scanner.nextDouble();
                    System.out.println("Вы ввели " + miles + " миль");
                    System.out.println("Метры: " + miles * 1609.34);
                    System.out.println("Ярды: " + miles * 1760);
                    System.out.println("Футы: " + miles * 5280);
                }
                break;
                case 3: {
                    System.out.println("Единица измерения - ярд. Введите число");
                    //Пользователю предлагается ввести количество выбранных единиц
                    double yard = scanner.nextDouble();
                    System.out.println("Вы ввели " + yard + " ярд");
                    System.out.println("Метры: " + yard * 0.9144);
                    System.out.println("Мили: " + yard * 0.000568);
                    System.out.println("Футы: " + yard * 3);
                }
                break;
                case 4: {
                    System.out.println("Единица измерения - фут. Введите число");
                    //Пользователю предлагается ввести количество выбранных единиц
                    double fut = scanner.nextDouble();
                    System.out.println("Вы ввели " + fut + " фут");
                    System.out.println("Метры: " + fut * 0.3048);
                    System.out.println("Ярды: " + fut * 0.333333);
                    System.out.println("Мили: " + fut * 12000);
                }
                break;
                default: {
                    System.out.println("Не корректный символ");
                }
                break;
            }
        } else if (value == 2) {
            System.out.println("Вы выбрали массу");
            //Пользователю предлагается выбрать единицу измерения.
            System.out.println("Выберите единицу измерения: 1 - кг, 2 - фунт, 3 - унция, 4 - карат");

            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println("Единица измерения - килограмм. Введите число");
                    //Пользователю предлагается ввести количество выбранных единиц
                    double kg = scanner.nextDouble();
                    System.out.println("Вы ввели " + kg + " кг");
                    System.out.println("Фунты: " + kg * 2.20462);
                    System.out.println("Унции: " + kg * 35.274);
                    System.out.println("Караты: " + kg * 5000);
                }
                break;
                case 2: {
                    System.out.println("Единица измерения - фунт.Введите число");
                    //Пользователю предлагается ввести количество выбранных единиц
                    double funt = scanner.nextDouble();
                    System.out.println("Вы ввели " + funt + " фунт");
                    System.out.println("Килограммы: " + funt * 0.453592);
                    System.out.println("Унции: " + funt * 16);
                    System.out.println("Караты: " + funt * 2267.96);
                }
                break;
                case 3: {
                    System.out.println("Единица измерения - унция. Введите число");
                    //Пользователю предлагается ввести количество выбранных единиц
                    double unc = scanner.nextDouble();
                    System.out.println("Вы ввели " + unc + " унций");
                    System.out.println("Фунты: " + unc * 0.0625);
                    System.out.println("Килограммы: " + unc * 0.0283495);
                    System.out.println("Караты: " + unc * 141.748);
                }
                break;
                case 4: {
                    System.out.println("Единица измерения - карат. Введите число");
                    //Пользователю предлагается ввести количество выбранных единиц
                    double karat = scanner.nextDouble();
                    System.out.println("Вы ввели " + karat + " карат");
                    System.out.println("Фунты: " + karat * 0.000440925);
                    System.out.println("Килограммы: " + karat * 0.0002);
                    System.out.println("Унции: " + karat * 0.00705479);
                }
                break;
                default: {
                    System.out.println("Не корректный символ");
                }
                break;
            }
        }
    }
}




