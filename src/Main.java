import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myHomeGeektech;
        final int NUM=0;
        String word = "Hard";
        myHomeGeektech=NUM+" "+word;
        System.out.println(myHomeGeektech);
        if (NUM < 0){
            System.out.println("Вы ввели отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы ввели положительное число");
        }else {
            System.out.println("Вы ввели 0");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name =scanner.nextLine();
        System.out.println("Hello"+name +"!");    }
}