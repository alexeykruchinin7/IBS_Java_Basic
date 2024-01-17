package tasks;

import java.util.Scanner;

public class NewArray1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int arr_length = console.nextInt();

        double[] array = new double[arr_length];
        for (int i = 0; i < arr_length; i++) {
            System.out.println("Введите элементы массива:");
            array[i] = console.nextDouble();
        }

        double sum=0;
        for(double element : array){
            sum+=element;
        }
        double avg_arr = sum/arr_length;

        System.out.println("Вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое:");
        for(double element : array){
            System.out.println(element*avg_arr);
        }


    }
}
