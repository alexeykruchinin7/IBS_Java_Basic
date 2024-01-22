package tasks;

import java.util.Scanner;

public class OnlyLatin {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку из слов, которые разделяются пробелами:");

        String str = console.nextLine();

        int count=0;

        String[] array = str.split(" ");

        System.out.println("В словах присутствуют следущие латинские буквы:");
        for(String element:array){
            if(element.matches("[a-zA-Z]+")){
                System.out.println(element);
                count++;
            }
        }

        System.out.println("Количество слов, состоящих только из латинский букв равно: "+count);



    }
}
