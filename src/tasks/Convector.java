package tasks;

import java.util.Scanner;

public class Convector {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние:");
        int type = console.nextInt();

        // если масса
        if (type == 1) {

            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция:");
            int unit = console.nextInt();

            System.out.println("Введите количество выбранных единиц:");
            double value = console.nextDouble();

            switch (unit) {
                case 1:
                    System.out.println("Результат:");
                    System.out.println("Килограммы: " + value);
                    System.out.println("Фунты: " + (value * 2.20462));
                    System.out.println("Унции: " + (value * 35.274));
                    break;
                case 2:
                    System.out.println("Результат:");
                    System.out.println("Килограммы: " + (value / 2.20462));
                    System.out.println("Фунты: " + value);
                    System.out.println("Унции: " + (value * 16));
                    break;
                case 3:
                    System.out.println("Результат:");
                    System.out.println("Килограммы: " + (value / 35.274));
                    System.out.println("Фунты: " + (value / 16));
                    System.out.println("Унции: " + value);
                    break;
                default:
                    System.out.println("Неверная единица измерения!");
                    return;
            }
        }

            //расстояние
            else if (type == 2) {

                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут:");
                int unit = console.nextInt();

                System.out.println("Введите количество выбранных единиц:");
                double value = console.nextDouble();

                switch (unit) {
                    case 1:
                        System.out.println("Результат:");
                        System.out.println("Метры: " + value);
                        System.out.println("Мили: " + (value / 1609.34));
                        System.out.println("Ярды: " + (value * 1.09361));
                        System.out.println("Футы: " + (value * 3.28084));
                        break;
                    case 2:
                        System.out.println("Результат:");
                        System.out.println("Метры: " + (value * 1609.34));
                        System.out.println("Мили: " + value);
                        System.out.println("Ярды: " + (value * 1760));
                        System.out.println("Футы: " + (value * 5280));
                        break;
                    case 3:
                        System.out.println("Результат:");
                        System.out.println("Метры: " + (value / 1.09361));
                        System.out.println("Мили: " + (value / 1760));
                        System.out.println("Ярды: " + value);
                        System.out.println("Футы: " + (value * 3));
                        break;
                    case 4:
                        System.out.println("Результат:");
                        System.out.println("Метры: " + (value / 3.28084));
                        System.out.println("Мили: " + (value / 5280));
                        System.out.println("Ярды: " + (value / 3));
                        System.out.println("Футы: " + value);
                        break;
                    default:
                        System.out.println("Неверная единица измерения!");
                        return;
                }
            } else {
                System.out.println("Неверный выбор!");
                return;
            }
        }
    }




















