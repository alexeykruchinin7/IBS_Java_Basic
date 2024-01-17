package tasks;

import java.util.Scanner;

public class AnyN {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int n = console.nextInt();

        int sum=0;

        for(int i = 1; i<=n; i+=2){
            sum+=i;
        }
        System.out.println("Сумма всех нечетных чисел равна: "+sum);
    }
}
