package dio.com.br.interfaces;

public class Gol implements Carro{

    @Override
    public String marca() {
        return "Volkswagem";
    }

    @Override
    public Double valor() {
        Double valor = 45000.0;
        return valor;
    }

}
