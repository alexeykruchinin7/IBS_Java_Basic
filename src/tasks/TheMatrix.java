package tasks;

import java.util.Scanner;
public class TheMatrix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите количество строк:");
        int raws = console.nextInt();
        System.out.println("Введите количество столбцов:");
        int columns = console.nextInt();

        int[][] thematrix=new int[raws][columns];
        System.out.println("Введи элементы матрицы:");
        for(int i=0;i<raws;i++){
            for(int j=0;j<columns;j++){
               thematrix[i][j]=console.nextInt();
            }
        }

        System.out.println("Вывод первой строки данной матрицы, где каждый элемент умножен на 3:");
        for (int j=0;j<columns;j++){
            System.out.println(thematrix[0][j]*3+";");
        }


    }
}

