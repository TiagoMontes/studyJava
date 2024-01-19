package Chap3;

import java.util.*;

public class EstruturaRepeticao {

    public static void main(String[] args)
    {
        int x;
        Scanner dado;

        System.out.print("Digite um numero limite para a repetição: ");
        dado = new Scanner(System.in);
        x = dado.nextInt();

        forLooping(x);

        isPrime(x);

        System.out.println("A seguir, temos uma demonstração de um forEach: ");
        List<Integer> items = new LinkedList<>(Arrays.asList(15, 11, 13, 9, 35));
        items.addFirst(30);

        items.forEach(value -> System.out.println(value * 2));
    }

    public static void forLooping(int x)
    {
        System.out.print("A seguir irei executar usando looping For de forma crescente: ");
        for(int i = 1; i <= x; i++)
        {
            System.out.print(" "+i);
        }

        System.out.println(" ");

        System.out.print("A seguir irei executar usando looping For de forma decrescente: ");
        for(int i = x; i >= 1; i--)
        {
            System.out.print(" "+i);
        }

        System.out.println(" ");

        sumAllValuesPrimeAndComposite(x);
    }

    public static void sumAllValuesPrimeAndComposite(int x)
    {
        int total = 0;
        System.out.print("A seguir irei executar usando looping For de forma onde cada numero é somado com a soma dos anteriores: ");
        for(int i = 1; i <= x; i++)
        {
            total = total + i;
        }
        System.out.print("O total da soma de todos os valores primos e compostos do numero " + x + " é " + total);

        System.out.println(" ");
    }

    public static void isPrime(int x)
    {
        int count = 0;
        for(int i = 1; i <= x; i++)
        {
            if(x % i == 0){
                count++;
            }
        }

        if(count <= 2){
            System.out.println("O numero " + x + " é um numero primo");
        } else {
            System.out.println("O numero " + x + " não é um numero primo");
        }
    }

}
