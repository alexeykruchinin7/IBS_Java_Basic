package tasks;

import java.util.Scanner;

public class NewArray {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int arr_length = console.nextInt();

        int[] array = new int[arr_length];
        for(int i=0; i<arr_length;i++){
            System.out.println("Введите элементы массива:");
            array[i]=console.nextInt();
        }

        int x=5;
        int y=7;
        int z=10;

        boolean conX = false;
        boolean conY = false;
        boolean conZ = false;

        for (int i=0; i<arr_length;i++){
            if(array[i]==x){
                conX=true;
            }
            if(array[i]==y){
                conY=true;
            }
            if(array[i]==z){
                conZ=true;
            }

        }

        if (conX || conY || conZ) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Данное значение НЕ имеется в константах");
        }




    }
}
