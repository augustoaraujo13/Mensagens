package programa;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Textos {

    private final String f1 = "O insucesso é apenas uma oportunidade "
            + "para recomeçar com mais inteligência..."
            + "  'Henry Ford'";

    private final String f2 = "Até cortar os próprios defeitos pode ser perigoso."
            + " Nunca se sabe qual é o defeito que "
            + "sustenta nosso edifício inteiro."
            + "  'Clarice Lispector'";

    private final String f3 = "As invenções são, sobretudo, "
            + "o resultado de um trabalho teimoso."
            + "  'Santos Dumont'";

    private final String f4 = "Criei um aparelho para unir a "
            + "humanidade, não para destruí-la."
            + "  'Santos Dumont'";

    private final String f5 = "Na luta pelo progresso, "
            + "só vale o sucesso."
            + "  'Santos Dumont'";

    private final String f6 = "Renda-se, como eu me rendi. Mergulhe no que você não conhece "
            + "como eu mergulhei. Não se preocupe em entender, "
            + "viver ultrapassa qualquer entendimento."
            + "  'Clarice Lispector'";

    private final String f7 = "Não tenho tempo pra mais nada, "
            + "ser feliz me consome muito."
            + "  'Clarice Lispector'";

    private final String f8 = "Pensar é o trabalho mais difícil que existe. "
            + "Talvez por isso tão poucos se dediquem a ele."
            + "  'Henry Ford'";

    private final String f9 = "Se o dinheiro for a sua esperança de independência,"
            + " você jamais a terá. A única segurança verdadeira consiste "
            + "numa reserva de sabedoria, de experiência e de competência."
            + "  'Henry Ford'";

    private final String f10 = "Não encontro defeitos. Encontro soluções. "
            + "Qualquer um sabe queixar-se."
            + "  'Henry Ford'";

    String[] lista = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10};

    private final int maxixmo = 35;
    private final int minino = 31;
    private final String CSI = "\u001B[";

    Random aleatorio = new Random();
    private final int cor = aleatorio.nextInt((maxixmo - minino) + 1) + minino;

    public Textos() {
    }

    public void hora() {

        Calendar cale = Calendar.getInstance();
        int hora = cale.get(Calendar.HOUR_OF_DAY);

        if (hora < 12) {

            System.out.print(CSI + cor + "m");
            System.out.print("Bom dia! ");
            System.out.println();
            System.out.print(CSI + cor + "m");
            List<String> frases = Arrays.asList(lista);
            System.out.println(frases.get(new Random().nextInt(frases.size())));
            System.out.println(CSI + "m");

        } else if (hora >= 12 && hora < 18) {

            System.out.print(CSI + cor + "m");
            System.out.print("Boa Tarde! ");
            System.out.println();
            System.out.print(CSI + cor + "m");
            List<String> frases = Arrays.asList(lista);
            System.out.println(frases.get(new Random().nextInt(frases.size())));
            System.out.println(CSI + "m");

        } else {
            System.out.print(CSI + cor + "m");
            System.out.print("Boa Noite! ");
            System.out.println();
            System.out.print(CSI + cor + "m");
            List<String> frases = Arrays.asList(lista);
            System.out.println(frases.get(new Random().nextInt(frases.size())));
            System.out.println(CSI + "m");
        }

    }

}
