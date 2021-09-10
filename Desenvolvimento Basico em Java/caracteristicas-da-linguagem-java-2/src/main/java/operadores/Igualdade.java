package operadores;

public class Igualdade {
    public static void main(String[] ars) {
        final var numero = 11;

        if (numero == 10) {
            System.out.println("O numero é 10");
        } else {
            System.out.println("O numero não é 10");
        }
        if (numero != 10) {
            System.out.println("O numero não é 10");
        } else {
            System.out.println("O numero é 10");
        }
        final var letra = "B";
        if ("A".equals(letra)) {
            System.out.println("É a letra A");
        }
        if (!letra.equals("A"))
            System.out.println("Não é a letra A");
    }
}

