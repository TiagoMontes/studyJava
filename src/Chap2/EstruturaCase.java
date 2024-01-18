package Chap2;
import java.util.*;

public class EstruturaCase {
    public static void main(String[] args)
    {
        int x;
        Scanner dado;

        System.out.println("Digite um número: ");
        dado = new Scanner(System.in);
        x = dado.nextInt();

        switch (x)
        {
            case 1: System.out.println("Numero 1");
                break;
            case 2: System.out.println("Numero 2");
                break;
            default: System.out.println("Numero maior que 2");
        }
    }
}
