package estrutura;

public class Main {

    public static void main(String[] args) {
        Frota<String> minhaFrota = new Frota<>();
        minhaFrota.incluir("alfa");
        minhaFrota.incluir("beta");

        System.out.println(minhaFrota);
    }
}
