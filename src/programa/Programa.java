package programa;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Operacoes oper = new Operacoes();
        Textos txt = new Textos();
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Iniciou o programa.....");
            System.out.println();
            System.out.println("0 - Para encerrar o programa.");
            System.out.println("1 - Contar de 0 a 100."); //#for
            System.out.println("2 - Contar de 0 a 100 de 2 em 2."); //#while
            System.out.println("3 - Contar de 100 a 0."); //#Do while
            System.out.println("4 - A soma dos numeros de 0 a 100."); //If com #for
            System.out.println("5 - Para gerar um numero aleatório entre 0 e 500."); // #Random
            System.out.println("6 - Para ver a hora e a data atual."); // #DateFormat e Date
            System.out.println("7 - Para ver uma mensagem."); // # If , Else If, Else, Calendar,
            // List e Arrays
            System.out.println();
            System.out.println("Digite um numero: ");
            int num = teclado.nextInt();
            System.out.println("------------------------------------");

            switch (num) {

                case 0:
                    oper.encerrarPrograma();
                    break;

                case 1:
                    oper.contarFor();
                    break;

                case 2:
                    oper.contarWhile();
                    break;

                case 3:
                    oper.contarDoWhile();
                    break;

                case 4:
                    oper.contarIfElseFor();
                    break;

                case 5:
                    oper.numeroAleatorio();
                    break;

                case 6:
                    oper.dataeHora();
                    break;

                case 7:
                    txt.hora();
                    break;

                default:
                    System.out.println("OPS?! Número invalido!!"
                            + " Digite um numero entre 0 e 7");
                    break;

            }

        } catch (Exception e) {
            System.out.println("*ERRO*!!! Só é valido números inteiros."
                    + " Caracteres de texto, caracteres especiais e "
                    + "números reais não são aceitos!");
        }

    }

}
