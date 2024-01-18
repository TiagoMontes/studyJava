package Chap2;

import java.util.Scanner;

public class EstruturaCondicional {
//    COMPOSTA
    public static void main(String[] args)
    {
        int x;
        int y;
        Scanner dado;

        dado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        x = dado.nextInt();

        System.out.println("Digite um segundo número: ");
        y = dado.nextInt();

        if( x > y)
        {
            System.out.print("O numero "+x+ " é maior que o numero "+ y);
        }

        if(x < y)
        {
            System.out.print("O numero "+y+ " é maior que o numero "+ x);
        }

        if(x == y){
            System.out.print("Ambos os numero são iguais");
        }
    }
}
