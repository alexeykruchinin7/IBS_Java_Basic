package tasks;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число:");
        String strnum1=console.nextLine();

        System.out.println("Введите второе число:");
        int num2=console.nextInt();

        int num1=Integer.parseInt(strnum1);

        if(num1>num2){
            System.out.println("большее число равно "+num1);
            System.out.println("меньшее число равно "+(double)num2);
        }
        else if(num2>num1){
            System.out.println("большее число равно "+num2);
            System.out.println("меньшее число равно "+(double)num1);
        }
        else {
            System.out.println(num2);
        }



    }
}
