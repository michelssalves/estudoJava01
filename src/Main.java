import java.util.Random;

public class Main {
    public static void main(String[] args) {

            int x = 0;

            while(x < 6){

                Random generate =  new Random();
                int number = generate.nextInt(60);
                System.out.println(number);
                x++;
            }
    }
    static void olaMundo(){

        System.out.println("Hello world!");
    }
    static int somar(int x, int y){

           int soma =  x + y;
            return soma;
    }
}