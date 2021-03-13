package exercicio1;

import java.util.Scanner;

public class Triangulo {

    private double base = 0.0;
    private double altura = 0.0;
    private double area = 0.0;

    public void exibirInformacoes() {
        calcularArea(this.altura, this.base);

        System.out.println("Informações sobre o triangulo: ");
        System.out.println("Altura = " + this.altura);
        System.out.println("Base = " + this.base);
        System.out.println("Area = " + this.area);
    }

    public void lerDados() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a base do Triangulo");
        this.base = entrada.nextDouble();

        System.out.println("Informe a altura do Triangulo");
        this.altura = entrada.nextDouble();

    }

    private void calcularArea(double altura, double base) {
        this.area = (base * altura) / 2;
    }

}