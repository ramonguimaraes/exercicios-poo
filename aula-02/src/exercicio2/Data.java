package exercicio2;

/*
2- Escreva uma classe chamada Data, com os seguintes atributos inteiros: dia, mês e
ano. Permita a entrada destes atributos verificando a consistência dessas datas, por
exemplo não aceitar 31, caso o mês seja 02. Crie uma classe para testar.
*/
public class Data {

    public int dia = 0;
    public int mes = 0;
    public int ano = 0;

    public boolean verificaData() {

        boolean diaValido = (dia >= 1 && dia <= 31);
        boolean mesValido = (mes >= 1 && mes <= 12);
        boolean anoValido = (ano > 0);
        boolean anoBisexto = verificaBisexto();

        if (diaValido && mesValido && anoValido) {
            if (mes == 2) {
                if (anoBisexto) {
                    return (dia <= 29);
                } else {
                    return (dia <= 28);
                }
            }
        }

        return false;

    }

    private boolean verificaBisexto() {

        if (ano % 4 == 0) {
            if (ano % 100 != 0){
                return true;
            } else if (ano % 400 == 0){
                return true;
            }
        }

        return false;

    }
}
