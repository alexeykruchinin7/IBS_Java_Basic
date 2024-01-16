package tasks;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        System.out.println("введите 1 число");
        int x = console.nextInt();
        System.out.println("введите 2 число");
        int y = console.nextInt();

        System.out.println("введите один любой символ: +, -, *, /");
        char operation = console.next().charAt(0);

        int result;

        switch (operation){
            case '+':
                result=x+y;
                break;

            case '-':
                result=x-y;
                break;

            case '*':
                result=x*y;
                break;

            case '/':
                result=x/y;
                break;

            default:
                System.out.println("ввели некоректный символ");
                return;
        }

        System.out.println(result);



    }

}
