package tasks;

import java.util.Scanner;

public class MoneyConvector {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите курс доллара:");
        double course = console.nextDouble();

        System.out.println("Введите количество рублей:");
        double sum = console.nextDouble();

        //итоговый резульат
        double result = sum/course;

        System.out.printf("ИТОГ: %.2f + рублей", result);
    }
}
