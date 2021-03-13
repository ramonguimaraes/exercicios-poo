package exercicio3;

import java.util.Scanner;

/*
* 3- Escreva uma classe chamada Hora, com os seguintes atributos inteiros: hora, minutos
e segundo. Permita a entrada destes atributos somente se ele for uma hora válida.Crie
uma classe para testar.
* */
public class Hora {

    public int hora = 0;
    public int minuto = 0;
    public int segundo = 0;

    public void entradaHora() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Hora");
        int h = scanner.nextInt();

        System.out.println("Informe os minutos");
        int m = scanner.nextInt();

        System.out.println("Informe os segundos");
        int s = scanner.nextInt();

        if ((h >= 0 && h <= 23) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59)) {
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
            System.out.println("Hora valida: " + h + ":" + m + ":" + s);
        } else {
            System.out.println("Hora invalida");
        }
    }

}
