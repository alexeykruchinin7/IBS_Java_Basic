package tasks;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class OperatorsXYZ {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();

        int avg_num = (x + y + z) / 3;
        System.out.println(avg_num);


        int average_num =(int) Math.floor(avg_num/2);
        System.out.println(average_num);

        if(average_num>3)
            System.out.println("Программа выполнена корректно");
    }
}
