package br.edu.ifsp.list01;

/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/
public class Ex09 {

    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    String compute(int[] input) {
        int quantMaiorIdade=0;
        int quantIdosos=0;
        int somaIdades=0;
        int quantIdades=0;
        for (int j : input)
        {
            if(j < 0)
                break;
            if(j>17)
                quantMaiorIdade++;
            if(j>75)
                quantIdosos++;
            quantIdades++;
            somaIdades+= j;
        }
        double media = (double) somaIdades/quantIdades;
        double porcentagemIdosos= ((double) quantIdosos/quantIdades) * 100;
        return String.format(java.util.Locale.US, "%.2f %d %.2f%%", media, quantMaiorIdade, porcentagemIdosos);

    }
}
