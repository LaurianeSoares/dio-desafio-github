package strings;

public class Exercicios {

    public static void main(String[] ars) {
        System.out.println("A B C D E F G".toCharArray());
        String frase = "Aula de Java";
        String[] spl = frase.split(" ");


        System.out.println(spl[0].concat(spl[1].concat(spl[2])));
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));
    }
}
