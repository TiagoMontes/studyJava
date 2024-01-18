package Chap1;

import Entities.Retangulo;

import java.util.*;

public class RetanguloOrientadoAObjetos {

    public static void main(String[] args){
        float altura, largura, area, perimetro;
        Retangulo r = new Retangulo();
        Scanner entrada;

        entrada = new Scanner(System.in);
        System.out.print("Digite o valor da altura do retângulo: ");
        r.setAltura(entrada.nextFloat());

        System.out.print("Digite o valor da largura do retângulo: ");
        r.setLargura(entrada.nextFloat());

        mostraMensagem("O valor da área é: ", r.calculaArea());
        mostraMensagem("O valor do perímetro é: ", r.calculaPerimetro());
    }

    public static void mostraMensagem(String msg, float vlr) {
        System.out.println(msg+vlr);
    }
}
