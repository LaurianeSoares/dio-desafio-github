package strings;

import java.util.Locale;

public class Strings {
    public static void main(String[] ars) {
        var nome = "André";
        var sobrenome = "Gomes";
        final var nomeCompleto = nome + " " + sobrenome;

        System.out.println(nome);
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Nome completo do Cliente: " + nomeCompleto);
        var string = new String(" Minha String ");

        System.out.println("Char na posição: " + string.charAt(5));
        System.out.println("Quantidade: " + string.length());
        System.out.println("Sem Trim [" + string + "]");
        System.out.println("Com Trim [" + string.trim() + "]");
        System.out.println("Lower " + string.toLowerCase());
        System.out.println("Upper " + string.toUpperCase());
        System.out.println("Contém M? " + string.contains("M"));
        System.out.println("Contém X? " + string.contains("X"));
        System.out.println("Replace " + string.replace("n", "$"));
        System.out.println("Equals? " + string.equals("Minha String "));
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTRING "));
        System.out.println("Substring(1,6) = " + string.substring(1, 6));

    }
}
