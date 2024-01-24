package tasks;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


import java.util.Scanner;

public class Raws {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = console.nextInt();
        console.nextLine();

        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку " + (i+1) + ": ");
            lines[i] = console.nextLine();
        }

        String maxLine = findMaxLine(lines);
        System.out.println("Строка с максимальным количеством различных символов: " + maxLine);
    }
    private static String findMaxLine(String[] lines) {
        Set<Character> characters = new HashSet<>();
        String maxLine = "";
        int maxLineCount = 0;

        for (String line : lines) {
            characters.clear();
            int lineCount = 0;

            for (char c : line.toCharArray()) {
                characters.add(c);
                lineCount++;
            }

            if (lineCount > maxLineCount) {
                maxLineCount = lineCount;
                maxLine = line;
            }
        }
        return maxLine;
    }
}














