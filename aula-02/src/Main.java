import exercicio1.Triangulo;
import exercicio2.Data;
import exercicio3.Hora;

public class Main {
    public static void main(String[] args) {

        /*
        * Exercicio 1 Triangulo
        * */

        Triangulo triangulo = new Triangulo();

        triangulo.lerDados();
        triangulo.exibirInformacoes();

        /*
        * Exercicio 2 Data
        * */

        Data data = new Data();

        data.dia = 29;
        data.mes = 2;
        data.ano = 2000;

        System.out.println(data.verificaData());


        /*
        * Exercicio 3 Hora
        * */

        Hora hora = new Hora();

        hora.entradaHora();

    }
}