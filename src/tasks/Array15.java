package tasks;

import java.util.Random;

public class Array15 {
    public static void main(String[] args) {

        int[] array = new int[15];
        Random random = new Random();

        for (int i =0; i<array.length; i++){
            array[i]=random.nextInt(41)-20;
        }

        System.out.println("Данный массив:");
        for(int element:array){
            System.out.print(element+",");
        }



        System.out.println();

        int max = array[0];
        int min = array[0];

        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }

        System.out.println("Максимальный элемент массива: "+max);
        System.out.println("Минимальный элемент массива: "+min);

        int midNum = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее значение по модулю: "+midNum);
    }
}
