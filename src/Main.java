import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fill your name:");

        String name = scanner.nextLine();

        System.out.println(name);

            int x = 0;

            while(x < 6){

                Random generate =  new Random();
                int number = generate.nextInt(60);
                System.out.println(number);
                x++;
            }
    }

}