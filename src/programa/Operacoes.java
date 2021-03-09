package programa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Operacoes {

    public Operacoes() {
    }
    
    public void encerrarPrograma() {
        System.out.println("Programa encerrado!");
    }

    public void contarFor() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d", i + 1);
            System.out.println();
        }

    }

    public void contarWhile() {

        int contador = 0;

        while (contador <= 100) {
            System.out.printf("%d", contador++);
            ++contador;
            System.out.println();
        }

    }

    public void contarDoWhile() {

        int contador2 = 100;
        do {
            System.out.printf("%d", contador2);
            contador2--;
            System.out.println();
        } while (contador2 >= 0);

    }

    public void contarIfElseFor() {

        int num = 4;

        if (num == 4) {
            int total = 0;

            for (int n = 1; n <= 100; n += 2) {
                total += n;
            }
            System.out.printf("soma é: %d%n", total);
        }

    }

    public void numeroAleatorio() {

        Random numero_aleatorio = new Random();

        int n = numero_aleatorio.nextInt(500) + 1;
        System.out.println("Número aleatório é: " + n);

    }

    public void dataeHora() {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = new Date();
        System.out.println(df.format(data));

    }

}
