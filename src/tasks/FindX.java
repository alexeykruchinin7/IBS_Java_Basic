package tasks;

import java.util.Scanner;

public class FindX {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите уравнение:");
        String raw = console.nextLine();

        char sign = raw.charAt(1);
        
        int firstNumber = Character.getNumericValue(raw.charAt(0));
        int secondNumber = Character.getNumericValue(raw.charAt(2));
        int thirdNumber = Character.getNumericValue(raw.charAt(4));

        int value = 0;

        if(raw.charAt(0)=='x'){
            if(sign=='+'){
                value=thirdNumber-secondNumber;
            }
            else{
                value=thirdNumber+secondNumber;
            }}
        else if(raw.charAt(2)=='x'){
            if(sign=='+'){
                value=thirdNumber-firstNumber;
            }
            else{
                value=firstNumber-thirdNumber;
            }
        }
        else if(raw.charAt(4)=='x'){
            if(sign=='+'){
                value=firstNumber+secondNumber;
            }
            else{
                value=firstNumber-secondNumber;
            }
        }
        System.out.println("Результат: "+value);
    }
}
