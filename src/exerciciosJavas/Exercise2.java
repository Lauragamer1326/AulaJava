package exerciciosJavas;

import java.util.Scanner;

public class Exercise2{
    public static void main(String[] args){
        // Números do primeiro conjunto
        int num1 = 8;
        int num2 = 9;
        int num3 = 7;

        // Números do segundo conjunto
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;

        // Calcula as médias
        double media1 = calcularMedia(num1, num2, num3);
        double media2 = calcularMedia(num4, num5, num6);

        // Calcula a soma das médias
        double somaDasMedias = media1 + media2;

        // Calcula a média das médias
        double mediaDasMedias = calcularMedia(media1, media2);

        // Exibe os resultados
        System.out.println("Média do primeiro conjunto: " + media1);
        System.out.println("Média do segundo conjunto: " + media2);
        System.out.println("Soma das médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }

    // Função para calcular a média de três números
    public static double calcularMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0; // Divisão por 3.0 para obter uma média decimal
    }

    // Função para calcular a média de duas médias
    public static double calcularMedia(double media1, double media2) {
        return (media1 + media2) / 2;
    }
}

