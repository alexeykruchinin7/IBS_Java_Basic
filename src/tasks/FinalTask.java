package tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FinalTask {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String answer = "Заархивированный вирус";
        int strikes = 0;

        System.out.println("Отгадай загадку - \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\"");
        System.out.println();

        boolean chance = false;

        while(strikes<3) {

            System.out.println("Введите ответ на загадку:");
            String answerOfUser = console.nextLine();

            if(strikes == 0 && answerOfUser.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
                System.out.println();
                break;
            }

            else if(strikes == 0 && answerOfUser.equalsIgnoreCase("Подсказка"))
            {
                chance=true;
                System.out.println("Возможно дед - это вирус, и причем он одет - заархивирован!");

            }

            else if(strikes == 1 && !answerOfUser.equalsIgnoreCase(answer) && chance) {
                System.out.println("Обидно, приходи в другой раз");
                System.out.println();
                break;
            }

            else if(strikes == 0 && !answerOfUser.equalsIgnoreCase(answer)) {
                System.out.println("Подумай еще!");
                System.out.println();
            }

            else if(strikes == 1 && answerOfUser.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
                System.out.println();
                break;
            }

            else if(strikes == 1 && answerOfUser.equalsIgnoreCase("Подсказка"))
            {
                System.out.println("Подсказка уже недоступна!");
                continue;

            }

            else if(strikes == 1 && !answerOfUser.equalsIgnoreCase(answer)) {
                System.out.println("Подумай еще!");
                System.out.println();
            }

            else if(strikes == 2 && answerOfUser.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
                System.out.println();
                break;
            }

            else if(strikes == 2 && answerOfUser.equalsIgnoreCase("Подсказка"))
            {
                System.out.println("Подсказка уже недоступна!");
                continue;
            }

            else if(strikes == 2 && !answerOfUser.equalsIgnoreCase(answer)) {
                System.out.println("Обидно, приходи в другой раз");
                System.out.println();
            }
                  strikes++;
        }
    }
}

