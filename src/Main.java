import java.util.Random;
import java.util.Scanner;

public class Main {

    static int x;
    public static void main(String[] args) {

        final double PI = 3.1445654;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fill your name:");

        String name = scanner.nextLine();

        System.out.println("Ola, " + name + " tente a sorte com os numeros abaixo:");

            int x = 0;

            while(x < 6){

                Random generate =  new Random();
                int number = generate.nextInt(60);
                System.out.println(number);
                x++;
            }

        System.out.println(name + " Seu nome é igual a Cabra Macho " + name.equals("cabraMacho"));
        System.out.println(name + " Seu nome minusculo " + name.toLowerCase());
        System.out.println(name + " Seu nome maiusculo " + name.toUpperCase());
        System.out.println(name + " Seu nome limpo de espaços " + name.trim());
        System.out.println(name + " Seu nome a partir do caracter 5 " + name.substring(5));
        System.out.println(name + " Seu nome possui " + name.length() + " letras");
        System.out.println(" Seu nome possui a letra A? " + name.contains("A"));
        System.out.println("Em qual posicao inicial o Alves? " + name.indexOf("Alves"));
        System.out.println("Seu nome se repete e se sim qual a posição da ultima vez? " + name.lastIndexOf("Alves"));

    }

}