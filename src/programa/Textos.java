package programa;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Textos {

    private String f1 = "O insucesso é apenas uma oportunidade "
            + "para recomeçar com mais inteligência..."
            + "  'Henry Ford'";

    private String f2 = "Até cortar os próprios defeitos pode ser perigoso."
            + " Nunca se sabe qual é o defeito que "
            + "sustenta nosso edifício inteiro."
            + "  'Clarice Lispector'";

    private String f3 = "As invenções são, sobretudo, "
            + "o resultado de um trabalho teimoso."
            + "  'Santos Dumont'";

    private String f4 = "Criei um aparelho para unir a "
            + "humanidade, não para destruí-la."
            + "  'Santos Dumont'";

    private String f5 = "Na luta pelo progresso, "
            + "só vale o sucesso."
            + "  'Santos Dumont'";

    private String f6 = "Renda-se, como eu me rendi. Mergulhe no que você não conhece "
            + "como eu mergulhei. Não se preocupe em entender, "
            + "viver ultrapassa qualquer entendimento."
            + "  'Clarice Lispector'";

    private String f7 = "Não tenho tempo pra mais nada, "
            + "ser feliz me consome muito."
            + "  'Clarice Lispector'";

    private String f8 = "Pensar é o trabalho mais difícil que existe. "
            + "Talvez por isso tão poucos se dediquem a ele."
            + "  'Henry Ford'";

    private String f9 = "Se o dinheiro for a sua esperança de independência,"
            + " você jamais a terá. A única segurança verdadeira consiste "
            + "numa reserva de sabedoria, de experiência e de competência."
            + "  'Henry Ford'";

    private String f10 = "Não encontro defeitos. Encontro soluções. "
            + "Qualquer um sabe queixar-se."
            + "  'Henry Ford'";

    String[] lista = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10};

    public Textos() {
    }

    public void hora() {

        Calendar cale = Calendar.getInstance();
        int hora = cale.get(Calendar.HOUR_OF_DAY);

        if (hora < 12) {

            System.out.print("Bom dia! ");
            System.out.println();
            List<String> frases = Arrays.asList(lista);
            System.out.println(frases.get(new Random().nextInt(frases.size())));

        } else if (hora >= 12 && hora < 18) {

            System.out.print("Boa Tarde! ");
            System.out.println();
            List<String> frases = Arrays.asList(lista);
            System.out.println(frases.get(new Random().nextInt(frases.size())));

        } else {

            System.out.print("Boa Noite! ");
            System.out.println();
            List<String> frases = Arrays.asList(lista);
            System.out.println(frases.get(new Random().nextInt(frases.size())));

        }

    }

    private String getF1() {
        return f1;
    }

    private void setF1(String f1) {
        this.f1 = f1;
    }

    private String getF2() {
        return f2;
    }

    private void setF2(String f2) {
        this.f2 = f2;
    }

    private String getF3() {
        return f3;
    }

    private void setF3(String f3) {
        this.f3 = f3;
    }

    private String getF4() {
        return f4;
    }

    private void setF4(String f4) {
        this.f4 = f4;
    }

    private String getF5() {
        return f5;
    }

    private void setF5(String f5) {
        this.f5 = f5;
    }

    private String getF6() {
        return f6;
    }

    private void setF6(String f6) {
        this.f6 = f6;
    }

    private String getF7() {
        return f7;
    }

    private void setF7(String f7) {
        this.f7 = f7;
    }

    private String getF8() {
        return f8;
    }

    private void setF8(String f8) {
        this.f8 = f8;
    }

    private String getF9() {
        return f9;
    }

    private void setF9(String f9) {
        this.f9 = f9;
    }

    private String getF10() {
        return f10;
    }

    private void setF10(String f10) {
        this.f10 = f10;
    }
}
