package Chap1;

import java.util.*;

public class RetanguloParadEstruturado {

    public static void main(String[] args) {
        float altura, largura, area, perimetro;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.print("Digite o valor da altura do retângulo: ");
        altura = entrada.nextFloat();

        System.out.print("Digite o valor da largura do retângulo: ");
        largura = entrada.nextFloat();

        area = calcularArea(altura, largura);
        perimetro = calcularPerimetro(altura, largura);

        mostrarMensagem("O valor da área é ", area);
        mostrarMensagem("O valor do perímetro é ", perimetro);
    }

    public static float calcularArea(float a, float b) {
        return a*b;
    }

    public static float calcularPerimetro(float a, float b) {
        return 2*a + 2*b;
    }

    public static void mostrarMensagem(String msg, float vlr) {
        System.out.println(msg+vlr);
    }
}
