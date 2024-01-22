package tasks;

import java.util.Scanner;

public class ILikeJava {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите фразу \"I like Java!!!\":");
        String str = console.nextLine();



        boolean conJava = str.contains("Java");
        System.out.println("Содержит ли строка подстроку \"Java\": "+conJava);

        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Начинается ли строка с подстроки \"I like\": "+startsWithILike);

        boolean endsWith = str.endsWith("!!!");
        System.out.println("Заканчивается ли строка на подстроку \"!!!\": "+endsWith);

        if(conJava&&startsWithILike&&endsWith){
            String upperStr = str.toUpperCase();
            System.out.println("Верхний регистр: "+upperStr);
        }

        String replecedStr = str.replace('a','o');
        String subStr = replecedStr.substring(7,11);
        System.out.println("Подстрока Jovo: "+subStr);

    }
}
