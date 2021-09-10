package ifs;

public class IF {
    public static void main(String[] ars) {
        final var condicao = false;
        if (condicao) {
            System.out.println("A condição é verdadeira");
        } else {
            System.out.println("A condição é falsa");
        }

        if (condicao) {
            System.out.println("Uma unica linha...");
        }
        final var ternaria = condicao ? "é verdadeira" : "é falsa";
        System.out.println(ternaria);
    }
}
